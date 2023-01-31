package mini_proj;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class newview extends JFrame {

	private JPanel p;
//	private Image logo = new ImageIcon();
//	Image logo = new ImageIcon((this.getClass().getResource("logo.png"))).getImage();
	

	private String frmchs;
	private String frmprc;
	public int i= 0;
	private Color couleur;
	
	private JLabel  form ;
	private JLabel  hauteur = new JLabel("Hauteur: ");
	private JLabel  largeur = new JLabel("Largeur: ");
	private JLabel  rayon = new JLabel("Rayon: ");
	private JLabel  longeur = new JLabel("Longeur: ");
	private JButton btn;
	
	private  JTextField h = new JTextField(12);
	private  JTextField l = new JTextField(12);
	
//	JComboBox drpdwn;
	
	public String[] list;
	private  String[] bx = {"","Segment","Carre","Cercle","Rectangle","Ellipse"};// je dois ajouter un segment
	private  String[] cl = {"","Rouge","Bleu","Noire","Vert","Jaune","Orange"};
	public JComboBox drpdwn = new JComboBox(bx);
	public JComboBox coul = new JComboBox(cl);
	private JTextField textField;
	private JTextField textField_1;

	
	
	
	
	public static void main(String[] args) {
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

	// frame 
	public newview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 950, 600);
		setUndecorated(true);
		p = new JPanel();
		p.setBackground(new Color(240, 240, 240));
		p.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		setContentPane(p);
		p.setLayout(null);
		
		JPanel donnees = new JPanel();
		donnees.setBackground(new Color(169, 169, 169));
		donnees.setBounds(0, 0, 301, 600);
		p.add(donnees);
		donnees.setLayout(null);
		
		JPanel titre = new JPanel();
		
//		
		titre.setBackground(new Color(128, 128, 128));
		titre.setBounds(0, 0, 313, 118);
		donnees.add(titre);
		titre.setLayout(null);
		
//		ImageIcon logo = new ImageIcon("C:\\\\Users\\\\PC.DESKTOP-QK1F62J\\\\eclipse-workspace\\\\POO\\\\src\\\\mini_proj\\\\logo.png");
		JLabel lblNewLabel = new JLabel(new ImageIcon(newview.class.getResource("/mini_proj/logo.png")));
//		logo.setImage(logo.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
		
		lblNewLabel.setBounds(0, 13, 69, 68);
		titre.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Formes");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 29));
		lblNewLabel_1.setBounds(73, 13, 131, 42);
		titre.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Geometriques");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.BOLD, 29));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(76, 52, 227, 30);
		titre.add(lblNewLabel_1_1);
		
		JLabel form = new JLabel("Forme:");
		form.setForeground(new Color(0, 0, 0));
		form.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		form.setBounds(23, 172, 86, 28);
		donnees.add(form);
		
//		drpdwn = new JComboBox();
		drpdwn.setBounds(119, 179, 153, 22);
		drpdwn.setOpaque(true);
		drpdwn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		drpdwn.setBackground(Color.black);
		drpdwn.setForeground(Color.WHITE);
		donnees.add(drpdwn);
		
		JLabel hauteur = new JLabel("Hauteur:");
		hauteur.setForeground(new Color(0, 0, 0));
		hauteur.setVisible(false);
		hauteur.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		hauteur.setBounds(23, 219, 97, 28);
		donnees.add(hauteur);
		
		h = new JTextField();
		h.setColumns(10);
		l.setOpaque(true);
		h.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		h.setBackground(Color.black);
		h.setForeground(Color.WHITE);
		h.setVisible(false);
		h.setBounds(119, 227, 153, 22);
		donnees.add(h);
		
		JLabel rayon = new JLabel("Rayon:");
		rayon.setForeground(new Color(0, 0, 0));
		rayon.setVisible(false);
		rayon.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		rayon.setBounds(23, 219, 97, 28);
		donnees.add(rayon);
		
		JLabel longeur = new JLabel("Longeur:");
		longeur.setForeground(new Color(0, 0, 0));
		longeur.setVisible(false);
		longeur.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		longeur.setBounds(23, 219, 97, 28);
		donnees.add(longeur);
		
		JLabel largeur = new JLabel("Largeur:");
		largeur.setForeground(new Color(0, 0, 0));
		largeur.setVisible(false);
		largeur.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		largeur.setBounds(23, 273, 97, 28);
		donnees.add(largeur);
		
		l = new JTextField();
		l.setColumns(10);
		l.setOpaque(true);
		l.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		l.setBackground(Color.black);
		l.setForeground(Color.WHITE);
		l.setVisible(false);
		l.setBounds(119, 281, 153, 22);
		donnees.add(l);
		
		JLabel lblLargeur = new JLabel("Couleur:");
		lblLargeur.setForeground(new Color(0, 0, 0));
		lblLargeur.setVisible(false);
		lblLargeur.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		lblLargeur.setBounds(23, 328, 97, 28);
		donnees.add(lblLargeur);
		
//		JComboBox coul = new JComboBox();
		coul.setBounds(119, 335, 153, 22);
		coul.setOpaque(true);
		coul.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		coul.setBackground(Color.black);
		coul.setForeground(Color.WHITE);
		coul.setVisible(false);
		donnees.add(coul);
		
		JButton btn = new JButton("show me!");
		btn.setBorder(null);
		btn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn.setForeground(new Color(0, 0, 0));
		btn.setVisible(false);
		btn.setBackground(new Color(105, 105, 105));
		btn.setBounds(39, 390, 222, 36);
		donnees.add(btn);
		
		JPanel dessin = new JPanel();
		dessin.setBounds(300, 31, 649, 569);
		
		dessin.setLayout(new BorderLayout(00, 00));
		p.add(dessin);
		
		JLabel fermer = new JLabel("X");
		fermer.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fermer.setBackground(Color.red);
				fermer.setForeground(Color.red);
			}
		});
		fermer.setBackground(new Color(0, 0, 0));
		fermer.setBounds(918, 0, 22, 23);
		p.add(fermer);
		fermer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		fermer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		fermer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		///////////// listeners
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
		
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int ha=0 ,la=0;
				String haut = "0";
				String larg ="0";
				System.out.println("hauteur = "+ha+"largeur = "+la);
				if(h.isVisible()==true) {
					haut = h.getText() ;
				}
				if(l.isVisible()==true) {
					larg = l.getText() ;
				}
				ha = Integer.parseInt(haut);
				la = Integer.parseInt(larg);
				System.out.println("hauteur = "+ha+"largeur = "+la);
				

				
				if (frmchs=="segment") {
					if(i!=0 ) {

						dessin.removeAll();
					}
					
					segment s = new segment(ha, couleur);
					repaint();
					revalidate();
					
					dessin.add(s, BorderLayout.CENTER);
					
					repaint();
					revalidate();
					System.out.println("in first" +i);
					i=1;
					
				
				}
				
				
				if (frmchs=="cercle") {
					if(i!=0) {

						dessin.removeAll();
					}
					cercle c = new cercle(ha,couleur);
					dessin.add(c, BorderLayout.CENTER);
					repaint();
					revalidate();
					System.out.println("in first" +i);
					i=1;
					
				
				}
				if(frmchs=="carre") {
					System.out.println("in sect");
					if(i!=0) {
//						int comp = dessin.getComponentCount();
//						dessin.remove(comp);
						dessin.removeAll();
						
					}
					rectangle rec =new rectangle(ha, ha, couleur);
					dessin.add(rec, BorderLayout.CENTER);
					repaint();
					revalidate();
					System.out.println("in sec");
					i=1;
				}
				
				if(frmchs=="ellipse") {
					
					if(i!=0) {
						dessin.removeAll();
						
					}
					ellipse nb =new ellipse(la, ha,couleur);
					dessin.add(nb, BorderLayout.CENTER);
					repaint();
					revalidate();
					System.out.println("in third , i ="+i);
					i=1;
					System.out.println("in third , i ="+i);
				}
				
				if(frmchs=="rectangle") {
					System.out.println("in forth");
					if(i!=0) {
						dessin.removeAll();
					}
					rectangle rec =new rectangle(ha, la, couleur);
					dessin.add(rec, BorderLayout.CENTER);
					repaint();
					revalidate();
					System.out.println("in forth");
					i=1;
				}
			}});
		
		
		
		drpdwn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int choixForm = drpdwn.getSelectedIndex() ;
				
				if(choixForm ==1) {

					System.out.println("Segment");
					frmchs ="segment";
					rayon.setVisible(false);
					hauteur.setVisible(false);
					largeur.setVisible(false);
					longeur.setVisible(true);
					h.setVisible(true);
					l.setVisible(false);
					coul.setVisible(true);
					lblLargeur.setVisible(true);
					btn.setVisible(true);
					 
					
				}
				if(choixForm == 2) {
					System.out.println("Carre");
					frmchs="carre";
					rayon.setVisible(false);
					hauteur.setVisible(false);
					largeur.setVisible(false);
					longeur.setVisible(true);
					h.setVisible(true);
					l.setVisible(false);
					coul.setVisible(true);
					lblLargeur.setVisible(true);
					btn.setVisible(true);
				}
				if(choixForm ==3) {
					System.out.println("Cercle");
					frmchs = "cercle";
					hauteur.setVisible(false);
					longeur.setVisible(false);
					largeur.setVisible(false);
					rayon.setVisible(true);
					h.setVisible(true);
					l.setVisible(false);
					coul.setVisible(true);
					lblLargeur.setVisible(true);
					btn.setVisible(true);
					
				}
				if(choixForm ==4) {
					System.out.println("Rectangle");
					frmchs = "rectangle";
					longeur.setVisible(false);
					rayon.setVisible(false);
					hauteur.setVisible(true);
					h.setVisible(true);
					largeur.setVisible(true);
					l.setVisible(true);
					coul.setVisible(true);
					lblLargeur.setVisible(true);
					btn.setVisible(true);
				}
				if(choixForm ==5) {
					System.out.println("Ellipse");
					frmchs = "ellipse";
					hauteur.setVisible(true);
					longeur.setVisible(false);
					rayon.setVisible(false);
					h.setVisible(true);
					largeur.setVisible(true);
					l.setVisible(true);
					coul.setVisible(true);
					lblLargeur.setVisible(true);
					btn.setVisible(true);
				}

			}

			
		});

	}
}
