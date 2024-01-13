import java.applet.Applet;
import java.awt.*;

public class smilingface extends Applet {
   public void paint(Graphics g) {
      setBackground(Color.white);
      g.setColor(Color.yellow);
      g.fillOval(100, 100, 200, 200);
      g.setColor(Color.black);
      g.fillOval(155, 175, 10, 20);
      g.fillOval(230, 175, 10, 20);
      g.drawArc(150, 220, 100, 50, 180, 180);
   }

   public static void main(String[] args) {
      // Create a frame
      Frame frame = new Frame("smilingface Frame");

      // Create an instance of the applet
      smilingface applet = new smilingface();

      // Add the applet instance to the frame
      frame.add(applet);

      // Call applet's init() method
      applet.init();

      // Set frame size (applet size will be as per its preferred size)
      frame.setSize(400, 400);

      // Show the frame
      frame.setVisible(true);
      
      // Handle closing the frame
      frame.addWindowListener(new java.awt.event.WindowAdapter() {
         @Override
         public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            System.exit(0);
         }
      });
   }
}
/*<applet code =smilingface.java height=400 width=400>
</applet>*/
