package mini_proj;



import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
		
public class ellipse  extends JComponent {
	double wi, he;
	private Color couleur;
			public ellipse(double wi, double he , Color couleur)
			{
				this.wi=wi;
				this.he=he;
				this.couleur= couleur;
			}

			
			public void paint(Graphics g)
			{
				// create a ellipse2d
				Ellipse2D ed = new Ellipse2D.Double(250, 100,//positionement
													wi, he);// largeur, hauteur

				Graphics2D g1 = (Graphics2D)g;

				g1.setColor(couleur);

				// draw the first ellipse
				g1.draw(ed);


			}
		

	
//	public static void main(String[] args) {  
//      ellipse nb =new ellipse(190,190);  
//      JFrame f=new JFrame();  
//      f.add(nb);  
//      f.setSize(400,400);  
//      //f.setLayout(null);  
//      f.setVisible(true);  
//  }  


}
