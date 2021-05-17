import javax.swing.*;
import java.awt.*;

public class Private extends JFrame {

    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    static JRadioButton boutonRadioFilm1 = new JRadioButton();
    static JRadioButton boutonRadioFilm2 = new JRadioButton();
    static JRadioButton boutonRadioFilm3 = new JRadioButton();
    static ButtonGroup buttonGroupPrivate = new ButtonGroup();
    JLabel titre3 = new JLabel();

    public Private() {

        affichagePrivate();

        setTitle("Espace employée");
        setSize(1050,500);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void affichagePrivate() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titre1.setFont(new Font("Calibri", 1, 20));
        titre1.setText("BONJOUR!");

        titre2.setFont(new Font("Calibri", 1, 16));
        titre2.setText("Quel film voulez vous changer ?");

        boutonRadioFilm1.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm1.setText("Enfant");
        buttonGroupPrivate.add(boutonRadioFilm1);

        boutonRadioFilm2.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm2.setText("Etudiant");
        buttonGroupPrivate.add(boutonRadioFilm2);

        boutonRadioFilm3.setFont(new Font("Calibri", 1, 14));
        boutonRadioFilm3.setText("Adulte");
        buttonGroupPrivate.add(boutonRadioFilm3);

        titre1.setFont(new Font("Calibri", 1, 20));
        titre1.setText("Entrez les données du nouveau film :");


    }

}
