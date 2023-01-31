package mini_proj;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.*;

import testswing.test;

public class main {

	public static void main (String args[]){
//		SwingUtilities.invokeLater(new Runnable() {
//	         @Override
//	         public void run() {
//	            model model = new model();
//	            view view = new view();
//	           controller controller = new controller(model,view);
//	            controller.contol();
////	            view frame = new view();
//				view.setVisible(true);
//	         }
//	      });
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newview frame = new newview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
