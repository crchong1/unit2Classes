import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Locale;
import javax.media.j3d.Material;
import javax.media.j3d.PhysicalBody;
import javax.media.j3d.PhysicalEnvironment;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.View;
import javax.media.j3d.ViewPlatform;
import javax.media.j3d.VirtualUniverse;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

public class BoxShadow {

    public Point pos = new Point(); //Point -> (x, y)
    protected float blur;
    protected int hex; //Hex color
    protected Component parent; //Parent component
    protected Bounds bounds = new Bounds(); //Bounds -> (x, y, width, height)
    protected int alpha; //Opacity

    public BoxShadow(Point pos, float blur, int hex, int alpha) {
        if (pos != null) this.pos.copy(pos);
        this.blur = blur;
        this.alpha = alpha;
        this.hex = hex;
    }

    public void update() {
        if (parent != null) {
            bounds.copy(parent.getBounds());
        }
    }

    //Screen class is Graphics2D personalized class
    //Es. fillRect(Point p, Size s), ecc.
    public void render(Screen screen) {
        if (parent != null) {

            int red, green, blue;

            for (int i = (int) blur; i > 0; i--) {

                red = (hex >> 16) & 0xff;
                green = (hex >> 8) & 0xff;
                blue = hex & 0xff;

                screen.setColor(new Color(red, green, blue, (int) (alpha / blur * i)));
                int ii = (i - (int) blur);

                screen.fillRect(
                    bounds.x + ii + pos.x, bounds.y - 1 + (i - (int) blur) + pos.y, bounds.width - (ii << 1) + 1, 1
                );
                screen.fillRect(
                    bounds.x + ii + pos.x, bounds.y + bounds.height - ii + pos.y, bounds.width - (ii << 1) + 1, 1
                );
                screen.fillRect(
                    bounds.x + ii - 1 + pos.x, bounds.y + ii - 1 + pos.y, 1, bounds.height - (ii << 1) + 2
                );
                screen.fillRect(
                    bounds.x + bounds.width - ii + pos.x, bounds.y + ii + pos.y, 1, bounds.height - (ii << 1)
                );
            }

            red = (hex >> 16) & 0xff;
            green = (hex >> 8) & 0xff;
            blue = hex & 0xff;

            screen.setColor(new Color(red, green, blue, alpha));
            screen.fillRect(bounds.x + pos.x,bounds.y + pos.y, bounds.width, bounds.height);
        }
    }
}