import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiseAJour extends JFrame {

    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    static JRadioButton boutonRadioFilm1 = new JRadioButton();
    static JRadioButton boutonRadioFilm2 = new JRadioButton();
    static JRadioButton boutonRadioFilm3 = new JRadioButton();
    static ButtonGroup buttonGroupPrivate = new ButtonGroup();
    JLabel titre3 = new JLabel();
    JLabel title = new JLabel();
    JTextField caseTitle = new JTextField();
    JLabel movieGenre = new JLabel();
    JTextField caseMovieGenre = new JTextField();
    JLabel releaseDate = new JLabel();
    JTextField caseReleaseDate = new JTextField();
    JLabel duration = new JLabel();
    JTextField caseDuration = new JTextField();
    JButton boutonEnregistrer = new JButton();

    public MiseAJour() {

        affichagePrivate();

        setTitle("Espace employée");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void affichagePrivate() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titre1.setFont(new Font("Calibri", 1, 25));
        titre1.setText("Bonjour!");

        titre2.setFont(new Font("Calibri", 1, 16));
        titre2.setText("Quel film voulez vous changer ?");

        boutonRadioFilm1.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm1.setText("Film 1");
        buttonGroupPrivate.add(boutonRadioFilm1);

        boutonRadioFilm2.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm2.setText("Film 2");
        buttonGroupPrivate.add(boutonRadioFilm2);

        boutonRadioFilm3.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm3.setText("Film 3");
        buttonGroupPrivate.add(boutonRadioFilm3);

        titre3.setFont(new Font("Calibri", 1, 16));
        titre3.setText("Entrez les données du nouveau film :");

        title.setFont(new Font("Calibri", 1, 14));
        title.setText("Titre :");
        caseTitle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionTitle(evt);
            }
        });

        movieGenre.setFont(new Font("Calibri", 1, 14));
        movieGenre.setText("Genre :");
        caseMovieGenre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionMovieGenre(evt);
            }
        });

        releaseDate.setFont(new Font("Calibri", 1, 14));
        releaseDate.setText("Date de réalisation :");
        caseReleaseDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionReleaseDate(evt);
            }
        });

        duration.setFont(new Font("Calibri", 1, 14));
        duration.setText("Durée :");
        caseDuration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionDuration(evt);
            }
        });

        boutonEnregistrer.setBackground(new Color(255, 255, 0));
        boutonEnregistrer.setFont(new Font("Calibri", 1, 14));
        boutonEnregistrer.setText("Enregistrer");
        boutonEnregistrer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonEnregistrer(evt);
            }
        });

        // AFFICHAGE DU CORPS
        GroupLayout corpsMiseAJour = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsMiseAJour);
        corpsMiseAJour.setHorizontalGroup(
                corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(titre1))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(titre2))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(boutonRadioFilm1)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadioFilm2)
                                .addGap(50, 50, 50)
                                .addComponent(boutonRadioFilm3))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(titre3))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(title)
                                .addGap(18, 18, 18)
                                .addComponent(caseTitle, 150, 150, 150))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(movieGenre)
                                .addGap(18, 18, 18)
                                .addComponent(caseMovieGenre, 150, 150, 150))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(releaseDate)
                                .addGap(18, 18, 18)
                                .addComponent(caseReleaseDate, 150, 150, 150))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(duration)
                                .addGap(18, 18, 18)
                                .addComponent(caseDuration, 150, 150, 150))
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(boutonEnregistrer))
        );

        corpsMiseAJour.setVerticalGroup(
                corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(corpsMiseAJour.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(titre1)
                                .addGap(25, 25, 25)
                                .addComponent(titre2)
                                .addGap(10, 10, 10)
                                .addGroup(corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(boutonRadioFilm1)
                                        .addComponent(boutonRadioFilm2)
                                        .addComponent(boutonRadioFilm3))
                                .addGap(25, 25, 25)
                                .addComponent(titre3)
                                .addGap(15, 15, 15)
                                .addGroup(corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(title)
                                         .addComponent(caseTitle))
                                .addGap(10, 10, 10)
                                .addGroup(corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                         .addComponent(movieGenre)
                                         .addComponent(caseMovieGenre))
                                .addGap(10, 10, 10)
                                .addGroup(corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(releaseDate)
                                        .addComponent(caseReleaseDate))
                                .addGap(10, 10, 10)
                                .addGroup(corpsMiseAJour.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration)
                                        .addComponent(caseDuration))
                                .addGap(30, 30, 30)
                                .addComponent(boutonEnregistrer))
        );

        pack();


    }

    private void fonctionTitle(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionMovieGenre(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionReleaseDate(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionDuration(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fonctionBoutonEnregistrer(ActionEvent evt) {
        MiseAJour priv = new MiseAJour();
        priv.setVisible(true);
        this.hide();
    }
}
