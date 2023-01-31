package mini_proj;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class controller {
	
	protected  JFrame frame;
	
	private model mod;
	private view vi;
	private JComboBox coul;
	Color couleur;
	
	private ActionListener actionListener;
	
	public controller(model model, view view) {
		mod = model;
		vi = view;
		
		initView();
	}
	public void initView() {
		  coul = vi.getCoul();
//		  vi.getDrpdown().setText(model.getLastname());
	}
	
	
	
	public void initController() {
//		  view.getDrpdown().addActionListener(e -> formGeo());
		  
		 }
	public void formGeo() {
		
	}
	public void contol() {
		
//		coul = vi.getCoul();
		System.out.print("sdsd"+coul.getItemCount());
		coul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int choixCoul = coul.getSelectedIndex();
				
				if(choixCoul == 1) {
					couleur = Color.red;
				}
				if(choixCoul == 2) {
					couleur = Color.blue;
				}
				if(choixCoul == 3) {
					couleur = Color.black;
				}
				if(choixCoul == 4) {
					couleur = Color.green;
				}
				if(choixCoul == 5) {
					couleur = Color.yellow;
				}
				if(choixCoul == 6) {
					couleur = Color.orange;
				}
				System.out.print(choixCoul);
				
			}
			
		});
//	      view.getButton().addActionListener(actionListener);
	   }
//	
//	private void linkBtnAndLabel() {
//	      model.setX();
//	      view.setText(Integer.toString(model.getX()));
//	   }
	
}
