package controller;

import model.Divisao;
import view.JanelaPrincipal;

public class AplicacaoPrincipal {

	public static void main(String[] args) {
		
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		Divisao div = new Divisao();
		DivisaoControle divCon = new DivisaoControle(div, jan);
		
	}
	
}
