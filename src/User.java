import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class User extends JFrame{

    JButton boutonInscription = new JButton();
    JButton boutonEmployee = new JButton();
    JButton boutonMembre = new JButton();
    JButton boutonGuest = new JButton();
    JLabel titre3 = new JLabel();
    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    JPanel friseTitre = new JPanel();

    public User() {
        affichageUser();

        setTitle("Billetterie cinéma en ligne"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false); // Redimentionnement de la fenetre impossible
    }

    

    private void affichageUser() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // Arrête le code lorsque l'utilisateur clic sur la croix

        boutonInscription.setBackground(new Color(255, 255, 255));
        boutonInscription.setFont(new Font("Calibri", 1, 14));
        boutonInscription.setText("Inscription");
        boutonInscription.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { choixBoutonInscription(evt); }
        });

        boutonEmployee.setBackground(new Color(255, 255, 255));
        boutonEmployee.setFont(new Font("Calibri", 1, 14));
        boutonEmployee.setText("Employé");
        boutonEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { choixBoutonEmployee(evt); }
        });

        boutonMembre.setBackground(new Color(255, 255, 255));
        boutonMembre.setFont(new Font("Calibri", 1, 14));
        boutonMembre.setText("Membre");
        boutonMembre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { choixBoutonMembre(evt); }
        });

        boutonGuest.setBackground(new Color(255, 255, 255));
        boutonGuest.setFont(new Font("Calibri", 1, 14));
        boutonGuest.setText("Invité");
        boutonGuest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) { choixBoutonGuest(evt); }
        });

        titre1.setFont(new Font("Calibri", 1, 36));
        titre1.setText("Bienvenue sur AlloJava ");


        titre2.setFont(new Font("Calibri", 1, 16));
        titre2.setText("Billetterie en ligne de votre cinéma préféré");

        titre3.setFont(new Font("Calibri", 1, 18));
        titre3.setText("Se connecter en tant que :");

        friseTitre.setBackground(new Color(255, 204, 0));

        // AFFICHAGE DE L'EN-TÊTE
        GroupLayout headerUser = new GroupLayout(friseTitre);
        friseTitre.setLayout(headerUser);
        headerUser.setHorizontalGroup(
                headerUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerUser.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(titre1))
                        .addGroup(headerUser.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(titre2))
        );

        headerUser.setVerticalGroup(
                headerUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerUser.createSequentialGroup()
                                .addContainerGap(32, 32)
                                .addComponent(titre1)
                                .addGap(15, 15, 15)
                                .addComponent(titre2))
        );

        // AFFICHAGE DU CORPS
        GroupLayout corpsUser = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsUser);
        corpsUser.setHorizontalGroup(
                corpsUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsUser.createSequentialGroup()
                                .addComponent(friseTitre, 600, 600, 600))  // Longueur de la frise
                                .addGroup(corpsUser.createSequentialGroup()
                                        .addGap(470, 470, 470)
                                        .addComponent(boutonInscription))
                                .addGroup(corpsUser.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(titre3))
                                .addGroup(corpsUser.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(boutonEmployee)
                                        .addGap(60, 60, 60)
                                        .addComponent(boutonMembre)
                                        .addGap(60, 60, 60)
                                        .addComponent(boutonGuest))

        );

        corpsUser.setVerticalGroup(
                corpsUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsUser.createSequentialGroup()
                                .addComponent(friseTitre, 140, 140, 140) // Hauteur de la frise
                                .addGap(10, 10, 10)
                                .addComponent(boutonInscription)
                                .addGap(30, 30, 30)
                                .addComponent(titre3)
                                .addGap(40, 40, 40)
                                .addGroup(corpsUser.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(boutonMembre, 37, 37, 37)
                                        .addComponent(boutonEmployee, 37, 37, 37)
                                        .addComponent(boutonGuest, 37, 37, 37)))
        );


    }

    private void choixBoutonEmployee(ActionEvent evt) {
        Employee employee = new Employee();
        employee.setVisible(true);
        this.hide();

    }

    private void choixBoutonMembre(ActionEvent evt) {
        Member membre = new Member();
        membre.setVisible(true);
        this.hide();

    }

    private void choixBoutonGuest(ActionEvent evt) {
        Guest guest = new Guest();
        guest.setVisible(true);
        this.hide();

    }

    private void choixBoutonInscription(ActionEvent evt) {
        SingUp singUp = new SingUp();
        singUp.setVisible(true);
        this.hide();

    }



}
