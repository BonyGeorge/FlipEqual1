
package flipequal;


import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.naming.ldap.ManageReferralControl;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Dr.Bony George
 */
public class Game extends JFrame{
    
    
    
    Random Shuffle;
    
    JButton button1;
    ImageIcon Image1;
    
    JButton button2;
    ImageIcon Image2;
    
    JButton button3;
    ImageIcon Image3;
    
    JButton button4;
    ImageIcon Image4;
    
    JButton button5;
    ImageIcon Image5;
    
    JButton button6;
    ImageIcon Image6;
    
    JButton button7;
    ImageIcon Image7;
    
    JButton button8;
    ImageIcon Image8;
   
    ArrayList<Card>Cards=new ArrayList<Card>(10);
    
    public static JFrame GameFrame;
    
    public Game() throws IOException
    {

        setLayout(new FlowLayout());
        
        //Shuffle.nextInt(8);
        
        GameFrame=new JFrame();
        GameFrame.setTitle("FlipEqual Game");
        
        Card c1=new Card();
        button1=new JButton();
        Image1=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\1_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button1.setIcon(Image1);
        button1.setBounds(590,130,50,80);
        c1.Value=1;
        Cards.add(c1);
        GameFrame.add(button1);
        button1.addMouseListener(new OnClick());
        Card c2=new Card();
        button2=new JButton();
        Image2=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\2_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button2.setIcon(Image2);
        c2.Value=2;
        Cards.add(c2);
        button2.setBounds(1080,130,50,80);
        GameFrame.add(button2);
        button2.addMouseListener(new OnClick());
        Card c3=new Card();
        button3=new JButton();
        Image3=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\3_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button3.setIcon(Image3);
        button3.setBounds(1080+590,130,50,80);
        c3.Value=3;
        Cards.add(c3);
        GameFrame.add(button3);
        button3.addMouseListener(new OnClick());
        Card c4=new Card();
        button4=new JButton();
        Image4=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\4_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button4.setIcon(Image4);
        button4.setBounds(1670+590,130,50,80);
        c4.Value=4;
        Cards.add(c4);
        GameFrame.add(button4);
        button4.addMouseListener(new OnClick());
        Card c5=new Card();
        button5=new JButton();
        Image5=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\1_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button5.setIcon(Image5);
        button5.setBounds(590,130,50,80);
        c5.Value=1;
        Cards.add(c5);
        button5.setSize(150, 300);
        GameFrame.add(button5);
        button5.addMouseListener(new OnClick());
        Card c6=new Card();
        button6=new JButton();
        Image6=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\2_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button6.setIcon(Image6);
        c6.Value=2;
        Cards.add(c6);
        button6.setBounds(1080,130,50,80);
        button6.setSize(150, 300);
        GameFrame.add(button6);
        button6.addMouseListener(new OnClick());
        Card c7=new Card();
        button7=new JButton();
        Image7=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\3_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button7.setIcon(Image7);
        button7.setBounds(1080+590,130,50,80);
        c7.Value=3;
        Cards.add(c7);
        button7.setSize(150, 300);
        GameFrame.add(button7);
        button7.addMouseListener(new OnClick());
        Card c8=new Card();
        button8=new JButton();
        Image8=new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Programming\\JAVA\\AymanTarneeb\\Cards\\4_of_spades.png").getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        button8.setIcon(Image8);
        button8.setBounds(1670+590,130,50,80);
        c8.Value=4;
        Cards.add(c8);
        button8.setSize(150, 300);
        GameFrame.add(button8);
        button8.addMouseListener(new OnClick());
       
         GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
    private class OnClick implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if(button1.equals(e.getSource())) {
                if (button5.equals(e.getSource())) {
                    JOptionPane.showMessageDialog(null,"You Won");
                }
                else 
                    JOptionPane.showMessageDialog(null,"You Lost");
            }
            if(button2.equals(e.getSource())) {
                if (button6.equals(e.getSource())) {
                    JOptionPane.showMessageDialog(null,"You Won");
                }
                else 
                    JOptionPane.showMessageDialog(null,"You Lost");
            }
            if(button3.equals(e.getSource())) {
                if (button7.equals(e.getSource())) {
                    JOptionPane.showMessageDialog(null,"You Won");
                }
                else 
                    JOptionPane.showMessageDialog(null,"You Lost");
            }
            if(button4.equals(e.getSource())) {
                if (button8.equals(e.getSource())) {
                    JOptionPane.showMessageDialog(null,"You Won");
                }
                else 
                    JOptionPane.showMessageDialog(null,"You Lost");
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    
    
    }
    }        

