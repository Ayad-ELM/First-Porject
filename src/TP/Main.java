package TP;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main(String ch) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		add(new Playspace());
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Main m = new Main("Breaker");
	}

}
