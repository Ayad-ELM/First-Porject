package TP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Playspace extends JPanel  {
	private Timer timer;
	private int ballSpeed = 10,
			value = 3,
			valueY = -8,
			value1 = 3,
			valueY1 = -5,
			ballXpos = 50,
			ballYpos = 300,
			ballXpos1 = 50,
			ballYpos1 = 70;
	public Playspace() {
		addKeyListener(new KeyAdapter() {
		
			
		});
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setPreferredSize(new Dimension(690, 600));
		timer = new Timer(ballSpeed,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(new Rectangle(ballXpos, ballYpos, 30, 30).intersects(new Rectangle(ballXpos1, ballYpos1, 30, 30))) {
					
					value = -value;
					valueY = -valueY;
					value1 = -value1;
					valueY1 = -valueY1;
				}
				
				
				if(ballXpos >=640 || ballXpos <=0) {
					value = -value;
				}
				if(ballYpos < 0) {
					valueY = -valueY;
				}
				if(ballYpos > 565) {
					valueY = -valueY;
				}
				
				/////////////
				
				if(ballXpos1 >=640 || ballXpos1 <=0) {
					value1 = -value1;
				}
				if(ballYpos1 < 0) {
					valueY1 = -valueY1;
				}
				if(ballYpos1 > 565) {
					valueY1 = -valueY1;
				}
				
				
				ballXpos+=value;
				ballYpos+=valueY;
				ballXpos1+=value1;
				ballYpos1+=valueY1;
				repaint();
			}
		});
		timer.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(1, 1, 700, 600);
		g.setColor(Color.GREEN);
		g.fillOval(ballXpos, ballYpos, 30, 30);
		g.setColor(Color.WHITE);
		g.fillOval(ballXpos1, ballYpos1, 30, 30);
	}
}
