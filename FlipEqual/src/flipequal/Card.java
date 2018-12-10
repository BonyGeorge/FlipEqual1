/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipequal;

import java.awt.*;
import javafx.scene.image.ImageView;
import javax.swing.*;
/**
 *
 * @author Dr.Bony George
 */
public class Card extends JFrame {
    
   
    public int Value;
    public String CardShape;
    public String CardColor;
    public String CardName;
    public String ImageName;

    @Override
    public String toString() {
        return "Card{" + "Value=" + Value + ", CardShape=" + CardShape + ", CardColor=" + CardColor + ", CardName=" + CardName + ", ImageName=" + ImageName + '}';
    }

    public String getCardName() {
        return CardName;
    }

    public String getImageName() {
        return ImageName;
    }
   
    public int getValue() {
        return Value;
    }

    public String getCardShape() {
        return CardShape;
    }

    public String getCardColor() {
        return CardColor;
    }
    
   public Card getCard(){
        return this;
    }
}
