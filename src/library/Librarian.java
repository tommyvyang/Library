/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.applet.AudioClip;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author Tommy
 */
public class Librarian extends javax.swing.JFrame {

    // test class by Kou
//    Image avImage;
//    AudioClip avAud;
//    AudioVisualMaterial monUni = new AudioVisualMaterial("DVD", avImage, avAud);
//    int[] intMaterial = new int[3];
    
//    public void testClassMethod()
//    {
//      for (int i : intMaterial)
//      {
//        avMat[i] = new AudioVisualMaterial("DVD", avImage[i], avAud[i] );
//      }
      
//    }
    // end of test class. delete whenever.
    
    /**
     * Creates new form Librarian
     */
    public Librarian() {
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

        categoryGroup = new javax.swing.ButtonGroup();
        itemList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        bookRadio = new javax.swing.JRadioButton();
        dvdRadio = new javax.swing.JRadioButton();
        cdRadio = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Category" }));
        itemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListActionPerformed(evt);
            }
        });

        infoArea.setEditable(false);
        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        categoryGroup.add(bookRadio);
        bookRadio.setText("Books");
        bookRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRadioActionPerformed(evt);
            }
        });

        categoryGroup.add(dvdRadio);
        dvdRadio.setText("DVDs");
        dvdRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvdRadioActionPerformed(evt);
            }
        });

        categoryGroup.add(cdRadio);
        cdRadio.setText("CDs");
        cdRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(dvdRadio)
                        .addGap(38, 38, 38)
                        .addComponent(cdRadio))
                    .addComponent(itemList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookRadio)
                            .addComponent(dvdRadio)
                            .addComponent(cdRadio))
                        .addGap(18, 18, 18)
                        .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListActionPerformed
        LibraryMaterial texas = new Book();
        LibraryMaterial hP = new Book();
        LibraryMaterial eld = new Book();
        LibraryMaterial monUni = new AudioVisualMaterial();
        LibraryMaterial theAven = new AudioVisualMaterial();
        LibraryMaterial theGG = new AudioVisualMaterial();
        LibraryMaterial light = new AudioVisualMaterial();
        LibraryMaterial jukebox = new AudioVisualMaterial();
        LibraryMaterial jane = new AudioVisualMaterial();
        
        File jM, bM, m5;
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip johnM,bruno,maroon;
            
        
        if(bookRadio.isSelected() == true) {
            switch(itemList.getSelectedIndex()){
                case 0:
                    infoArea.setText("");
                    break;
                case 1:
                    texas.setTitle("Texas Homeowners Association Law");
                    texas.setAuthor("Gregory S. Cagle");
                    texas.setYear(2013);
                    texas.setbkEdition(2);
                    texas.setbkType("Paperback");
                    texas.setbkPage(822);
                    texas.setPrice(37.74);                   
                    infoArea.setText(texas.displayInfo());
                    break;
                case 2:
                    hP.setTitle("Harry Potter and the Sorcerer's Stone");
                    hP.setAuthor("J.K. Rowling");
                    hP.setYear(1999);
                    hP.setbkEdition(1);
                    hP.setbkType("Paperback");
                    hP.setbkPage(320);
                    hP.setPrice(6.59);
                    infoArea.setText(hP.displayInfo());
                    break;
                case 3:
                    eld.setTitle("Eldest");
                    eld.setAuthor("Christopher Paolini");
                    eld.setYear(2005);
                    eld.setbkEdition(3);
                    eld.setbkType("Hardcover");
                    eld.setbkPage(704);
                    eld.setPrice(16.72);
                    infoArea.setText(eld.displayInfo());
                    break;
                default:
            }
        }
        
        if(dvdRadio.isSelected() == true) {
            switch(itemList.getSelectedIndex()) {
                case 0: 
                    infoArea.setText(""); 
                    break;
                case 1: 
                    monUni.setTitle("Monsters University");
                    monUni.setAuthor("Pixar");
                    monUni.setYear(2013);
                    infoArea.setText(monUni.displayInfo()); 
                    break;
                case 2: 
                    theAven.setTitle("The Avengers");
                    theAven.setAuthor("Marvel");
                    theAven.setYear(2012);
                    infoArea.setText(theAven.displayInfo()); 
                    break;
                case 3: 
                    theGG.setTitle("The Great Gatsby");
                    theGG.setAuthor("");
                    theGG.setYear(2013);
                    infoArea.setText(theGG.displayInfo());
                    break;
                default: 
            }
        }
        
        if(cdRadio.isSelected() == true){
            switch(itemList.getSelectedIndex()){
                case 0:
                    infoArea.setText("");
                    break;
                case 1:
                    light.setTitle("Where The Light Is");
                    light.setAuthor("John Mayer");
                    light.setYear(2008);
                    infoArea.setText(light.displayInfo());
                    try {
                        stream = AudioSystem.getAudioInputStream(new File("src//library//Bold As Love.wav"));
                        format = stream.getFormat();
                        info = new DataLine.Info(Clip.class, format);
                        johnM = (Clip) AudioSystem.getLine(info);
                        johnM.open(stream);
                        light.setSound(johnM);
                        }
                    catch (Exception e) {
                            System.out.println("here");
                        }
                    light.playSound();
                    break;
                case 2:
                    jukebox.setTitle("Unorthodox Jukebox");
                    jukebox.setAuthor("Bruno Mars");
                    jukebox.setYear(2012);
                    infoArea.setText(jukebox.displayInfo());
                    try {
                        stream = AudioSystem.getAudioInputStream(new File("src//library//Locked Out Of Heaven.wav"));
                        format = stream.getFormat();
                        info = new DataLine.Info(Clip.class, format);
                        bruno = (Clip) AudioSystem.getLine(info);
                        bruno.open(stream);
                        jukebox.setSound(bruno);
                        }
                    catch (Exception e) {
                            System.out.println("here");
                        }
                    jukebox.playSound();
                    break;
                case 3:
                    jane.setTitle("Songs About Jane");
                    jane.setAuthor("Maroon 5");
                    jane.setYear(2002);
                    infoArea.setText(jane.displayInfo());
                    try {
                        stream = AudioSystem.getAudioInputStream(new File("src//library//Sunday Morning.wav"));
                        format = stream.getFormat();
                        info = new DataLine.Info(Clip.class, format);
                        maroon = (Clip) AudioSystem.getLine(info);
                        maroon.open(stream);
                        jane.setSound(maroon);
                        }
                    catch (Exception e) {
                            System.out.println("here");
                        }
                    jane.playSound();
                    break;
                default:
            }
        }
    }//GEN-LAST:event_itemListActionPerformed

    /**
     * Changes list to books
     * @param evt the event
     */
    private void bookRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRadioActionPerformed
        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Book", "Texas Home Owners", "Harry Potter", "Eldest" }));
    }//GEN-LAST:event_bookRadioActionPerformed

    /**
     * Changes list to DVDs
     * @param evt the event
     */
    private void dvdRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvdRadioActionPerformed
        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a DVD", "Monsters University", "The Avengers", "The Great Gatsby" }));
    }//GEN-LAST:event_dvdRadioActionPerformed

    /**
     * Changes list to CDs
     * @param evt the event
     */
    private void cdRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRadioActionPerformed
        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a CD", "Where The Light Is", "Unorthodox Jukebox", "Songs About Jane" }));
    }//GEN-LAST:event_cdRadioActionPerformed

    /**
     * Exits application when exit button is clicked
     * @param evt The event
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Librarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bookRadio;
    private javax.swing.ButtonGroup categoryGroup;
    private javax.swing.JRadioButton cdRadio;
    private javax.swing.JRadioButton dvdRadio;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JComboBox itemList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
