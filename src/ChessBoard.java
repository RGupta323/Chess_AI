import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

//Credits: http://1bestcsharp.blogspot.com/2015/04/Java-How-To-Draw-Chess-Board-In-Java-Swing-Using-NetBeans.html
/*
As you know, this code isn't mine. Because its super long, but the point of the ai is for these more decision making algorithms.
So, I didn't want to waste time making a GUI. But yea I'm gonna have to add functionality to thsi gui, make sure that I can actualy move
the pieces and update tehir positions. All the peices correspond to objects and all that noise. So I will be modifying the code, but
as Stephan Mischook (last name might be mispelled) said "the number one rule of software development is reuse reuse and reuse"
 */
public class ChessBoard extends JPanel {
    public void paint(Graphics g){

        g.fillRect(100, 100, 400, 400);
        for(int i = 100; i <= 400; i+=100){
            for(int j = 100; j <= 400; j+=100){
                g.clearRect(i, j, 50, 50);
            }
        }

        for(int i = 150; i <= 450; i+=100){
            for(int j = 150; j <= 450; j+=100){
                g.clearRect(i, j, 50, 50);
            }
        }
    }
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.getContentPane().add(new ChessBoard());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
