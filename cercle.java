package mini_proj;
	import java.awt.Color;
import java.awt.Graphics;
import java.io.*;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class cercle  extends JComponent{
	int ray;
	private Color couleur;
	public cercle(int ray,Color couleur) {
		this.ray=ray;
		this.couleur=couleur;
		
	}
	public  void circle(Graphics g , int r)
{
		int x1 = 300;
		int y1 = 170;
//		r=ray;
		int x, y,d;
		d= 1-r;
		x=0;
		y=r;
		
		while(x<=y) {
			g.fillOval(x+x1, y +y1 , 4, 4);
			g.fillOval(x+x1, -y +y1 , 4, 4);
			g.fillOval(-x+x1, y +y1 , 4, 4);
			g.fillOval(-x+x1, -y +y1 , 4, 4);
			
			g.fillOval(y+x1, x +y1 , 4, 4);
			g.fillOval(y+x1, -x +y1 , 4, 4);
			g.fillOval(-y+x1, x +y1 , 4, 4);
			g.fillOval(-y+x1, -x +y1 , 4, 4);
			
			if(d>0) {
				x+=1;
				y-=1;
				d+= 4*(x-y) +10;
			}else {
				x+=1;
				y=y;
				d+= 4*x +6;
			}
			g.setColor(couleur);
		}
}
	public void paint(Graphics g) {
		circle(g,ray);
	}

//	public JPanel vvv() {  
//        cercle m =new cercle();  
//        JFrame f=new JFrame();  
//        JPanel j = new JPanel();
//        m.setBounds(50,50,400,400);
//        f.add(m);  
//        j.setSize(400,400);  
////        f.setLocation(450, 30);
//        j.add(m);
//        j.revalidate();
//        j.repaint();
//        f.add(j);
//        
//        f.setBounds(100,100,400,400);// il a les deux: size et location
//        f.setLayout(null);  
//        f.setVisible(true);
//		return j;  
//    }  
	
//	public static void main(String[] arg) {  
//        cercle m =new cercle(100);  
//        JFrame f=new JFrame();  
//        m.setBounds(0,0,400,400);
//        f.add(m);  
////        f.setSize(400,400);  
////        f.setLocation(450, 30);
//        f.setBounds(100,100,800,800);// il a les deux: size et location
//        f.setLayout(null);  
//        f.setVisible(true);
//		 
//    }  
}
