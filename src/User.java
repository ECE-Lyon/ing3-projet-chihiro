import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.*;
import javax.swing.*;

public class User extends JFrame{

    public User() {
        affichageUser();

        setTitle("Billetterie cinéma en ligne"); // Définit un titre
        setSize(600,400); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false); // Redimentionnement de la fenetre impossible
    }

    

    private void affichageUser() {

        JPanel jPanel2 = new JPanel();                                                                                     // SERT A RIEN
        JButton boutonEmployee = new JButton();
        JButton boutonMembre = new JButton();
        JButton boutonGuest = new JButton();
        JLabel titre3 = new JLabel();
        JLabel titre1 = new JLabel();
        JLabel titre2 = new JLabel();
        JPanel friseTitre = new JPanel();


        /*GroupLayout Window = new GroupLayout(jPanel2);                                                                   //SERT A RIEN ?
        jPanel2.setLayout(Window);
        Window.setHorizontalGroup(Window.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(100, 100, 100));
        Window.setVerticalGroup(Window.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(100, 100, 100)); */

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // Arrête le code lorsque l'utilisateur clic sur la croix

        boutonEmployee.setBackground(new Color(255, 255, 255));
        boutonEmployee.setFont(new Font("Calibri", 1, 14));
        boutonEmployee.setText("Employé");
        boutonEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixBoutonEmployee(evt);
            }
        });

        boutonMembre.setBackground(new Color(255, 255, 255));
        boutonMembre.setFont(new Font("Calibri", 1, 14));
        boutonMembre.setText("Membre");
        boutonMembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixBoutonMembre(evt);
            }
        });

        boutonGuest.setBackground(new java.awt.Color(255, 255, 255));
        boutonGuest.setFont(new java.awt.Font("Calibri", 1, 14));
        boutonGuest.setText("Invité");
        boutonGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixBoutonGuest(evt);
            }
        });

        titre1.setFont(new java.awt.Font("Calibri", 1, 36));
        titre1.setText("Bienvenue sur AlloJava ");
        titre1.setPreferredSize(new java.awt.Dimension(100, 14));

        titre2.setFont(new java.awt.Font("Calibri", 1, 16));
        titre2.setText("Billetterie en ligne de votre cinéma préféré");

        titre3.setFont(new java.awt.Font("Calibri", 1, 18));
        titre3.setText("Se connecter en tant que :");

        friseTitre.setBackground(new java.awt.Color(255, 204, 0));

        // AFFICHAGE DE L'EN-TÊTE
        GroupLayout HeaderUser = new GroupLayout(friseTitre);
        friseTitre.setLayout(HeaderUser);
        HeaderUser.setHorizontalGroup(
                HeaderUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HeaderUser.createSequentialGroup()
                                .addGap(70, 70, 70)   // Placement du Titre1
                                .addComponent(titre1)  // Affiche l'intégralité du titre
                                .addContainerGap(250, 250))
                        .addGroup(GroupLayout.Alignment.TRAILING, HeaderUser.createSequentialGroup()
                                .addContainerGap(150,150)
                                .addComponent(titre2)
                                .addGap(100, 100, 100))
        );
        HeaderUser.setVerticalGroup(
                HeaderUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, HeaderUser.createSequentialGroup()
                                .addContainerGap(32, 32)
                                .addComponent(titre1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titre2)
                                .addGap(30, 30, 30))
        );

        // AFFICHAGE DU CORPS
        GroupLayout CorpsUser = new GroupLayout(getContentPane());
        getContentPane().setLayout(CorpsUser);
        CorpsUser.setHorizontalGroup(
                CorpsUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(CorpsUser.createSequentialGroup()
                                .addComponent(friseTitre, 600, 600, 600)  // Longueur de la frise
                                .addGap(0, 0, 0))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorpsUser.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(CorpsUser.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorpsUser.createSequentialGroup()
                                                .addComponent(boutonEmployee)
                                                .addGap(60, 60, 60)
                                                .addComponent(boutonMembre)
                                                .addGap(60, 60, 60)
                                                .addComponent(boutonGuest)
                                                .addGap(100, 100, 100))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorpsUser.createSequentialGroup()
                                                .addComponent(titre3)
                                                .addGap(170, 170, 170))))
        );
        CorpsUser.setVerticalGroup(
                CorpsUser.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(CorpsUser.createSequentialGroup()
                                .addComponent(friseTitre, 140, 140, 140) // Hauteur de la frise
                                .addGap(50, 50, 50)  // Espace entre la frise et Titre3
                                .addComponent(titre3)
                                .addGap(50, 50, 50)  // Espace entre Titre3 et les boutons
                                .addGroup(CorpsUser.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(CorpsUser.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(boutonMembre, 37, 37, 37)
                                                .addComponent(boutonEmployee, 37, 37, 37))
                                        .addComponent(boutonGuest, 37, 37, 37))
                                .addContainerGap(22, 22))
        );

        pack();
    }

    private void choixBoutonEmployee(java.awt.event.ActionEvent evt) {
        Employee employee = new Employee();
        employee.setVisible(true);
        this.hide();

    }

    private void choixBoutonMembre(java.awt.event.ActionEvent evt) {
        Membre membre = new Membre();
        membre.setVisible(true);
        this.hide();

    }

    private void choixBoutonGuest(java.awt.event.ActionEvent evt) {
        Guest guest = new Guest();
        guest.setVisible(true);
        this.hide();

    }



}
