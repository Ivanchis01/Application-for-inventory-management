package ventanas;

/**
 *
 * @author espin
 */
public class Calculadora extends javax.swing.JPanel {

    /**
     * Creates new form Calculadora
     */
    private float primerNumero,segundoNumero;
    private String operador;
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private String sinCero(float resultado){
        String retorno;
        retorno = Float.toString(resultado);
        if(resultado%1 == 0){
            retorno=retorno.substring(0,retorno.length()-2);
        }
        return retorno;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        casilla = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setMaximumSize(new java.awt.Dimension(615, 566));
        setMinimumSize(new java.awt.Dimension(615, 566));
        setPreferredSize(new java.awt.Dimension(615, 566));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        casilla.setForeground(new java.awt.Color(51, 51, 51));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 143, 143)));
        casilla.setOpaque(true);
        add(casilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, 80));

        jButton2.setBackground(new java.awt.Color(250, 250, 250));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("C");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 80));

        jButton3.setBackground(new java.awt.Color(250, 250, 250));
        jButton3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("/");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 80));

        jButton4.setBackground(new java.awt.Color(250, 250, 250));
        jButton4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("*");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, 80));

        jButton5.setBackground(new java.awt.Color(250, 250, 250));
        jButton5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("-");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 130, 80));

        jButton6.setBackground(new java.awt.Color(250, 250, 250));
        jButton6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("7");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 80));

        jButton7.setBackground(new java.awt.Color(250, 250, 250));
        jButton7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("8");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 80));

        jButton8.setBackground(new java.awt.Color(250, 250, 250));
        jButton8.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("9");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 80));

        jButton9.setBackground(new java.awt.Color(250, 250, 250));
        jButton9.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 51));
        jButton9.setText("+");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 130, 170));

        jButton10.setBackground(new java.awt.Color(250, 250, 250));
        jButton10.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 51));
        jButton10.setText("4");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 80));

        jButton12.setBackground(new java.awt.Color(250, 250, 250));
        jButton12.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setText("6");
        jButton12.setBorder(null);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 130, 80));

        jButton13.setBackground(new java.awt.Color(250, 250, 250));
        jButton13.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 51));
        jButton13.setText("5");
        jButton13.setBorder(null);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, 80));

        jButton14.setBackground(new java.awt.Color(250, 250, 250));
        jButton14.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 51));
        jButton14.setText("1");
        jButton14.setBorder(null);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 80));

        jButton15.setBackground(new java.awt.Color(250, 250, 250));
        jButton15.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(51, 51, 51));
        jButton15.setText("=");
        jButton15.setBorder(null);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 130, 170));

        jButton16.setBackground(new java.awt.Color(250, 250, 250));
        jButton16.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 51, 51));
        jButton16.setText("2");
        jButton16.setBorder(null);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, 80));

        jButton17.setBackground(new java.awt.Color(250, 250, 250));
        jButton17.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 51, 51));
        jButton17.setText("3");
        jButton17.setBorder(null);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 130, 80));

        jButton18.setBackground(new java.awt.Color(250, 250, 250));
        jButton18.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 51, 51));
        jButton18.setText("0");
        jButton18.setBorder(null);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 270, 80));

        jButton20.setBackground(new java.awt.Color(250, 250, 250));
        jButton20.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 51, 51));
        jButton20.setText(".");
        jButton20.setBorder(null);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, 80));
    }// </editor-fold>                        

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"0");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"1");
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"2");
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"3");
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"4");
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"5");
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"6");
    }                                         

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"7");
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"8");
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.casilla.setText(this.casilla.getText()+"9");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.casilla.setText("");
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador ="+";
        this.casilla.setText("");
    }                                        

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.segundoNumero = Float.parseFloat(this.casilla.getText());
        switch(operador){
            case "+":
                this.casilla.setText(sinCero(this.primerNumero + this.segundoNumero));
                break;
            case "-":
                this.casilla.setText(sinCero(this.primerNumero - this.segundoNumero));
                break;
            case "*":
                this.casilla.setText(sinCero(this.primerNumero * this.segundoNumero));
                break;
            case "/":
                this.casilla.setText(sinCero(this.primerNumero / this.segundoNumero));
                break;
        }
    }                                         

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador ="-";
        this.casilla.setText("");
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador ="*";
        this.casilla.setText("");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador ="/";
        this.casilla.setText("");
    }                                        

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(!(this.casilla.getText().contains("."))){
            this.casilla.setText(this.casilla.getText()+".");
        }
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JLabel casilla;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration                   
}