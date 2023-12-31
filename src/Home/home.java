/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Pacman.PacMan;
import Pacman.PlaySound;
import Pacman.Player;
import Rank.Rank;
import Register.Register;
import SignIn.SignIn;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public final class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    int id;
    boolean music = true;
    boolean mouse = true;

    String status = "Enabled sound";

    public home() {
        this.setTitle("Home");
        initComponents();
        setBounds(0, 0, 1150, 850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    public home(Player p) {
        this.setTitle("Home");
        initComponents();
        setBounds(0, 0, 1150, 850);
        id = p.getId_nguoichoi();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Đăng kí");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 140, 42);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Đăng xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 10, 140, 42);

        jPanel1.setBackground(new java.awt.Color(12, 102, 103));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/137322576_234040788097888_1351706914099467358_n - Copy.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 50, 610, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/137322576_234040788097888_1351706914099467358_n - Copy (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 0, 340, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 140, 610, 410);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\Home\\50_-_Game_Manual_games_play_fun_-512.png")); // NOI18N
        jLabel2.setVisible(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 10, 54, 58);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/137322576_234040788097888_1351706914099467358_n.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 630, 200, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\Home\\Leader-512.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1030, 100, 65, 65);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\Home\\game-setting-4-959731.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1030, 200, 60, 65);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\Home\\pngtree-game-button-switch-start-game-icon-png-image_2137850.jpg")); // NOI18N
        jButton3.setText("PLAY");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(650, 630, 200, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\Home\\PAC_MAN_NEON_SIGN_1024x1024.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1120, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        playmusic();
        Register r = new Register();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showJFrameDemo() {
        JFrame mainFrame;
        JLabel headerLabel;

        mainFrame = new JFrame("Setting");
        mainFrame.setSize(400, 275);
        mainFrame.setLayout(new FlowLayout());

        headerLabel = new JLabel("", JLabel.CENTER);
        headerLabel.setText("Setting game sound");
        Font font = new Font("SansSerif", Font.BOLD, 32);
        headerLabel.setFont(font);

        JButton background = new JButton("unmute");
        ImageIcon anh1 = new ImageIcon("src/Home/158043267_1062220314288418_8069669939015668546_n.jpg");
        ImageIcon anh2 = new ImageIcon("src/Home/158653123_468382224201915_2997143686939429361_n.jpg");
        ImageIcon anh3 = new ImageIcon("src/Home/158330622_760491014875458_5195846703200841263_n.jpg");
        ImageIcon anh4 = new ImageIcon("src/Home/158797619_439006387353652_788866575752782419_n.jpg");

        background.setPreferredSize(new Dimension(100, 100));
        background.addActionListener((ActionEvent e) -> {
            if (background.getText().equals("unmute")) {
                music = false;
                background.setText("mute");
                background.setIcon(anh2);
            } else {
                music = true;
                background.setText("unmute");
                background.setIcon(anh1);
            }
        });

        JLabel nothing = new JLabel();
        nothing.setPreferredSize(new Dimension(50, 100));

        JButton ingame = new JButton("unmute");
        ingame.setPreferredSize(new Dimension(100, 100));
        ingame.addActionListener((ActionEvent e) -> {
            if (ingame.getText().equals("unmute")) {
                mouse = false;
                ingame.setText("mute");
                ingame.setIcon(anh4);
            } else {
                mouse = true;
                ingame.setText("unmute");
                ingame.setIcon(anh3);
            }
        });

        JButton back = new JButton("Back");
        back.setPreferredSize(new Dimension(150, 50));
        back.addActionListener((ActionEvent e) -> {
            mainFrame.dispose();
        });

        mainFrame.add(headerLabel);
        mainFrame.add(background);
        mainFrame.add(nothing);
        mainFrame.add(ingame);
        mainFrame.add(back);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        playmusic();
        JOptionPane.showMessageDialog(this, "Bạn dã đăng xuất");
        SignIn s = new SignIn();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        playmusic();
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        playmusic();
        if (jPanel1.isVisible() == false) {
            JFrame frame = new JFrame();
            int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to close the game?", "Please Confirm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
        jPanel1.setVisible(false);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        playmusic();
        Rank r = new Rank(id);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        playmusic();
        showJFrameDemo();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        playmusic();
        new PacMan(id, music).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        playmusic();
    }//GEN-LAST:event_formMouseClicked

    public void playmusic() {
        if (mouse) {
            PlaySound playsound = new PlaySound("mixkit-modern-technology-select-3124.wav");
            Thread t = new Thread(playsound);
            t.start();
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
