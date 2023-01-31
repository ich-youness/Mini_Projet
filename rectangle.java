package mini_proj;

import java.awt.Color;
import java.awt.Graphics;
		import java.awt.Graphics2D;
		import java.awt.geom.Rectangle2D;

		import javax.swing.JComponent;
		import javax.swing.JFrame;

	
	public class rectangle  extends JComponent {
		double wid, heig;
		private Color couleur;
		public rectangle(double wid, double heig,Color couleur) {
			this.wid=wid;
			this.heig=heig;
			this.couleur=couleur;
		}
		public void rec(Graphics g, double width, double height) {
			Graphics2D g2 = (Graphics2D) g;

		    // draw a rectangle

		    double leftX = 200;
		    double topY = 100;
//		    width = 200;
//		    height = 150;

		    Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		    g2.setColor(couleur);
		    
		    g2.fill(rect);
		     

		}

		
		  public void paint(Graphics g) {
		    rec(g,wid,heig);
		   
		  }
		

		
//		  public static void main(String[] a) {
//			  rectangle rec =new rectangle(100,100, Color.red);  
//		      JFrame f=new JFrame();  
//		      f.add(rec);  
//		      f.setSize(400,400);  
//		      //f.setLayout(null);  
//		      f.setVisible(true);
//		  }
		
}

