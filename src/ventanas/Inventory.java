package ventanas;

/**
 *
 * @author espin
 */
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author espin
 */
public class Inventory implements Serializable {
    Objeto root;
    
    public Inventory(){
        root=null;
    }
    
    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

    public void clearAll(){
        root=null;
    }

    private int getHeight(Objeto objeto){
        return objeto == null? -1: objeto.getAltura();
    }

    private void updateHeight(Objeto objeto){
        objeto.setAltura(1 + getMaxHeight(getHeight(objeto.getLeftChild()),getHeight(objeto.getRightChild())));
    }

    private int getBalance(Objeto objeto){
        return(objeto==null)?0 : getHeight(objeto.getRightChild()) - getHeight(objeto.getLeftChild());
    }

    private int getMaxHeight(int leftHeight,int rightHeight){
        return leftHeight > rightHeight? leftHeight:rightHeight;
    }

    public Objeto leftChildRotation(Objeto objeto){
        Objeto rightChild=objeto.getRightChild();
        objeto.setRightChild(rightChild.getLeftChild());
        rightChild.setLeftChild(objeto);
        updateHeight(objeto);
        updateHeight(rightChild);
        return rightChild;
    }

    public Objeto rightChildRotation(Objeto objeto){
        Objeto leftChild=objeto.getLeftChild();
        objeto.setLeftChild(leftChild.getRightChild());
        leftChild.setRightChild(objeto);
        updateHeight(objeto);
        updateHeight(leftChild);
        return leftChild;
    }

    public Objeto rebalance(Objeto objeto){

        int balance = getBalance(objeto);

        if (balance< -1) {
            if (getBalance(objeto.getLeftChild()) <= 0) {    
                objeto = rightChildRotation(objeto);
            } else {                                
                objeto.setLeftChild(leftChildRotation(objeto.getLeftChild()));
                objeto = rightChildRotation(objeto);
            }
        }
        if (balance > 1) {
            if (getBalance(objeto.getRightChild()) >= 0) {  
              objeto = leftChildRotation(objeto);
            } else {
                objeto.setRightChild(rightChildRotation(objeto.getRightChild()));
              objeto = leftChildRotation(objeto);
            }
          }

        return objeto;
    }


    public void Insertar(String tipo, int id, int precDistribuidor, int precVenta, int cant){
        root = insertElement(tipo, id, precDistribuidor, precVenta, cant, root);
    }

    private Objeto insertElement(String tipo, int id, int precDistribuidor, int precVenta, int cant, Objeto objeto){
        if(objeto==null){
            return new Objeto(id,tipo,precDistribuidor,precVenta,cant);
        }

        if(objeto.getId() > id){
            objeto.setLeftChild(insertElement(tipo,id,precDistribuidor,precVenta,cant,objeto.getLeftChild()));
        }
        else if(objeto.getId() < id){
            objeto.setRightChild(insertElement(tipo, id, precDistribuidor, precVenta, cant, objeto.getRightChild()));
        }
        else{
            JOptionPane.showMessageDialog(null, "ID duplicado, inserte nuevo ID");
        }
        updateHeight(objeto);
        return rebalance(objeto);
    }

    public void Eliminar(int ref){
        root = delete(root, ref);
    }

    private Objeto delete(Objeto objeto, int id){
        if(objeto == null){
            return null;
        }

        else{
            if(objeto.getId() > id){
                objeto.setLeftChild(delete(objeto.getLeftChild(),id));
            }
            else if(objeto.getId() < id){
                objeto.setRightChild(delete(objeto.getRightChild(),id));
            }
            else if(objeto.getLeftChild()==null && objeto.getRightChild()==null){
                objeto=null;
            }

            else if(objeto.getLeftChild()==null){
                objeto = objeto.getRightChild();
            }else if(objeto.getRightChild()==null){
                objeto = objeto.getLeftChild();
            }

            else{
                Objeto maxLeftChild =maxLeftChild(objeto.getRightChild());
                objeto.setId(maxLeftChild.getId());
                objeto.setNombre(maxLeftChild.getNombre());
                objeto.setCantidad(maxLeftChild.getCantidad());
                objeto.setPrecio_distribuidor(maxLeftChild.getPrecio_distribuidor());
                objeto.setPrecio_venta(maxLeftChild.getPrecio_venta());

                objeto.setRightChild(delete(objeto.getRightChild(),maxLeftChild.getId()));
            }
        }
        if(objeto==null){
            return null;
        }
        updateHeight(objeto);
        return rebalance(objeto);
    }

    private Objeto maxLeftChild(Objeto objeto){
        Objeto current = objeto;
        while(current.getLeftChild()!=null){
            current = current.getLeftChild();
        }
        return current;
    }

    public void ModificarPrecioDistribuidor(int ref, int precioNuevo){
        search(ref).setPrecio_distribuidor(precioNuevo);
    }
    public void ModificarPrecioVenta(int ref, int precioNuevo){
        search(ref).setPrecio_venta(precioNuevo);
    }
    public void ModificarCantidad(int ref, int nuevaCantidad){
        search(ref).setCantidad(nuevaCantidad);
    }

    public Objeto search(int ref){
        Objeto searched = root;
        boolean check = false;
        while(searched != null && check!=true){
            if(searched.getId() < ref){
                searched = searched.getRightChild();
            }
            else if(searched.getId() > ref){
                searched = searched.getLeftChild();
            }
            else{
                break;
            }
        }
        return searched;
    }
    
    public Objeto searchByName(String ref){
        Objeto searched = root;
        while(searched != null){
            int compare = searched.getNombre().compareTo(ref);
            
            if(compare == 0){
                break;
            }
            else{
                if(compare < 0){
                    searched = searched.getRightChild();
                }
                else if(compare > 0){
                    searched = searched.getLeftChild();
                }
            }  
        }
        return searched;
    }
    public void print(Objeto printed, DefaultTableModel model){
        if(printed == null){
            return;
        }
        print(printed.getRightChild(),model);
        Object[] newRow = {printed.getId(),printed.getNombre(),printed.getPrecio_distribuidor(), printed.getPrecio_venta(),printed.getCantidad()};
        model.addRow(newRow);
        print(printed.getLeftChild(), model);
    }
    public void imprimirPedido(int tope, DefaultTableModel model) {
        PrintPedido(tope, root, model);
    }

    /* Metodo para imprimir el pedido de cada articulo */
    private void PrintPedido(int tope, Objeto producto, DefaultTableModel model) {
        if (producto == null) {
            return;
        }
        PrintPedido(tope, producto.getRightChild(), model);
        if (producto.getCantidad() < tope) {
            Object[] newRow = { producto.getId(), producto.getNombre(), producto.getCantidad(),
                    (tope - producto.getCantidad()), producto.getPrecio_distribuidor(),
                    (producto.getPrecio_distribuidor() * (tope - producto.getCantidad())) };
            model.addRow(newRow);

        }
        PrintPedido(tope, producto.getLeftChild(), model);
    }

}