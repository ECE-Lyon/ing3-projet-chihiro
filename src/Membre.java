import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Membre extends JFrame {

    public enum FidelityCard {
        ENFANT,
        ETUDIANT,
        ADULTE,
        SENIOR,
    }

    private String name;

    private String firstName;

    private String email;

    private String password;

    private FidelityCard fidelityCard;

    public Membre() {
        affichageMembre();

        setTitle("Page connection compte employé"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageMembre() {


        JLabel titre1 = new JLabel();
        JLabel titre2 = new JLabel();
        JLabel identifiant = new JLabel();
        JTextField caseIdentifiant = new JTextField();
        JLabel motDePasse = new JLabel();
        JPasswordField caseMotDePasse = new JPasswordField();
        JButton boutonDeConnection = new JButton();
        JButton boutonRetour= new JButton();

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
        GroupLayout corpsMembre = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsMembre);
        corpsMembre.setHorizontalGroup(
                corpsMembre.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMembre.createSequentialGroup()
                                .addGroup(corpsMembre.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(corpsMembre.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(motDePasse)
                                                .addGap(18, 18, 18)
                                                .addComponent(caseMotDePasse, 160, 160, 160))
                                        .addGroup(corpsMembre.createSequentialGroup()
                                                .addGap(220, 220, 220)
                                                .addComponent(boutonDeConnection)))
                                .addContainerGap(114, 114))
                        .addGroup(corpsMembre.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(corpsMembre.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsMembre.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addGroup(corpsMembre.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsMembre.createSequentialGroup()
                                                                .addComponent(identifiant)
                                                                .addGap(21, 21, 21)
                                                                .addComponent(caseIdentifiant, 160, 160, 160)
                                                                .addGap(122, 122, 122))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsMembre.createSequentialGroup()
                                                                .addComponent(titre2)
                                                                .addGap(155, 155, 155))))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsMembre.createSequentialGroup()
                                                                .addComponent(boutonRetour)
                                                                .addGap(480, 480, 480))))
                                        .addGroup(corpsMembre.createSequentialGroup())
                                                .addComponent(titre1)

        );
        corpsMembre.setVerticalGroup(
                corpsMembre.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMembre.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titre1)
                                .addGap(40, 40, 40)
                                .addComponent(titre2)
                                .addGap(40, 40, 40)
                                .addGroup(corpsMembre.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(caseIdentifiant)
                                        .addComponent(identifiant))
                                .addGap(30, 30, 30)
                                .addGroup(corpsMembre.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(caseMotDePasse)
                                        .addComponent(motDePasse))
                                .addGap(50, 50, 50)
                                .addComponent(boutonDeConnection)
                                .addGap(28, 28,28))
                        .addGroup(GroupLayout.Alignment.TRAILING, corpsMembre.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  // ???????
                                .addComponent(boutonRetour)
                                .addContainerGap())
        );

        pack();
    }

    private void fonctionIdentifiant(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionMotDePasse(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionBoutonDeConnexion(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionBoutonRetour(java.awt.event.ActionEvent evt) {
        User user = new User();
        user.setVisible(true);
        this.hide();
    }
}
