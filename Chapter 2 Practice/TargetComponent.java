import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws multiple circle shapes
 * 
 * @author Connor Chong 
 * @version 9-21-15
 */
public class TargetComponent extends JComponent
{
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth() - 20;
        int y = getHeight() - 20;
        
        int diameter = 1000;
        int up = 0;
        int up2 = 5;
        while(diameter >=0 )
        {
            Target target1 = new Target(50+up,50 + up);
            Target target2 = new Target(50+up2,50 + up2);
            target1.drawWhite(g2, diameter);
            diameter = diameter - 10;
            target2.drawBlack(g2, diameter);
            diameter = diameter - 10;
            up = up+10;
            up2 = up2+10;
        }    
    }
    
}
