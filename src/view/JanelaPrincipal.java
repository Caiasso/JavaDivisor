package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldResultado;
	private JTextField fieldPrimeiroNum;
	private JTextField fieldSegundoNum;
	private JButton buttonDividir;
	private JButton buttonLimpar;

	
	public JanelaPrincipal() {
		setTitle("Atividade Prática I - Guilherme Henrique Caiasso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		panelNorte.setBackground(Color.PINK);
		panelNorte.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new BoxLayout(panelNorte, BoxLayout.X_AXIS));
		
		fieldResultado = new JTextField();
		fieldResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		fieldResultado.setPreferredSize(new Dimension(600,70));
		panelNorte.add(fieldResultado);
		fieldResultado.setColumns(10);
		
		JPanel panelCentro = new JPanel();
		panelCentro.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCentro.setBackground(Color.PINK);
		FlowLayout flowLayout = (FlowLayout) panelCentro.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelCentro, BorderLayout.CENTER);
		
		JLabel labelPrimeiroNum = new JLabel("Primeiro Número");
		labelPrimeiroNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelCentro.add(labelPrimeiroNum);
		
		fieldPrimeiroNum = new JTextField();
		fieldPrimeiroNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelCentro.add(fieldPrimeiroNum);
		fieldPrimeiroNum.setColumns(10);
		
		JLabel labelSegundoNum = new JLabel("Segundo Número");
		labelSegundoNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelCentro.add(labelSegundoNum);
		
		fieldSegundoNum = new JTextField();
		fieldSegundoNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldSegundoNum.setColumns(10);
		panelCentro.add(fieldSegundoNum);
		
		JPanel panelSul = new JPanel();
		panelSul.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelSul.setBackground(Color.PINK);
		FlowLayout flowLayout_1 = (FlowLayout) panelSul.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelSul, BorderLayout.SOUTH);
		
		buttonDividir = new JButton("Dividir");
		buttonDividir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSul.add(buttonDividir);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSul.add(buttonLimpar);
	}

	public JTextField getFieldResultado() {
		return fieldResultado;
	}

	public void setFieldResultado(JTextField fieldResultado) {
		this.fieldResultado = fieldResultado;
	}

	public JTextField getFieldPrimeiroNum() {
		return fieldPrimeiroNum;
	}

	public void setFieldPrimeiroNum(JTextField fieldPrimeiroNum) {
		this.fieldPrimeiroNum = fieldPrimeiroNum;
	}

	public JTextField getFieldSegundoNum() {
		return fieldSegundoNum;
	}

	public void setFieldSegundoNum(JTextField fieldSegundoNum) {
		this.fieldSegundoNum = fieldSegundoNum;
	}

	public JButton getButtonDividir() {
		return buttonDividir;
	}

	public void setButtonDividir(JButton buttonDividir) {
		this.buttonDividir = buttonDividir;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}
	
	public void limpaCampo()
	{
		fieldResultado.setText("");
		fieldPrimeiroNum.setText("");
		fieldSegundoNum.setText("");
	}

}
