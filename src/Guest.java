import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Guest extends JFrame {

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
    static ButtonGroup buttonGroupFilmGuest = new ButtonGroup();
    JLabel nombreDeTickets = new JLabel();
    static JSpinner caseNombreDeTicketsGuest = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
    JButton boutonAcheter = new JButton();
    JButton boutonRetour= new JButton();

    public Guest() {
        affichageGuest();

        setTitle("Page Invité"); // Définit un titre
        setSize(1050,500); // Définit la taille : largeur = 600px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false);
    }

    private void affichageGuest() {

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
        buttonGroupFilmGuest.add(boutonRadio1);

        boutonRadio2.setFont(new Font("Calibri", 1, 14));
        boutonRadio2.setText("Le Loup de Wall Street");
        buttonGroupFilmGuest.add(boutonRadio2);

        boutonRadio3.setFont(new Font("Calibri", 1, 14));
        boutonRadio3.setText("Harry Potter et le Prince de sang-mêlé");
        buttonGroupFilmGuest.add(boutonRadio3);

        nombreDeTickets.setFont(new Font("Calibri", 1, 16));
        nombreDeTickets.setText("Combien de tickets voulez-vous ? :");
        caseNombreDeTicketsGuest.setFont(new Font("Calibri", 1, 16));

        boutonAcheter.setBackground(new Color(255, 204, 0));
        boutonAcheter.setFont(new Font("Calibri", 1, 16));
        boutonAcheter.setText("Acheter les tickets");
        boutonAcheter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonAcheter(evt);
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
        GroupLayout corpsGuest = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsGuest);
        corpsGuest.setHorizontalGroup(
                corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(40, 40, 40)
                                /*.addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(fonctionAffichageImage("avatar.jpeg"))
                                        .addComponent(fonctionAffichageImage("loupdewallstreet.jpeg"))
                                        .addComponent(fonctionAffichageImage("harrypotter.jpeg")))
                                .addGap(40, 40, 40)*/
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre1)
                                        .addComponent(genre1)
                                        .addComponent(dateDeRealisation1)
                                        .addComponent(duree1)
                                        .addComponent(seance1))
                                .addGap(78, 78, 78)
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre2)
                                        .addComponent(genre2)
                                        .addComponent(dateDeRealisation2)
                                        .addComponent(duree2)
                                        .addComponent(seance2))
                                .addGap(87, 87, 87)
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titre3)
                                        .addComponent(genre3)
                                        .addComponent(dateDeRealisation3)
                                        .addComponent(duree3)
                                        .addComponent(seance3)))
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(choixDuFilm))
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(boutonRadio1)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadio2)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadio3))
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(nombreDeTickets)
                                .addGap(10, 10, 10)
                                .addComponent(caseNombreDeTicketsGuest, 50,50,50))
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(boutonAcheter))
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(boutonRetour))
        );

        corpsGuest.setVerticalGroup(
                corpsGuest.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsGuest.createSequentialGroup()
                                .addGap(50, 50, 50)
                                /*.addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(fonctionAffichageImage("avatar.jpeg"))
                                        .addComponent(fonctionAffichageImage("loupdewallstreet.jpeg"))
                                        .addComponent(fonctionAffichageImage("harrypotter.jpeg")))
                                .addGap(10, 10, 10)*/
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(titre1)
                                        .addComponent(titre2)
                                        .addComponent(titre3))
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(genre1)
                                        .addComponent(genre2)
                                        .addComponent(genre3))
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateDeRealisation1)
                                        .addComponent(dateDeRealisation2)
                                        .addComponent(dateDeRealisation3))
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(duree1)
                                        .addComponent(duree2)
                                        .addComponent(duree3))
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(seance1)
                                        .addComponent(seance2)
                                        .addComponent(seance3))
                                .addGap(50, 50, 50)
                                .addComponent(choixDuFilm)
                                .addGap(20, 20, 20)
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(boutonRadio1)
                                        .addComponent(boutonRadio2)
                                        .addComponent(boutonRadio3))
                                .addGap(50, 50, 50)
                                .addGroup(corpsGuest.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombreDeTickets)
                                        .addComponent(caseNombreDeTicketsGuest, 25, 25, 25))
                                .addGap(60, 60, 60)
                                .addComponent(boutonAcheter)
                                .addGap(40, 40, 40)
                                .addComponent(boutonRetour))
        );

        pack();                                                                                                                   // SERT A QUOI

    }

    public static int retourneValeurGuest(){
        return (int) caseNombreDeTicketsGuest.getValue();
    }

    public static int calculTarifGuest(int nombreDeTicketsChoisi) {
        int som = 0;
        som = som + nombreDeTicketsChoisi*11;
        return som;
    }

    /*private JLabel fonctionAffichageImage(String image) {
        BufferedImage img = ImageIO.read(Paths.get("Images", image).toFile());
        Image affichageImage = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(affichageImage));
    }*/


    private void fonctionBoutonRetour(ActionEvent evt) {
        User user = new User();
        user.setVisible(true);
        this.hide();
    }

    private void fonctionBoutonAcheter(java.awt.event.ActionEvent evt) {
        AchatGuest achat = new AchatGuest();
        achat.setVisible(true);
    }


}
