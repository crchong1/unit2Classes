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
        
        int x = getWidth() - 30;
        int y = getHeight() - 30;
        
        int diameter = 800;
        int up = 0;
        int up2 = 1;
        while(diameter >=0 )
        {
            Target target1 = new Target(50+up,50 + up);
            Target target2 = new Target(50+up2,50 + up2);
            target1.drawWhite(g2, diameter);
            diameter = diameter - 2;
            target2.drawBlack(g2, diameter);
            diameter = diameter - 2;
            up = up+2;
            up2 = up2+2;
        }
        
        //diameter = 200;
       // up = 0;
       // up2 = 5;
       // while(diameter >=0 )
       // {
       //     Target target3 = new Target(300+up,300 + up);
       //     Target target4 = new Target(300+up2,300 + up2);
       //     target3.drawCyan(g2, diameter);
       //     diameter = diameter - 10;
       //     target4.drawBlue(g2, diameter);
      //      diameter = diameter - 10;
       //     up = up+10;
       //     up2 = up2+10;
       // }
    }
    
}
