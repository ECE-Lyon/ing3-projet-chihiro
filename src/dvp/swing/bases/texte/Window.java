package dvp.swing.bases.texte;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame{
    public Window(){
        super();

        Affichage();//On initialise notre fenêtre
    }

    private void Affichage(){
        setTitle("Billetterie cinéma en ligne"); // Définit un titre
        setSize(600,500); // Définit la taille : largeur = 500px, hauteur = 400px
        setLocationRelativeTo(null); // Positionne la fenêtre au centre
        setResizable(false); // Empêche le redimentionnement de la fenêtre par l'utilisateur
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Arrête le code lorsque l'utilisateur appuie sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.PINK); // Définit la couleur du fond

        JLabel label = new JLabel("<html><body>Ligne 1<br>Ligne 2</body></html>"); // JLabel label = new JLabel("Bienvenue dans ma modeste application");

        panel.add(label);

        return panel;
    }


}
