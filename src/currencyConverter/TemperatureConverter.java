package currencyConverter;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author adolf
 */
public class TemperatureConverter extends javax.swing.JFrame {

    String[] unitsConvertion = {"Choose one...", "Celsius", "Fahrenheit", "Kelvin"};

    
    /**
     * Creates new form currencyConverter
     */
    public TemperatureConverter() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage (){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/alura_icon_IV.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldTemperatureToConvert = new javax.swing.JTextField();
        jComboBoxToUnitTemperature = new javax.swing.JComboBox<>();
        jLabelTemperatureConvertion = new javax.swing.JLabel();
        jLabelHelpTemperatureConvertion = new javax.swing.JLabel();
        jButtonPrevWindow = new javax.swing.JButton();
        jButtonRunTemperatureConverter = new javax.swing.JButton();
        jComboBoxFromUnitTemperature = new javax.swing.JComboBox<>();
        jLabelFromUnitTemperature = new javax.swing.JLabel();
        jTextFieldTemperatureConverted = new javax.swing.JTextField();
        jLabelToUnitTemperature = new javax.swing.JLabel();
        jLabelUnitTemperatureConverted = new javax.swing.JLabel();
        jLabelUnitTemperatureEntered = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jTextFieldTemperatureToConvert.setText("Enter Value");
        jTextFieldTemperatureToConvert.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldTemperatureToConvertFocusGained(evt);
            }
        });

        jComboBoxToUnitTemperature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Celsius", "Fahrenheit", "Kelvin" }));
        jComboBoxToUnitTemperature.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxToUnitTemperatureItemStateChanged(evt);
            }
        });

        jLabelTemperatureConvertion.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabelTemperatureConvertion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTemperatureConvertion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperatureConvertion.setText("Temperature convertion");
        jLabelTemperatureConvertion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelHelpTemperatureConvertion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHelpTemperatureConvertion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_help_outline_white_36.png"))); // NOI18N
        jLabelHelpTemperatureConvertion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHelpTemperatureConvertionMouseClicked(evt);
            }
        });

        jButtonPrevWindow.setText("Prev");
        jButtonPrevWindow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPrevWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrevWindowActionPerformed(evt);
            }
        });

        jButtonRunTemperatureConverter.setText("Run");
        jButtonRunTemperatureConverter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRunTemperatureConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunTemperatureConverterActionPerformed(evt);
            }
        });

        jComboBoxFromUnitTemperature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Celsius", "Fahrenheit", "Kelvin" }));
        jComboBoxFromUnitTemperature.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFromUnitTemperatureItemStateChanged(evt);
            }
        });

        jLabelFromUnitTemperature.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelFromUnitTemperature.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFromUnitTemperature.setText("From Unit Temperature Of");

        jTextFieldTemperatureConverted.setEditable(false);
        jTextFieldTemperatureConverted.setText("Enter Value");

        jLabelToUnitTemperature.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelToUnitTemperature.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToUnitTemperature.setText("To Unit Temperature Of");

        jLabelUnitTemperatureConverted.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelUnitTemperatureConverted.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUnitTemperatureConverted.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUnitTemperatureConverted.setText("Unit");

        jLabelUnitTemperatureEntered.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelUnitTemperatureEntered.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUnitTemperatureEntered.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUnitTemperatureEntered.setText("Unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFromUnitTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFromUnitTemperature)
                    .addComponent(jTextFieldTemperatureToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnitTemperatureEntered, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxToUnitTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelToUnitTemperature))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTemperatureConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUnitTemperatureConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTemperatureConvertion)
                .addGap(120, 120, 120)
                .addComponent(jLabelHelpTemperatureConvertion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButtonRunTemperatureConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPrevWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHelpTemperatureConvertion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelTemperatureConvertion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFromUnitTemperature)
                    .addComponent(jLabelToUnitTemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFromUnitTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxToUnitTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTemperatureToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTemperatureConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUnitTemperatureConverted, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnitTemperatureEntered, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrevWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRunTemperatureConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrevWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrevWindowActionPerformed

        this.toBack();
        setVisible(false);
        new SelectProgram().toFront();
        new SelectProgram().setState(java.awt.Frame.NORMAL);

    }//GEN-LAST:event_jButtonPrevWindowActionPerformed

    private void jButtonRunTemperatureConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunTemperatureConverterActionPerformed

        String actualCurrency;
        actualCurrency = jComboBoxFromUnitTemperature.getSelectedItem().toString();

        String convertionUnitCurrency;
        convertionUnitCurrency = jComboBoxToUnitTemperature.getSelectedItem().toString();
        
        if(jComboBoxFromUnitTemperature.getSelectedIndex()==0){           
            JOptionPane.showMessageDialog(null, "Select the unit of temperature entered", "Select the unit",JOptionPane.INFORMATION_MESSAGE);           
        }
        if(jComboBoxToUnitTemperature.getSelectedIndex() == 0){           
            JOptionPane.showMessageDialog(null, "Select the desired unit temperature to be converted", "Select the unit",JOptionPane.INFORMATION_MESSAGE);           
        }
        if(jTextFieldTemperatureToConvert.getText().equals("Enter Value")||jTextFieldTemperatureToConvert.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Type a temperature value to be converted", "Type  value temperature to be converted",JOptionPane.INFORMATION_MESSAGE);
        }

        /*
        if (actualCurrency.equals("Currency Convertion")) {
            this.toBack();
            currencyConverter cc = new currencyConverter();
            cc.setVisible(true);
            cc.toFront();
        } else if (programSelected.equals("Temperature Convertion")) {
            this.toBack();
            temperatureConverter tc = new temperatureConverter();
            tc.setVisible(true);
            tc.toFront();
        } else {
            JOptionPane.showMessageDialog(this, "Select a convertion program to run", "Make a selection", JOptionPane.ERROR_MESSAGE);
        }
         */
    }//GEN-LAST:event_jButtonRunTemperatureConverterActionPerformed

    private void jLabelHelpTemperatureConvertionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHelpTemperatureConvertionMouseClicked
        JOptionPane.showMessageDialog(this,
                "Instruccions of usage \n"
                + "1-.Select the unit of temperature entered \n"
                + "2-.Enter a value to be converted \n"
                + "3-.Select a temperature unit to be converted", "Help on usage", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabelHelpTemperatureConvertionMouseClicked

    private void jComboBoxFromUnitTemperatureItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFromUnitTemperatureItemStateChanged
        int position = jComboBoxFromUnitTemperature.getSelectedIndex();
        jLabelUnitTemperatureEntered.setText(unitsConvertion[position]);
    }//GEN-LAST:event_jComboBoxFromUnitTemperatureItemStateChanged

    private void jComboBoxToUnitTemperatureItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxToUnitTemperatureItemStateChanged
         int position = jComboBoxToUnitTemperature.getSelectedIndex();
        jLabelUnitTemperatureConverted.setText(unitsConvertion[position]);
    }//GEN-LAST:event_jComboBoxToUnitTemperatureItemStateChanged

    private void jTextFieldTemperatureToConvertFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTemperatureToConvertFocusGained
        jTextFieldTemperatureToConvert.setText("");
    }//GEN-LAST:event_jTextFieldTemperatureToConvertFocusGained

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
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrevWindow;
    private javax.swing.JButton jButtonRunTemperatureConverter;
    private javax.swing.JComboBox<String> jComboBoxFromUnitTemperature;
    private javax.swing.JComboBox<String> jComboBoxToUnitTemperature;
    private javax.swing.JLabel jLabelFromUnitTemperature;
    private javax.swing.JLabel jLabelHelpTemperatureConvertion;
    private javax.swing.JLabel jLabelTemperatureConvertion;
    private javax.swing.JLabel jLabelToUnitTemperature;
    private javax.swing.JLabel jLabelUnitTemperatureConverted;
    private javax.swing.JLabel jLabelUnitTemperatureEntered;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldTemperatureConverted;
    private javax.swing.JTextField jTextFieldTemperatureToConvert;
    // End of variables declaration//GEN-END:variables
}
