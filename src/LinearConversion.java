/**
 * Evan's wacky zacky converter thing
 * Not for resale
 * Let cool before eating
 */

/**
 *
 * @author EvMcQ5970
 */
public class LinearConversion extends javax.swing.JFrame {

    /**
     * These are global variables
     * They sit here until they are ready to contribute to the program
     */
    
        
    double inches;
    double feet;
    double yards;
    double miles;
    
    double centi;
    double alsoCenti;
    double metres;
    double kilo;
    
    /**
     * Creates new form LinearConversion
     */
    public LinearConversion() {
        initComponents();
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        subOne = new javax.swing.JLabel();
        subTwo = new javax.swing.JLabel();
        subThree = new javax.swing.JLabel();
        subFour = new javax.swing.JLabel();
        convLabel1 = new javax.swing.JLabel();
        convLabel2 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 255));
        title.setText("Linear Conversion");

        subOne.setForeground(new java.awt.Color(51, 51, 51));
        subOne.setText("1. Inches to Centimetres");

        subTwo.setForeground(new java.awt.Color(51, 51, 51));
        subTwo.setText("2. Feet to Centimetres");

        subThree.setForeground(new java.awt.Color(51, 51, 51));
        subThree.setText("3. Yards to Metres");

        subFour.setForeground(new java.awt.Color(51, 51, 51));
        subFour.setText("4. Miles to Kilometres");

        convLabel1.setForeground(new java.awt.Color(51, 51, 51));
        convLabel1.setText("Enter conversion choice (1-4):");

        convLabel2.setForeground(new java.awt.Color(51, 51, 51));
        convLabel2.setText("Enter value to be converted:");

        button.setText("Convert!");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        output.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(92, 92, 92))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subFour)
                                    .addComponent(subThree)
                                    .addComponent(subTwo)
                                    .addComponent(subOne))
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(convLabel1)
                                    .addGap(16, 16, 16)))
                            .addComponent(convLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(field1))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subFour)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convLabel1)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convLabel2)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        // Variables!
        double choice, value, v;
        
        
        choice = Double.parseDouble(field1.getText());
        value = Double.parseDouble(field2.getText());
        
        // Just 'cause I felt like it
        v = value;        
        
        
        if ((int)choice == 1) {
            centi = inchesToCentimetres(v);
            output.setText("There are " + centi + " centimetres in " + value + " inches");            
        } else if ((int)choice == 2) {
            alsoCenti = feetToCentimetres(v);
            output.setText("There are " + alsoCenti + " centimetres in " + value + " feet");
        } else if ((int)choice == 3) {
            metres = yardsToMetres(v);
            output.setText("There are " + metres + " metres in " + value + " yards");
        } else if ((int)choice == 4) {
            kilo = milesToKilometres(v);
            output.setText("There are " + kilo + " kilometres in " + value + " miles");
        }
        
    }//GEN-LAST:event_buttonActionPerformed
    
    /**
     * 
     * Convert inches to centimeters
     * pre: none
     * post: returns the number of centimeters 
     * 
     * @param inches
     * @return 
     */
    
    public static double inchesToCentimetres(double inches) {
        
        double centi = inches * 2.54;
        return(centi);
        
    }
    
    /**
     * 
     * Convert feet to centimeters
     * pre: none
     * post: returns the number of centimeters
     * 
     * @param feet
     * @return 
     */
    
    
    
    public static double feetToCentimetres(double feet) {
        
        double alsoCenti = feet * 30;
        return(alsoCenti);
        
    }
    
    /**
     * 
     * Converts yards to meters
     * pre: none
     * post: returns the number of meters
     * 
     * @param yards
     * @return 
     */
    
    
    public static double yardsToMetres(double yards) {
        
        double metres = yards * 0.91;
        return(metres);
        
    }
    
    /**
     * 
     * Converts miles to kilometers
     * pre: none
     * post: returns the number of kilometers
     * 
     * @param miles
     * @return 
     */
    
    
    public static double milesToKilometres(double miles) {
        
        double kilo = miles * 1.6;
        return(kilo);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LinearConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinearConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinearConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinearConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinearConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton button;
    private javax.swing.JLabel convLabel1;
    private javax.swing.JLabel convLabel2;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel output;
    private javax.swing.JLabel subFour;
    private javax.swing.JLabel subOne;
    private javax.swing.JLabel subThree;
    private javax.swing.JLabel subTwo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
