/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.Icon;

/**
 * This class contains the GUI as well as interacts with the user
 * 
 * @author Tommy Yang, Thomas Le, Kou Xiong, Tenzin Dhargye
 */
public class Librarian extends javax.swing.JFrame {

    //declarations and initializations
    Icon tex= new ImageIcon(getClass().getResource("texas.jpg"));
    Icon harrypotter = new ImageIcon(getClass().getResource("harrypotter.jpg"));
    Icon eldest = new ImageIcon(getClass().getResource("eldest.jpg"));
    
    Icon mUni = new ImageIcon(getClass().getResource("MonstersUniversity.jpg"));
    Icon tAven = new ImageIcon(getClass().getResource("avengers.jpg"));
    Icon gGats = new ImageIcon(getClass().getResource("GreatGatsby.jpg"));
        
    Icon johnMayer= new ImageIcon(getClass().getResource("john mayer.jpg"));
    Icon brunoMars= new ImageIcon(getClass().getResource("bruno.jpg"));
    Icon maroon5= new ImageIcon(getClass().getResource("maroon 5.jpg"));
    
    File jM, bM, m5;
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip johnM,bruno,maroon;
            
    Book texas = new Book();
    Book hP = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 6.59, 1999, 1);
    Book eld = new Book("Eldest", "Christopher Paolini", 16.72, 2005, "Hardcover", 3, 704);
        
    AudioVisualMaterial monUni = new AudioVisualMaterial("Pixar", "Monsters University", 14.99, 2013, "DVD", mUni, null);
    AudioVisualMaterial theAven = new AudioVisualMaterial();
    AudioVisualMaterial theGG = new AudioVisualMaterial();
        
    AudioVisualMaterial light = new AudioVisualMaterial("John Mayer", "Where The Light Is", 5.87, 2008, "CD", johnMayer, johnM);
    AudioVisualMaterial jukebox = new AudioVisualMaterial();
    AudioVisualMaterial jane = new AudioVisualMaterial();
        
    
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
        imgPanel = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout imgPanelLayout = new javax.swing.GroupLayout(imgPanel);
        imgPanel.setLayout(imgPanelLayout);
        imgPanelLayout.setHorizontalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );
        imgPanelLayout.setVerticalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AR BERKLEY", 1, 36)); // NOI18N
        jLabel1.setText("The Coolest Library in Town");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookRadio)
                        .addGap(41, 41, 41)
                        .addComponent(dvdRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(cdRadio))
                    .addComponent(jScrollPane1)
                    .addComponent(itemList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookRadio)
                            .addComponent(dvdRadio)
                            .addComponent(cdRadio))
                        .addGap(18, 18, 18)
                        .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Displays information, item cover, and possibly sounds for the selected item
     * @param evt the event
     */
    private void itemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListActionPerformed
        
        
        if(bookRadio.isSelected() == true) {
            jukebox.stopSound();
            jane.stopSound();
            light.stopSound();
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
                    texas.setCover(tex);
                    imgLabel.removeAll();
                    imgLabel.setIcon(texas.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(texas.displayInfo());
                    break;
                case 2:
                    hP.setbkType("Paperback");
                    hP.setbkPage(320);
                    hP.setCover(harrypotter);
                    imgLabel.removeAll();
                    imgLabel.setIcon(hP.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(hP.displayInfo());
                    break;
                case 3:
                    eld.setCover(eldest);
                    imgLabel.removeAll();
                    imgLabel.setIcon(eld.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(eld.displayInfo());
                    break;
                default:
            }
        }
        
        if(dvdRadio.isSelected() == true) {
            jukebox.stopSound();
            jane.stopSound();
            light.stopSound();
            switch(itemList.getSelectedIndex()) {
                case 0: 
                    infoArea.setText(""); 
                    break;
                case 1: 
                    imgLabel.removeAll();
                    imgLabel.setIcon(monUni.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(monUni.displayInfo()); 
                    break;
                case 2: 
                    theAven.setTitle("The Avengers");
                    theAven.setAuthor("Marvel");
                    theAven.setPrice(14.99);
                    theAven.setYear(2012);
                    theAven.setCover(tAven);
                    imgLabel.removeAll();
                    imgLabel.setIcon(theAven.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(theAven.displayInfo()); 
                    break;
                case 3: 
                    theGG.setTitle("The Great Gatsby");
                    theGG.setAuthor("Warner Bros");
                    theGG.setPrice(8.96);
                    theGG.setYear(2013);
                    theGG.setCover(gGats);
                    imgLabel.removeAll();
                    imgLabel.setIcon(theGG.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
                    infoArea.setText(theGG.displayInfo());
                    break;
                default: 
            }
        }
        
        if(cdRadio.isSelected() == true){
            jukebox.stopSound();
            jane.stopSound();
            light.stopSound();
            switch(itemList.getSelectedIndex()){
                case 0:
                    infoArea.setText("");
                    break;
                case 1:
                    light.setCover(johnMayer);
                    imgLabel.removeAll();
                    imgLabel.setIcon(light.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
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
                    jukebox.setPrice(11.88);
                    jukebox.setYear(2012);
                    jukebox.setCover(brunoMars);
                    imgLabel.removeAll();
                    imgLabel.setIcon(jukebox.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
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
                    jane.setPrice(7.99);
                    jane.setYear(2002);
                    jane.setCover(maroon5);
                    imgLabel.removeAll();
                    imgLabel.setIcon(jane.displayCover());
                    imgLabel.validate();
                    imgLabel.repaint();
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
        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Book", "Texas Homeowners Association Law", "Harry Potter and the Sorcerer's Stone", "Eldest" }));
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
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JComboBox itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
