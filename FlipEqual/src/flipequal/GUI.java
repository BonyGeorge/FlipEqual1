/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipequal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Dr.Bony George
 */
public class GUI extends JFrame{
    
    JFrame StartingFrame;
    
    JButton Start;
    JLabel StartTxt;  
     
    Font f=new Font("START",Font.BOLD,100);
    
            
    public GUI() throws IOException
    {
         super();
         
        Start=new JButton(f.getName());
        StartingFrame=new JFrame();
        StartingFrame.setTitle("Main Activity");
        
        StartTxt=new JLabel("Press Start To Start the Game :) ");
        JOptionPane.showMessageDialog(null,"<--Welcome To Our Game -->");
        
        
        
        StartingFrame.setLayout(null);
        
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
    
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        StartingFrame.setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
        
        
        Start.setBounds(100,200,150,100);
        StartTxt.setBounds(100,100,200,100);
        Start.addMouseListener(new OnClick());
        StartingFrame.add(Start);
        StartingFrame.add(StartTxt);
        
        StartingFrame.setVisible(true);       
        StartingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
   
    private class OnClick implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            Object Bt=e.getSource();
            if(Bt.equals(Start))
            {
                StartingFrame.setVisible(false);
                Game.GameFrame.setVisible(true);
                
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
           Start.setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
         
        }
    
        
    }
}
