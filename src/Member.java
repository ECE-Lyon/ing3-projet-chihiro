import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Member extends JFrame {

    private String name;

    private String firstName;

    private String email;

    private String password;

    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    JLabel identifiant = new JLabel();
    JTextField caseIdentifiant = new JTextField();
    JLabel motDePasse = new JLabel();
    JPasswordField caseMotDePasse = new JPasswordField();
    JButton boutonDeConnection = new JButton();
    JButton boutonRetour= new JButton();

    public Member() {
        affichageMember();

        setTitle("Page connection compte employé"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageMember() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titre1.setBackground(new Color(255, 255, 255));
        titre1.setFont(new Font("Calibri", 1, 12));
        titre1.setText("Page membre");

        titre2.setFont(new Font("Calibri", 1, 24));
        titre2.setText("Connectez vous :");

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
        boutonDeConnection.setText("Se connecter");
        boutonDeConnection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonDeConnexion(evt);
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
        GroupLayout corpsMember = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsMember);
        corpsMember.setHorizontalGroup(
                corpsMember.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titre1))
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(titre2))
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(identifiant)
                                .addGap(18, 18, 18)
                                .addComponent(caseIdentifiant, 160, 160, 160))
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(motDePasse)
                                .addGap(18, 18, 18)
                                .addComponent(caseMotDePasse, 160, 160, 160))
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(boutonDeConnection))
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(boutonRetour))
        );

        corpsMember.setVerticalGroup(
                corpsMember.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMember.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titre1)
                                .addGap(40, 40, 40)
                                .addComponent(titre2)
                                .addGap(40, 40, 40)
                                .addGroup(corpsMember.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(identifiant)
                                        .addComponent(caseIdentifiant))
                                .addGap(30, 30, 30)
                                .addGroup(corpsMember.createParallelGroup(GroupLayout.Alignment.BASELINE)
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

    private void fonctionBoutonDeConnexion(ActionEvent evt) {
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
