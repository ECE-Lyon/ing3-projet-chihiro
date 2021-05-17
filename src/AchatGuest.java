import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AchatGuest extends JFrame{

    JPanel fondFrise = new JPanel();
    JLabel titre1 = new JLabel();
    JLabel titre2 = new JLabel();
    JLabel titre2bis = new JLabel();
    JButton boutonRetour= new JButton();

    JPanel fondPage = new JPanel();
    JLabel marchand = new JLabel();
    JLabel montant = new JLabel();
    JLabel date = new JLabel();

    public AchatGuest(){

        affichageAchat();

        setTitle("Traitement de l'achat");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void affichageAchat(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        fondFrise.setBackground(new Color(38, 156, 26));
        fondPage.setBackground(new Color(255, 255, 255));

        titre1.setFont(new Font("Calibri", 1, 20));
        titre1.setForeground(new java.awt.Color(255, 255, 255));
        titre1.setText("Transaction réalisée avec succés!");

        titre2.setFont(new Font("Calibri", 0, 14));
        titre2.setForeground(new java.awt.Color(255, 255, 255));
        titre2.setText("Appuyez sur le bouton pour être redirigé");
        titre2bis.setFont(new Font("Calibri", 0, 14));
        titre2bis.setForeground(new java.awt.Color(255, 255, 255));
        titre2bis.setText("vers le site marchant");

        boutonRetour.setBackground(new Color(255, 255, 255));
        boutonRetour.setFont(new Font("Calibri", 1, 15));
        boutonRetour.setText("Retour à la boutique");
        boutonRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fonctionBoutonRetour(evt);
            }
        });

        marchand.setFont(new Font("Calibri", 1, 15));
        marchand.setText("Marchand : AlloJava");

        montant.setFont(new Font("Calibri", 1, 15));
        montant.setText("Montant : " + Guest.calculTarifGuest(Guest.retourneValeurGuest()) + "€");

        date.setFont(new Font("Calibri", 1, 15));
        date.setText("Date : 19 Mai 2021");

        //Création frise de page
        GroupLayout frisePayement = new GroupLayout(fondFrise);
        fondFrise.setLayout(frisePayement);
        frisePayement.setHorizontalGroup(
                frisePayement.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(frisePayement.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(titre1))
                        .addGroup(frisePayement.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(titre2))
                        .addGroup(frisePayement.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(titre2bis))

        );

        frisePayement.setVerticalGroup(
                frisePayement.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(frisePayement.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(titre1)
                                .addGap(10, 10, 10)
                                .addComponent(titre2)
                                .addGap(4, 4, 4)
                                .addComponent(titre2bis))

        );

        //Création fond de page
        GroupLayout fondPayant = new GroupLayout(fondPage);
        fondPage.setLayout(fondPayant);
        fondPayant.setHorizontalGroup(
                fondPayant.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondPayant.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(marchand))
                        .addGroup(fondPayant.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(montant))
                        .addGroup(fondPayant.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(date))
                        .addGroup(fondPayant.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(boutonRetour))

        );

        fondPayant.setVerticalGroup(
                fondPayant.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondPayant.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(marchand)
                                .addGap(10, 10, 10)
                                .addComponent(montant)
                                .addGap(10, 10, 10)
                                .addComponent(date)
                                .addGap(30, 30, 30)
                                .addComponent(boutonRetour, 30, 30, 30))

        );

        // AFFICHAGE CORPS PAGE ACHAT
        GroupLayout corpsAchat = new GroupLayout(getContentPane());
        getContentPane().setLayout(corpsAchat);
        corpsAchat.setHorizontalGroup(
                corpsAchat.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondFrise, 400, 400, 400)
                        .addComponent(fondPage, 400, 400, 400)
        );


        corpsAchat.setVerticalGroup(
                corpsAchat.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondFrise, 100, 100, 100)
                        .addComponent(fondPage, 300, 300, 300)
        );


    }

    private void fonctionBoutonRetour(java.awt.event.ActionEvent evt) {
        Choice choice = new Choice();
        choice.setVisible(true);
        this.hide();
    }

}

