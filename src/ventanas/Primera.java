package ventanas;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author espin
 */
public class Primera extends javax.swing.JPanel {

    /**
     * Creates new form Primera
     */
    public Primera() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        nuevo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        cargar = new javax.swing.JLabel();
        linea = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1777, 997));
        setMinimumSize(new java.awt.Dimension(1777, 997));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1777, 997));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoInventarioPrimaria.png"))); // NOI18N
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });
        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 466, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPrimaria.png"))); // NOI18N
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 94, -1, -1));

        cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargarInventarioPrimaria.png"))); // NOI18N
        cargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cargarMousePressed(evt);
            }
        });
        add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 466, -1, -1));

        linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lineaSePrimaria.png"))); // NOI18N
        add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 447, -1, -1));
    }// </editor-fold>                        

    private void cargarMousePressed(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void cargarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        Inventory inv = new Inventory();
        Serialize<Inventory> sz = new Serialize<>();
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        
        if(archivo!=null){
            try {
                inv = sz.ReadObjectFromFile_AVL("data\\"+archivo.getName());
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Arreglo factura = new Arreglo(200);
        Inventario ventInv = new Inventario(inv,factura);
        Principal.ShowPanel(ventInv);
    }                                   

    private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        Inventory inv = new Inventory();
        Arreglo factura = new Arreglo(200);
        Inventario ventInv = new Inventario(inv,factura);
        Principal.ShowPanel(ventInv);
    }                                  


    // Variables declaration - do not modify                     
    private javax.swing.JLabel cargar;
    private javax.swing.JLabel linea;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nuevo;
    // End of variables declaration                   
}
