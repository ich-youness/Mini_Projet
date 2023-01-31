package mini_proj;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class segment extends  JComponent{// segement en utilisant brensenham
		private int ha;
		private Color couleur;
	public segment(int ha, Color couleur2) {
		this.ha=ha;
		this.couleur=couleur2;
	} 

	public void paint(Graphics g) {  
		int x0 = 150;
		int y0 = 150;
		int y1 = 150;
		int x1 = (int) (Math.sqrt(Math.pow(ha, 2) - Math.pow((y1-y0),2)) + x0);
		
		int dx,dy,p,x,y;
		dx=x1-x0;
		dy=y1-y0;
		x=x0;
		y=y0;
		
		p=2*dy-dx;
		while(x<x1) {
			if(p>=0) {
				g.fillOval(x, y, 5, 5);
				
				y=y+1;
				p=p+2*dy-2*dx;
			}else {
				g.fillOval(x, y, 5, 5);
				
				p=p+2*dy; 
			}
			g.setColor(couleur);
			x=x+1;
		}
		
//		System.out.println(couleur);
//		g.fill3DRect(x0, y0, x1, y1, getFocusTraversalKeysEnabled());
		
    }  
//	public static void main(String[] args) {  
//        segment m =new segment(150,Color.red);  
//        JFrame f=new JFrame();  
//        f.add(m);  
//        f.setSize(400,400);  
//        //f.setLayout(null);  
//        f.setVisible(true);  
//    }  
}
