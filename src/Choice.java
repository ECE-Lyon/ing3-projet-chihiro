import javax.imageio.ImageIO;
import java.nio.file.Paths;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Choice extends JFrame {

    public enum FidelityCard {
        ENFANT,
        ETUDIANT,
        ADULTE,
        SENIOR,
    }

    //Variable d'affichage
    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    JLabel titre3 = new JLabel();
    JLabel genre1 = new JLabel();
    JLabel genre2 = new JLabel();
    JLabel genre3 = new JLabel();
    JLabel dateDeRealisation1 = new JLabel();
    JLabel dateDeRealisation2 = new JLabel();
    JLabel dateDeRealisation3 = new JLabel();
    JLabel duree1 = new JLabel();
    JLabel duree2 = new JLabel();
    JLabel duree3 = new JLabel();
    JLabel seance1 = new JLabel();
    JLabel seance2 = new JLabel();
    JLabel seance3 = new JLabel();
    JLabel choixDuFilm = new JLabel();
    JRadioButton boutonRadio1 = new JRadioButton();
    JRadioButton boutonRadio2 = new JRadioButton();
    JRadioButton boutonRadio3 = new JRadioButton();
    static ButtonGroup buttonGroupFilmMember = new ButtonGroup();
    JLabel nombreDeTickets = new JLabel();
    static JSpinner caseNombreDeTicketsMembre = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
    JLabel tarifSpecial = new JLabel();
    static JRadioButton boutonRadioEnfant = new JRadioButton();
    static JRadioButton boutonRadioEtudiant = new JRadioButton();
    static JRadioButton boutonRadioAdulte = new JRadioButton();
    static JRadioButton boutonRadioSenior = new JRadioButton();
    static ButtonGroup buttonGroupTarif = new ButtonGroup(); // Permet de ne pas avoir plusieur bouton radio choisi en même temps
    JButton boutonAcheter = new JButton();
    JButton boutonRetour= new JButton();

    public Choice() {
        affichageChoice();

        setTitle("Présentation film"); // Définit un titre
        setSize(1050,500); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageChoice(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titre1.setFont(new Font("Calibri", 1, 11));
        titre1.setText("Titre : Avatar");
        genre1.setFont(new Font("Calibri", 1, 11));
        genre1.setText("Genre : Science-Fiction");
        dateDeRealisation1.setFont(new Font("Calibri", 1, 11));
        dateDeRealisation1.setText("Date de réalisation : 16 Decembre 2009");
        duree1.setFont(new Font("Calibri", 1, 11));
        duree1.setText("Durée : 162");
        seance1.setFont(new Font("Calibri", 1, 11));
        seance1.setText("Séance : 20h00 19/05/2021");

        titre2.setFont(new Font("Calibri", 1, 11));
        titre2.setText("Titre : Le Loup de Wall Street");
        genre2.setFont(new Font("Calibri", 1, 11));
        genre2.setText("Genre : Comédie");
        dateDeRealisation2.setFont(new Font("Calibri", 1, 11));
        dateDeRealisation2.setText("Date de réalisation : 25 Decembre 2013");
        duree2.setFont(new Font("Calibri", 1, 11));
        duree2.setText("Durée : 179");
        seance2.setFont(new Font("Calibri", 1, 11));
        seance2.setText("Séance : 20h15 19/05/2021");

        titre3.setFont(new Font("Calibri", 1, 11));
        titre3.setText("Titre : Harry Potter et le Prince de sang-mêlé");
        genre3.setFont(new Font("Calibri", 1, 11));
        genre3.setText("Genre : Fantastic");
        dateDeRealisation3.setFont(new Font("Calibri", 1, 11));
        dateDeRealisation3.setText("Date de réalisation : 15 Juillet 2009");
        duree3.setFont(new Font("Calibri", 1, 11));
        duree3.setText("Durée : 153");
        seance3.setFont(new Font("Calibri", 1, 11));
        seance3.setText("Séance : 20h30 19/05/2021");

        choixDuFilm.setFont(new Font("Calibri", 1, 16));
        choixDuFilm.setText("Choisissez le film que vous voulez voir :");

        boutonRadio1.setFont(new Font("Calibri", 1, 14));
        boutonRadio1.setText("Avatar");
        buttonGroupFilmMember.add(boutonRadio1);

        boutonRadio2.setFont(new Font("Calibri", 1, 14));
        boutonRadio2.setText("Le Loup de Wall Street");
        buttonGroupFilmMember.add(boutonRadio2);

        boutonRadio3.setFont(new Font("Calibri", 1, 14));
        boutonRadio3.setText("Harry Potter et le Prince de sang-mêlé");
        buttonGroupFilmMember.add(boutonRadio3);

        nombreDeTickets.setFont(new Font("Calibri", 1, 16));
        nombreDeTickets.setText("Combien de tickets voulez-vous ? :");
        caseNombreDeTicketsMembre.setFont(new Font("Calibri", 1, 16));

        tarifSpecial.setFont(new Font("Calibri", 1, 16));
        tarifSpecial.setText("Êtes-vous :");

        boutonRadioEnfant.setFont(new Font("Calibri", 1, 14));
        boutonRadioEnfant.setText("Enfant");
        buttonGroupTarif.add(boutonRadioEnfant);

        boutonRadioEtudiant.setFont(new Font("Calibri", 1, 14));
        boutonRadioEtudiant.setText("Etudiant");
        buttonGroupTarif.add(boutonRadioEtudiant);

        boutonRadioAdulte.setFont(new Font("Calibri", 1, 14));
        boutonRadioAdulte.setText("Adulte");
        buttonGroupTarif.add(boutonRadioAdulte);

        boutonRadioSenior.setFont(new Font("Calibri", 1, 14));
        boutonRadioSenior.setText("Senior");
        buttonGroupTarif.add(boutonRadioSenior);

        boutonAcheter.setBackground(new Color(255, 204, 0));
        boutonAcheter.setFont(new Font("Calibri", 1, 16));
        boutonAcheter.setText("Acheter les tickets");
        boutonAcheter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonAchat(evt);
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
        GroupLayout corpsChoice = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsChoice);
        corpsChoice.setHorizontalGroup(
                corpsChoice.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(40, 40, 40)
                                /*.addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(fonctionAffichageImage("avatar.jpeg"))
                                        .addComponent(fonctionAffichageImage("loupdewallstreet.jpeg"))
                                        .addComponent(fonctionAffichageImage("harrypotter.jpeg")))*/
                                .addGap(40, 40, 40)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre1)
                                        .addComponent(genre1)
                                        .addComponent(dateDeRealisation1)
                                        .addComponent(duree1)
                                        .addComponent(seance1))
                                .addGap(78, 78, 78)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre2)
                                        .addComponent(genre2)
                                        .addComponent(dateDeRealisation2)
                                        .addComponent(duree2)
                                        .addComponent(seance2))
                                .addGap(87, 87, 87)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre3)
                                        .addComponent(genre3)
                                        .addComponent(dateDeRealisation3)
                                        .addComponent(duree3)
                                        .addComponent(seance3)))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(choixDuFilm))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(boutonRadio1)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadio2)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadio3))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(tarifSpecial)
                                .addGap(10, 10, 10)
                                .addComponent(boutonRadioEnfant)
                                .addGap(25, 25, 25)
                                .addComponent(boutonRadioEtudiant)
                                .addGap(25, 25, 25)
                                .addComponent(boutonRadioAdulte)
                                .addGap(25, 25, 25)
                                .addComponent(boutonRadioSenior))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(nombreDeTickets)
                                .addGap(10, 10, 10)
                                .addComponent(caseNombreDeTicketsMembre, 50,50,50))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(boutonAcheter))
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(boutonRetour))
        );

        corpsChoice.setVerticalGroup(
                corpsChoice.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsChoice.createSequentialGroup()
                                .addGap(55, 55, 55)
                                /*.addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(fonctionAffichageImage("avatar.jpeg"))
                                        .addComponent(fonctionAffichageImage("loupdewallstreet.jpeg"))
                                        .addComponent(fonctionAffichageImage("harrypotter.jpeg")))*/
                                .addGap(10, 10, 10)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(titre1)
                                        .addComponent(titre2)
                                        .addComponent(titre3))
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(genre1)
                                        .addComponent(genre2)
                                        .addComponent(genre3))
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateDeRealisation1)
                                        .addComponent(dateDeRealisation2)
                                        .addComponent(dateDeRealisation3))
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(duree1)
                                        .addComponent(duree2)
                                        .addComponent(duree3))
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(seance1)
                                        .addComponent(seance2)
                                        .addComponent(seance3))
                                .addGap(50, 50, 50)
                                .addComponent(choixDuFilm)
                                .addGap(25, 25, 25)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(boutonRadio1)
                                        .addComponent(boutonRadio2)
                                        .addComponent(boutonRadio3))
                                .addGap(40, 40, 40)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tarifSpecial)
                                        .addComponent(boutonRadioEnfant)
                                        .addComponent(boutonRadioEtudiant)
                                        .addComponent(boutonRadioAdulte)
                                        .addComponent(boutonRadioSenior))
                                .addGap(30, 30, 30)
                                .addGroup(corpsChoice.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombreDeTickets)
                                        .addComponent(caseNombreDeTicketsMembre, 25, 25, 25))
                                .addGap(40, 40, 40)
                                .addComponent(boutonAcheter)
                                .addGap(10, 10, 10)
                                .addComponent(boutonRetour))
        );

        pack();                                                                                                                   // SERT A QUOI

    }

    public static FidelityCard choixDuBouton() {
        FidelityCard tarif = null;
        if (boutonRadioEnfant.isSelected()) {tarif = FidelityCard.ENFANT; }
        else if(boutonRadioEtudiant.isSelected()) {tarif = FidelityCard.ETUDIANT;}
        else if (boutonRadioAdulte.isSelected()) {tarif = FidelityCard.ADULTE;}
        else if (boutonRadioSenior.isSelected()) {tarif = FidelityCard.SENIOR;}
        return tarif;
    }

    public static int retourneValeurMember(){
        return (int) caseNombreDeTicketsMembre.getValue();
    }

    public static int calculTarifMember(int nombreDeTicketsChoisiMember) {
        int som = 0;
        switch(choixDuBouton()) {
            case ENFANT:
                som += 8;
                break;
            case ETUDIANT:
                som += 9;
                break;
            case ADULTE:
                som += 10;
                break;
            case SENIOR:
                som += 9;
                break;
        }
        som = som + (nombreDeTicketsChoisiMember-1)*11; // Réduction pour les personnes en plus de 1€ par rapport aux guest
        return som;
    }



    /*public JLabel fonctionAffichageImage(String image) {
        BufferedImage img = ImageIO.read(Paths.get("Images", image).toFile());
        Image affichageImage = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(affichageImage));
    }*/

    private void fonctionBoutonRetour(ActionEvent evt) {
        User user = new User();
        user.setVisible(true);
        this.hide();
    }

    private void fonctionBoutonAchat(ActionEvent evt) {
        AchatMembre achatMembre = new AchatMembre();
        achatMembre.setVisible(true);
        this.hide();
    }




}