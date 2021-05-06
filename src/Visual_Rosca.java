import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class Visual_Rosca extends JFrame {

	JLabel L1, L2, L3, L4;
	static JLabel LI1,LI2,LI3,LI4,LI5,LI6,LI7,LI8,LI9,LI10,LI11;
	private static JLabel LI7_1;
	static JButton btMontar, btNovo, btSair;
	Calculo_Rosca c=new Calculo_Rosca();
	JMenuBar mnBarra;
	JMenuItem miAjuda, miNovo, miAutores;
	
	static JRadioButton rbMChocolate,rbMBaunilha, rbMMorango,
	rbCChocolate,rbCBaunilha,rbCMorango,rbEGranulado,rbEGranuladoColorido,rbEPaçoca,rbEAmendoim;
	
	static ButtonGroup btgMassa,btgCobertura,btgExtra;
	public Visual_Rosca() {
	
		super ("Rosquinha virtual");
		setResizable(false);
		getContentPane().setLayout(null);
		setBounds(0, 0, 850, 700);
		
		mnBarra=new JMenuBar();
		miAjuda=new JMenuItem("Ajuda");
		miAjuda.setAccelerator(KeyStroke.getKeyStroke((KeyEvent.VK_A),ActionEvent.ALT_MASK));
		miNovo=new JMenuItem("Novo");
		miNovo.setAccelerator(KeyStroke.getKeyStroke((KeyEvent.VK_N),ActionEvent.ALT_MASK));
		miAutores=new JMenuItem("Sobre");
		miAutores.setAccelerator(KeyStroke.getKeyStroke((KeyEvent.VK_S),ActionEvent.ALT_MASK));
		
		setJMenuBar(mnBarra);
		mnBarra.add(miAjuda);
		mnBarra.add(miAutores);
		mnBarra.add(miNovo);
	
	L1=new JLabel("1) Escolha a sua massa: ");
	L1.setFont(new Font("Arial",Font.BOLD,14));
	L1.setBounds(30, 40, 200, 10);
	
	rbMChocolate=new JRadioButton("Chocolate");
	rbMChocolate.setSelected(false);
	rbMChocolate.setBounds(75, 190, 100, 25);
	
	rbMBaunilha=new JRadioButton("Baunilha");
	rbMBaunilha.setSelected(false);
	rbMBaunilha.setBounds(225, 190, 100, 25);
	
	rbMMorango=new JRadioButton("Morango");
	rbMMorango.setSelected(false);
	rbMMorango.setBounds(375, 190, 100, 25);
	
	LI1=new JLabel();
	LI1.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_chocolate.png")));
	LI1.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI1.setBounds(60,70,121,107);
	
	LI2=new JLabel();
	LI2.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_baunilha.png")));
	LI2.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI2.setBounds(210,70,121,107);
	
	LI3=new JLabel();
	LI3.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_morango.png")));
	LI3.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI3.setBounds(360,70,121,107);
	
	L2=new JLabel("2) Escolha a cobertura: ");
	L2.setFont(new Font("Arial",Font.BOLD,14));
	L2.setBounds(30,250, 200, 10);
	
	LI4=new JLabel();
	LI4.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Cobertura de Chocolate.png")));
	LI4.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI4.setBounds(60,280,121,107);
	
	LI5=new JLabel();
	LI5.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Cobertura de Baunilha.png")));
	LI5.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI5.setBounds(210,280,121,107);
	
	LI6=new JLabel();
	LI6.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Cobertura de Morango.png")));
	LI6.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI6.setBounds(360,280,121,107);

	rbCChocolate=new JRadioButton("Chocolate");
	rbCChocolate.setSelected(false);
	rbCChocolate.setBounds(75, 400, 100, 25);
	
	rbCBaunilha=new JRadioButton("Baunilha");
	rbCBaunilha.setSelected(false);
	rbCBaunilha.setBounds(225, 400, 100, 25);
	
	rbCMorango=new JRadioButton("Morango");
	rbCMorango.setSelected(false);
	rbCMorango.setBounds(375, 400, 100, 25);

	L3=new JLabel("3) Escolha seu extra: ");
	L3.setFont(new Font("Arial",Font.BOLD,14));
	L3.setBounds(30,460, 200, 10);
	
	LI7=new JLabel();
	LI7.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI7.setBounds(60,490,121,107);
	
	LI8=new JLabel();
	LI8.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Amendoim.png")));
	LI8.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI8.setBounds(210,490,121,107);
	
	LI9=new JLabel();
	LI9.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Farinha de Pa\u00E7oca.png")));
	LI9.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI9.setBounds(360,490,121,107);
	
	LI10=new JLabel();
	LI10.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Granulado Colorido.png")));
	LI10.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI10.setBounds(510,490,121,107);
	
	LI7_1=new JLabel();
	LI7_1.setIcon(new ImageIcon(getClass().getResource("images\\Coberturas\\Granulado.png")));
	LI7_1.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI7_1.setBounds(60,490,121,107);
	
	rbEGranulado=new JRadioButton("Granulado");
	rbEGranulado.setSelected(false);
	rbEGranulado.setBounds(75, 610, 100, 25);
	
	rbEAmendoim=new JRadioButton("Amendoim");
	rbEAmendoim.setSelected(false);
	rbEAmendoim.setBounds(225, 610, 100, 25);
		
	rbEPaçoca=new JRadioButton("Paçoca");
	rbEPaçoca.setSelected(false);
	rbEPaçoca.setBounds(375, 610, 100, 25);
	
	rbEGranuladoColorido=new JRadioButton("Granulado e Colorido");
	rbEGranuladoColorido.setSelected(false);
	rbEGranuladoColorido.setBounds(525, 610, 200, 25);
	
	L4=new JLabel("Resultado");
	L4.setFont(new Font("Arial",Font.BOLD,16));
	L4.setBounds(660, 60, 100, 20);
	
	LI11=new JLabel();
	LI11.setBorder(BorderFactory.createLineBorder(Color.pink,2));
	LI11.setBounds(600,100,213,189);
	
	btMontar=new JButton("Montar");
	btMontar.setMnemonic(KeyEvent.VK_M);
	btMontar.setToolTipText("Clique aqui para finalizar e exibir sua rosquinha!");
	btMontar.setBounds(600,305,200,50);
	
	btNovo=new JButton("Novo");
	btNovo.setMnemonic(KeyEvent.VK_N);
	btNovo.setToolTipText("Iniciar uma nova rosquinha");
	btNovo.setBounds(600,365,200,50);
	
	btSair=new JButton("Sair");
	btSair.setMnemonic(KeyEvent.VK_S);
	btSair.setToolTipText("Sair do programa :(");
	btSair.setBounds(600,425,200,50);
	
	btgMassa=new ButtonGroup();
	btgMassa.add(rbMChocolate);
	btgMassa.add(rbMBaunilha);
	btgMassa.add(rbMMorango);
	
	btgCobertura=new ButtonGroup();
	btgCobertura.add(rbCChocolate);
	btgCobertura.add(rbCBaunilha);
	btgCobertura.add(rbCMorango);
	
	btgExtra=new ButtonGroup();
	btgExtra.add(rbEGranulado);
	btgExtra.add(rbEGranuladoColorido);
	btgExtra.add(rbEPaçoca);
	btgExtra.add(rbEAmendoim);
	
	btMontar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (rbMBaunilha.isSelected()==false&&rbMChocolate.isSelected()==false&&rbMMorango.isSelected()==false &&rbCChocolate.isSelected()==false&&rbCMorango.isSelected()==false&&rbMBaunilha.isSelected()==false&&rbEAmendoim.isSelected()==false&&rbEPaçoca.isSelected()==false&&rbEGranulado.isSelected()==false&&rbEGranuladoColorido.isSelected()==false){
				JOptionPane.showMessageDialog(null, "ERRO, SELECIONE PELO MENOS 1 OPÇÃO.", "***ERRO***", JOptionPane.ERROR_MESSAGE);
			}
			else{
				c.Montar();		
			}
			
		}
	});
	
	btNovo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
						c.Novo();
		}
	});
	
	btSair.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
							c.Sair();
		}
	});
	
	miAjuda.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Para montar a sua rosquinha, selecione sua massa, sua cobertura e\n seu extra (opcional).\n Quando terminar, basta clicar no botão 'Montar' e sua rosquinha aparecerá na caixa.\n Para começar uma nova, clique em Novo.\n\n Divirta-se!", "***AJUDA***", JOptionPane.INFORMATION_MESSAGE);
		}
	});
	
	miNovo.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			c.Novo();
		}
	});
	
	miAutores.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "O projeto tem como base mostrar os conhecimentos de Java adquiridos\ndurante o segundo módulo do curso técnico de informática.\nO intuito do projeto é mostrar o uso prático de Java, além de\ndivertir o usuário do programa.\nFeito por: Elize Delabrida;\nGiovani Duarte;\nIsabela Freire;\nJulia Muniz;\nMatheus Pavanini;\nTiago Pires.\n2º módulo de Informática", "Sobre o Projeto", JOptionPane.INFORMATION_MESSAGE);
		}
	});
	
	getContentPane().add(L1);
	getContentPane().add(L2);
	getContentPane().add(L3);
	getContentPane().add(L4);
	getContentPane().add(LI1);
	getContentPane().add(LI2);
	getContentPane().add(LI3);
	getContentPane().add(LI4);
	getContentPane().add(LI5);
	getContentPane().add(LI6);
	getContentPane().add(LI7_1);
	getContentPane().add(LI8);
	getContentPane().add(LI9);
	getContentPane().add(LI10);
	getContentPane().add(LI11);
	getContentPane().add(rbMChocolate);
	getContentPane().add(rbMBaunilha);
	getContentPane().add(rbMMorango);
	getContentPane().add(rbCChocolate);
	getContentPane().add(rbCBaunilha);
	getContentPane().add(rbCMorango);
	getContentPane().add(rbEGranulado);
	getContentPane().add(rbEGranuladoColorido);
	getContentPane().add(rbEPaçoca);
	getContentPane().add(rbEAmendoim);
	getContentPane().add(btMontar);
	getContentPane().add(btNovo);
	getContentPane().add(btSair);
	
	
	}

	public static void main(String[] args) {
		Visual_Rosca tela= new Visual_Rosca();
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    Dimension janela=Toolkit.getDefaultToolkit().getScreenSize();
	    tela.setLocation((janela.width-tela.getSize().width)/2,(janela.height-tela.getSize().height)/2);
	    tela.setUndecorated(true);
	    tela.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
	    tela.setVisible(true);
	    
	}

	

}

