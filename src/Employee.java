import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Employee extends JFrame{

    private String name;

    private String firstName;


    public Employee() {
        affichageEmployee();

        setTitle("Page connection compte employé"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageEmployee() {

        JLabel titre2 = new JLabel();
        JTextField caseIdentifiant = new JTextField();
        JLabel identifiant = new JLabel();
        JPasswordField caseMotDePasse = new JPasswordField();
        JLabel motDePasse = new JLabel();
        JButton boutonDeConnection = new JButton();
        JLabel titre1 = new JLabel();
        JButton boutonRetour = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Arrête le code lorsque l'utilisateur clic sur la croix

        titre1.setFont(new Font("Calibri", 1, 12));
        titre1.setText("Page employé");

        titre2.setFont(new Font("Calibri", 1, 24));
        titre2.setText("Connectez vous :");

        identifiant.setFont(new Font("Calibri", 1, 18));
        identifiant.setText("Identifiant :");
        caseIdentifiant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { jTextField1ActionPerformed(evt); }
        });

        motDePasse.setFont(new Font("Calibri", 1, 18));
        motDePasse.setText("Mot de passe :");
        caseMotDePasse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        boutonDeConnection.setBackground(new Color(255, 204, 0));
        boutonDeConnection.setFont(new Font("Calibri", 1, 16));
        boutonDeConnection.setText("Se connecter");
        boutonDeConnection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        GroupLayout corpsEmployee = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsEmployee);
        corpsEmployee.setHorizontalGroup(
                corpsEmployee.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsEmployee.createSequentialGroup()
                                .addGroup(corpsEmployee.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(corpsEmployee.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(motDePasse)
                                                .addGap(18, 18, 18)
                                                .addComponent(caseMotDePasse, 160, 160, 160))
                                        .addGroup(corpsEmployee.createSequentialGroup()
                                                .addGap(220, 220, 220)
                                                .addComponent(boutonDeConnection)))
                                .addContainerGap(114, 114))
                        .addGroup(corpsEmployee.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(corpsEmployee.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsEmployee.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addGroup(corpsEmployee.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsEmployee.createSequentialGroup()
                                                                .addComponent(identifiant)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(caseIdentifiant, 160, 160, 160)
                                                                .addGap(120, 120, 120))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsEmployee.createSequentialGroup()
                                                                .addComponent(titre2)
                                                                .addGap(155, 155, 155))))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, corpsEmployee.createSequentialGroup()
                                                                .addComponent(boutonRetour)
                                                                .addGap(480, 480, 480))))
                                               .addGroup(corpsEmployee.createSequentialGroup())
                                               .addComponent(titre1)
        );
        corpsEmployee.setVerticalGroup(
                corpsEmployee.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsEmployee.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titre1)
                                .addGap(40, 40, 40)
                                .addComponent(titre2)
                                .addGap(40, 40, 40)
                                .addGroup(corpsEmployee.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(caseIdentifiant)
                                        .addComponent(identifiant))
                                .addGap(30, 30, 30)
                                .addGroup(corpsEmployee.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(caseMotDePasse)
                                        .addComponent(motDePasse))
                                .addGap(50, 50, 50)
                                .addComponent(boutonDeConnection)
                                .addContainerGap(28, 28))
                        .addGroup(GroupLayout.Alignment.TRAILING, corpsEmployee.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  // ???????
                                .addComponent(boutonRetour)
                                .addContainerGap())
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionBoutonRetour(java.awt.event.ActionEvent evt) {
        User user = new User();
        user.setVisible(true);
        this.hide();
    }

}
