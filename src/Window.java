import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;


import java.awt.Font;
import java.awt.Graphics;


public class Window extends JFrame{
    public Window() {

        setResizable(false); // Empêche le redimentionnement de la fenêtre par l'utilisateur
        setAlwaysOnTop(true); // Garde la fenêtre au premier plan


        this.setTitle("Billetterie cinéma en ligne"); // Définit un titre
        this.setSize(500, 400); // Définit la taille : largeur = 500px, hauteur = 400px
        this.setLocationRelativeTo(null); // Positionne la fenêtre au centre




        JPanel pan = new JPanel(); //Instanciation d'un objet JPanel

        pan.setBackground(Color.PINK); // Définit la couleur du fond

        this.setContentPane(pan); //On prévient notre JFrame que notre JPanel sera son content pane





        this.setVisible(true);
    }
}
