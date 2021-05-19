import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Film {

    public enum MovieGenre {
        COMEDIE,
        DRAME,
        FANTASTIQUE,
        HORREUR,
        POLICIER,
        AVANTURE,

        //ETC
    }

    private Map<Integer, Customer> reservation;

    private MovieGenre movieGenre;

    private String title;

    private String releaseDate;

    private int duration;

    private int reamainingSeats;

    public static BufferedImage image;


}