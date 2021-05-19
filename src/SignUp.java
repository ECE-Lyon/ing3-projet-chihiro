import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class SingUp extends JFrame {

    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    JLabel identifiant = new JLabel();
    JTextField caseIdentifiant = new JTextField();
    JLabel motDePasse = new JLabel();
    JPasswordField caseMotDePasse = new JPasswordField();
    JButton boutonDeConnection = new JButton();
    JButton boutonRetour= new JButton();

    public SingUp() {
        affichageSingUp();

        setTitle("Page incrption pour nouveau membre"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageSingUp() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titre1.setBackground(new Color(255, 255, 255));
        titre1.setFont(new Font("Calibri", 1, 12));
        titre1.setText("Page inscription");

        titre2.setFont(new Font("Calibri", 1, 24));
        titre2.setText("Inscrivez-vous :");

        identifiant.setFont(new Font("Calibri", 1, 18));
        identifiant.setText("Identifiant :");
        caseIdentifiant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionIdentifiant(evt);
            }
        });

        motDePasse.setFont(new Font("Calibri", 1, 18));
        motDePasse.setText("Mot de passe :");
        caseMotDePasse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionMotDePasse(evt);
            }
        });

        boutonDeConnection.setBackground(new Color(255, 204, 0));
        boutonDeConnection.setFont(new Font("Calibri", 1, 16));
        boutonDeConnection.setText("S'inscrire");
        boutonDeConnection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonInscription(evt);
            }
        });

        boutonRetour.setBackground(new Color(255, 255, 255));
        boutonRetour.setFont(new Font("Calibri", 1, 12));
        boutonRetour.setText("Retour");
        boutonRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonRetour(evt);
            }
        });

        // AFFICHAGE DU CORPS
        GroupLayout corpsSignUp = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsSignUp);
        corpsSignUp.setHorizontalGroup(
                corpsSignUp.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titre1))
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(titre2))
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(identifiant)
                                .addGap(18, 18, 18)
                                .addComponent(caseIdentifiant, 160, 160, 160))
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(motDePasse)
                                .addGap(18, 18, 18)
                                .addComponent(caseMotDePasse, 160, 160, 160))
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(boutonDeConnection))
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(boutonRetour))
        );

        corpsSignUp.setVerticalGroup(
                corpsSignUp.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsSignUp.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titre1)
                                .addGap(40, 40, 40)
                                .addComponent(titre2)
                                .addGap(40, 40, 40)
                                .addGroup(corpsSignUp.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(identifiant)
                                        .addComponent(caseIdentifiant))
                                .addGap(30, 30, 30)
                                .addGroup(corpsSignUp.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(motDePasse)
                                        .addComponent(caseMotDePasse))
                                .addGap(50, 50, 50)
                                .addComponent(boutonDeConnection)
                                .addGap(40, 40,40)
                                .addComponent(boutonRetour))
        );

        pack();
    }

    private void fonctionIdentifiant(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionMotDePasse(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionBoutonInscription(ActionEvent evt) {
        Choice choice = new Choice();
        choice.setVisible(true);
        this.hide();
    }

    private void fonctionBoutonRetour(ActionEvent evt) {
        User user = new User();
        user.setVisible(true);
        this.hide();
    }
}

