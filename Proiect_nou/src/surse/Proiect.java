package surse;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;


public class Proiect {

	private JFrame frame;
	private JTextField Nume;
	
	
	private int nrIntrebare = 0;
	private int k = 0 ;
	private int score = 0;
	private String raspuns1, raspuns2, raspuns3, raspuns4 , raspuns5;
	
	
	private String caleFisier ="C:\\Users\\SONY\\Documents\\Facultate\\Laboratoare Java\\Proiect_nou\\fisier.txt";
	private String caleFisierRaspunsuri = "C:\\Users\\SONY\\Documents\\Facultate\\Laboratoare Java\\Proiect_nou\\raspunsuri.txt";
	private String caleFisierRasCorecte = "C:\\Users\\SONY\\Documents\\Facultate\\Laboratoare Java\\Proiect_nou\\raspunsuriCorecte.txt ";
	String caleIntrebari = "C:\\Users\\SONY\\Documents\\Facultate\\Laboratoare Java\\Proiect_nou\\intrebari.txt ";
	String caleRaspunsuri2 = "C:\\Users\\SONY\\Documents\\Facultate\\Laboratoare Java\\Proiect_nou\\raspunsuri2.txt";
	
	
	private String intrebari [] = new String [10];
	private String raspunsuri [] = new String [50];
	private ArrayList<String>raspunsuriCorecte = new ArrayList<String>();
    
    
    ManagerFisier  mf = new ManagerFisier(caleFisier, caleFisierRaspunsuri, caleFisierRasCorecte);
    ManagerFisier  mf2 = new ManagerFisier(caleIntrebari , caleRaspunsuri2, caleFisierRasCorecte);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proiect window = new Proiect();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proiect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(240, 248, 255));
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.getContentPane().setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		frame.setBounds(100, 100, 550, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Nume = new JTextField();
		Nume.setForeground(new Color(0, 0, 0));
		Nume.setBackground(new Color(245, 245, 245));
		Nume.setFont(new Font("Yu Gothic", Font.PLAIN, 19));
		Nume.setBounds(101, 61, 305, 20);
		frame.getContentPane().add(Nume);
		Nume.setColumns(10);
		
		JLabel lblNume = new JLabel("Numele:");
		lblNume.setBounds(47, 22, 487, 14);
		frame.getContentPane().add(lblNume);
		
		JButton btnCat1 = new JButton("Logica");
		btnCat1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCat1.setForeground(new Color(255, 255, 255));
		btnCat1.setBackground(new Color(199, 21, 133));
		
		btnCat1.setBounds(111, 92, 147, 23);
		frame.getContentPane().add(btnCat1);
		
		JButton btnCat2 = new JButton("Cultura Generala");
		btnCat2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCat2.setForeground(new Color(255, 255, 240));
		btnCat2.setBackground(new Color(199, 21, 133));
		
		btnCat2.setBounds(290, 92, 147, 23);
		frame.getContentPane().add(btnCat2);
		
		JButton btnFinish = new JButton("SFARSIT");
		btnFinish.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinish.setForeground(new Color(240, 248, 255));
		btnFinish.setBackground(new Color(199, 21, 133));
		
		btnFinish.setBounds(299, 249, 89, 23);
		frame.getContentPane().add(btnFinish);
		
		

		JButton btnSubmit = new JButton("START JOC !");
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBackground(new Color(0, 128, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(167, 134, 167, 57);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBackground(new Color(199, 21, 133));
		btnNext.setToolTipText("");
		
		btnNext.setBounds(411, 249, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JRadioButton radiobuton2 = new JRadioButton("Raspuns2");
		radiobuton2.setBackground(new Color(255, 245, 238));
		radiobuton2.setForeground(new Color(0, 0, 0));
		
		radiobuton2.setBounds(126, 122, 280, 23);
		frame.getContentPane().add(radiobuton2);
		
		JRadioButton radiobuton1 = new JRadioButton("Raspuns1");
		radiobuton1.setBackground(new Color(255, 245, 238));
		
		radiobuton1.setBounds(126, 88, 280, 23);
		frame.getContentPane().add(radiobuton1);
		
		JLabel lblintrebari = new JLabel("Intrebare");
		lblintrebari.setForeground(new Color(0, 0, 0));
		lblintrebari.setBackground(new Color(238, 232, 170));
		lblintrebari.setBounds(15, 47, 645, 20);
		frame.getContentPane().add(lblintrebari);
		
		JRadioButton radiobuton3 = new JRadioButton("Raspuns3");
		radiobuton3.setBackground(new Color(255, 245, 238));
		
		radiobuton3.setBounds(126, 151, 280, 23);
		frame.getContentPane().add(radiobuton3);
		
		JRadioButton radiobuton4 = new JRadioButton("Raspuns4");
		radiobuton4.setBackground(new Color(255, 245, 238));
		
		radiobuton4.setBounds(126, 185, 280, 23);
		frame.getContentPane().add(radiobuton4);
		
		JButton btnRaspunsuri = new JButton("Raspunsuri\r\n Corecte");
		btnRaspunsuri.setForeground(new Color(240, 248, 255));
		btnRaspunsuri.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRaspunsuri.setBackground(new Color(60, 179, 113));
		
		btnRaspunsuri.setBounds(167, 126, 215, 52);
		frame.getContentPane().add(btnRaspunsuri);
		
		JRadioButton radiobuton5 = new JRadioButton("Raspuns5");
		radiobuton5.setBackground(new Color(255, 245, 238));
		
		radiobuton5.setBounds(126, 219, 280, 23);
		frame.getContentPane().add(radiobuton5);
		
		JButton btnclose = new JButton("EXIT");
		btnclose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnclose.setBackground(new Color(220, 20, 60));
		
		btnclose.setBounds(29, 249, 89, 23);
		frame.getContentPane().add(btnclose);
		
		btnNext.setVisible(false);
		radiobuton2.setVisible(false);
		radiobuton1.setVisible(false);
		radiobuton3.setVisible(false); 
		radiobuton4.setVisible(false);
		radiobuton5.setVisible(false);
		lblintrebari.setVisible(false);
		
		btnFinish.setVisible(false);
		btnCat1.setVisible(false);
		btnCat2.setVisible(false);
		btnRaspunsuri.setVisible(false);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				btnCat1.setVisible(true);
				btnCat2.setVisible(true);
				lblintrebari.setVisible(true);
				lblNume.setVisible(false);
				Nume.setVisible(false);
                btnSubmit.setVisible(false);
                btnRaspunsuri.setVisible(false);
                
                
                
                lblintrebari.setText(Nume.getText()  + " Alege-ti una dintre categorii !");
                
                
				
			}
			
		});
		
		btnCat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblintrebari.setText("                                                                      Mult Succes !");
				btnNext.setVisible(true);
				btnCat1.setVisible(false);
				btnCat2.setVisible(false);
				btnRaspunsuri.setVisible(false);
				
				 intrebari = mf.citesteIntrebarile();
				 raspunsuri = mf.citesteRaspunsuri();
				 k = 0 ; 
				 
				 btnFinish.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
						 mf.scriereRaspunsuri(raspunsuriCorecte);
						
					}
				});
				 
				 
				 
			}
		});
		
		btnCat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblintrebari.setText("Mult succes!");
				btnNext.setVisible(true);
				btnCat1.setVisible(false);
				btnCat2.setVisible(false);
				btnRaspunsuri.setVisible(false);
				
				intrebari = mf2.citesteIntrebarile();
				raspunsuri = mf2.citesteRaspunsuri();
				 k = 0 ; 
				 
				 btnFinish.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
						 mf2.scriereRaspunsuri(raspunsuriCorecte);
						
					}
				});
				
			}
		});
		
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				radiobuton1.setSelected(false);
				radiobuton2.setSelected(false);
				radiobuton3.setSelected(false);
				radiobuton4.setSelected(false);
				radiobuton5.setSelected(false);
			
				
				radiobuton2.setVisible(true);
				radiobuton1.setVisible(true);
				radiobuton3.setVisible(true); 
				radiobuton4.setVisible(true);
				radiobuton5.setVisible(true);
				btnRaspunsuri.setVisible(false);
				
				radiobuton1.setEnabled(true);
				radiobuton2.setEnabled(true);
				radiobuton3.setEnabled(true);
				radiobuton4.setEnabled(true);
				radiobuton5.setEnabled(true);
				btnNext.setEnabled(false);
				
				
				lblintrebari.setText(intrebari[nrIntrebare]);
				nrIntrebare++;
				
				/*raspuns1 = raspunsuri[k];
				k++;
				raspuns1 = raspuns1.replace('*', ' ');
				radiobuton1.setText(raspunsuri[k]);
				
				raspuns2 = raspunsuri[k];
				k++;
				raspuns2 = raspuns2.replace('*', ' ');
				radiobuton2.setText(raspunsuri[k]);
				
				raspuns3 = raspunsuri[k];
				k++;
				raspuns3 = raspuns3.replace('*', ' ');
				radiobuton3.setText(raspunsuri[k]);
				
				raspuns4 = raspunsuri[k];
				k++;
				raspuns4 = raspuns4.replace('*', ' ');
				radiobuton4.setText(raspunsuri[k]);*/
				
				
				/*radiobuton1.setText(raspunsuri[k]);
				raspuns1 = raspunsuri[k];
				k++;
				radiobuton2.setText(raspunsuri[k]);
				raspuns2 = raspunsuri[k];
				k++;
				radiobuton3.setText(raspunsuri[k]);
				raspuns3 = raspunsuri[k];
				k++;
				radiobuton4.setText(raspunsuri[k]);
				raspuns4 = raspunsuri[k];
    			k++;*/
				
				raspuns1 = raspunsuri[k];
				 if(raspunsuri[k].startsWith("*") ) {
					 raspunsuri[k] = raspunsuri[k].substring(1);
				 }
				 radiobuton1.setText(raspunsuri[k]);
				 k++;
				 
				 raspuns2 = raspunsuri[k];
				 if(raspunsuri[k].startsWith("*") ) {
					 raspunsuri[k] = raspunsuri[k].substring(1);
				 }
				 radiobuton2.setText(raspunsuri[k]);
				 k++;
				 
				 raspuns3 = raspunsuri[k];
				 if(raspunsuri[k].startsWith("*") ) {
					 raspunsuri[k] = raspunsuri[k].substring(1);
				 }
				 radiobuton3.setText(raspunsuri[k]);
				 k++;
				 
				 raspuns4 = raspunsuri[k];
				 if(raspunsuri[k].startsWith("*") ) {
					 raspunsuri[k] = raspunsuri[k].substring(1);
				 }
				 radiobuton4.setText(raspunsuri[k]);
				 k++;
				 
				 raspuns5 = raspunsuri[k];
				 if(raspunsuri[k].startsWith("*") ) {
					 raspunsuri[k] = raspunsuri[k].substring(1);
				 }
				 radiobuton5.setText(raspunsuri[k]);
				 k++;
				 
				if(nrIntrebare == 10) {

					btnNext.setVisible(false);
					btnFinish.setVisible(true);
					btnFinish.setEnabled(false);
				
				}
				 
				
				 
				 
				
			}
		});
		
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				radiobuton2.setVisible(false);
				radiobuton1.setVisible(false);
				radiobuton3.setVisible(false); 
				radiobuton4.setVisible(false);
				radiobuton5.setVisible(false);
				btnFinish.setVisible(false);
				lblintrebari.setVisible(false);
				lblNume.setVisible(true);
				btnRaspunsuri.setVisible(true);
				
	
				/*lblintrebari.setText("Raspunsurile tale corecte sunt " + raspunsuriCorecte);*/
              
				lblNume.setText("Jocul s-a terminat! Felicitari !" + " " + Nume.getText() +"  "+"Ai raspuns corect la: "+ score + " din 10 intrebari");
				
				
				
			}
		});
		
		radiobuton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( radiobuton1.isEnabled()) {
					radiobuton2.setEnabled(false);
					radiobuton3.setEnabled(false);
					radiobuton4.setEnabled(false);
					radiobuton5.setEnabled(false);
					btnNext.setEnabled(true);
					
				}
				
				if (raspuns1.startsWith("*")) {
					score++;
					raspunsuriCorecte.add(raspuns1);
				}
				
				if(radiobuton1.isEnabled() && nrIntrebare == 10) {
					btnFinish.setEnabled(true);
				}
			
			}
		});
		
		radiobuton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( radiobuton2.isEnabled()) {
					radiobuton1.setEnabled(false);
					radiobuton3.setEnabled(false);
					radiobuton4.setEnabled(false);
					radiobuton5.setEnabled(false);
					btnNext.setEnabled(true);
					
				}
				
				if (raspuns2.startsWith("*")) {
					score++;
					raspunsuriCorecte.add(raspuns2);
				}
				
				if(radiobuton2.isEnabled() && nrIntrebare == 10) {
					btnFinish.setEnabled(true);
				}
			}
			
		});
		
		radiobuton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( radiobuton3.isEnabled()) {
					radiobuton1.setEnabled(false);
					radiobuton2.setEnabled(false);
					radiobuton4.setEnabled(false);
					radiobuton5.setEnabled(false);
					btnNext.setEnabled(true);
					
				}
				
				if (raspuns3.startsWith("*")) {
					score++;
					raspunsuriCorecte.add(raspuns3);
				}
				if(radiobuton3.isEnabled() && nrIntrebare == 10) {
					btnFinish.setEnabled(true);
				}
			}
		});
		
		radiobuton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( radiobuton4.isEnabled()) {
					radiobuton1.setEnabled(false);
					radiobuton2.setEnabled(false);
					radiobuton3.setEnabled(false);
					radiobuton5.setEnabled(false);
					btnNext.setEnabled(true);
					
				}
				
				if (raspuns4.startsWith("*")) {
					score++;
					raspunsuriCorecte.add(raspuns4);
				}
				if(radiobuton4.isEnabled() && nrIntrebare == 10) {
					btnFinish.setEnabled(true);
				}
			}
			
		});
		radiobuton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( radiobuton5.isEnabled()) {
					radiobuton1.setEnabled(false);
					radiobuton2.setEnabled(false);
					radiobuton3.setEnabled(false);
					radiobuton4.setEnabled(false);
					btnNext.setEnabled(true);
					
				}
				
				if (raspuns5.startsWith("*")) {
					score++;
					raspunsuriCorecte.add(raspuns5);
				}
				if(radiobuton5.isEnabled() && nrIntrebare == 10) {
					btnFinish.setEnabled(true);
				}
			}
		});
		
		btnRaspunsuri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Raspunsurile tale corecte sunt: " + raspunsuriCorecte);
			}
		});
		
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
