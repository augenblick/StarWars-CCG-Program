import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class LoadImageApp extends Component {

  BufferedImage img;

      public void paint(Graphics g) {
          g.drawImage(img, 0, 0, null);
      }

      public LoadImageApp(String filePath) {
         try {
             img = ImageIO.read(new File(filePath));
         } catch (IOException e) {System.out.println("File \"" + filePath + "\" Not Found");
         }

      }

      public Dimension getPreferredSize() {
          if (img == null) {
               return new Dimension(100,100);
          } else {
             return new Dimension(img.getWidth(null), img.getHeight(null));
         }
      }

    }