
package bouncyballs;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class BouncyBalls extends JPanel {

     private static final int BOX_WIDTH = 1000;
   private static final int BOX_HEIGHT = 1000;
  
   // Ball's properties
   private float ballRadius = 100; // Ball's radius
   private float ballX = ballRadius + 50; // Ball's center (x, y)
   private float ballY = ballRadius + 20; 
   private float ballSpeedX = 5;   // Ball's speed for x and y
   private float ballSpeedY = 6;
  
   private static final int UPDATE_RATE = 90; // Number of refresh per second
  
   
   public BouncyBalls() {
      this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
  
      // Start the ball bouncing (in its own thread)
      Thread gameThread = new Thread() {
         public void run() {
            while (true) { // Execute one update step
               // Calculate the ball's new position
               ballX += ballSpeedX;
               ballY += ballSpeedY;
               // Check if the ball moves over the bounds
               // If so, adjust the position and speed.
               if (ballX - ballRadius < 0) {
                  ballSpeedX = -ballSpeedX; // Reflect along normal
                  ballX = ballRadius; // Re-position the ball at the edge
               } else if (ballX + ballRadius > BOX_WIDTH) {
                  ballSpeedX = -ballSpeedX;
                  ballX = BOX_WIDTH - ballRadius;
               }
               // May cross both x and y bounds
               if (ballY - ballRadius < 0) {
                  ballSpeedY = -ballSpeedY;
                  ballY = ballRadius;
               } else if (ballY + ballRadius > BOX_HEIGHT) {
                  ballSpeedY = -ballSpeedY;
                  ballY = BOX_HEIGHT - ballRadius;
               }
               // Refresh the display
               repaint(); // Callback paintComponent()
               // Delay for timing control and give other threads a chance
               try {
                  Thread.sleep(1000 / UPDATE_RATE);  // milliseconds
               } catch (InterruptedException ex) { }
            }
         }
      };
      gameThread.start();  // Callback run()
   }
  
   /** Custom rendering codes for drawing the JPanel */
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);    // Paint background
  
      // Draw the box
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);
  
      // Draw the ball
      g.setColor(Color.GREEN);
      g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius),
            (int)(2 * ballRadius), (int)(2 * ballRadius));
  
      // Display the ball's information
      g.setColor(Color.WHITE);
      g.setFont(new Font("Courier New", Font.PLAIN, 12));
      StringBuilder sb = new StringBuilder();
      Formatter formatter = new Formatter(sb);
      formatter.format("Ball @(%3.0f,%3.0f) Speed=(%2.0f,%2.0f)", ballX, ballY,
            ballSpeedX, ballSpeedY);
      g.drawString(sb.toString(), 20, 30);
   }
    
    public static void main(String[] args) {
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            // Set up main window (using Swing's Jframe)
            JFrame frame = new JFrame("A Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new BouncyBalls());
            frame.pack();
            frame.setVisible(true);
         }
      });
    }
    
}
