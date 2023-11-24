package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Divisao;
import view.JanelaPrincipal;

public class DivisaoControle implements ActionListener{

	private Divisao div;
	private JanelaPrincipal jan;
	
	public DivisaoControle(Divisao div, JanelaPrincipal jan) {
		super();
		this.div = div;
		this.jan = jan;
		registraListenersAcao();
	}

	public void registraListenersAcao()
	{
		jan.getButtonDividir().addActionListener(this);
		jan.getButtonLimpar().addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Dividir"))
		{	
			
			if(jan.getFieldPrimeiroNum().getText().equals("") || jan.getFieldSegundoNum().getText().equals(""))
			{
				System.out.println("NumberFormatException: Os dois campos devem estar preenchidos para que a operação de divisão seja realizada");
				jan.limpaCampo();
			}
			
			else {
				double valor1 = Double.parseDouble(jan.getFieldPrimeiroNum().getText());
				double valor2 = Double.parseDouble(jan.getFieldSegundoNum().getText());
				if(valor1 == 0 || valor2 == 0)
				{
					System.out.println("ArithmeticException: Nenhum dos campos deve ser preenchido com valor 0.");
					jan.limpaCampo();
				}
				else
				{
					jan.getFieldResultado().setText(div.toString(valor1, valor2));					
				}
			}
			
			
		}
		else if(e.getActionCommand().equals("Limpar"))
		{
			jan.limpaCampo();
		}
		
	}
	
}
