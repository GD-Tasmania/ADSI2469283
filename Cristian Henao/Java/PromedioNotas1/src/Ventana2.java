import java.io.IOException; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;

public class Ventana2 extends JFrame implements ActionListener {
	JPanel mipanel;
	JButton boton3;
	
	public Ventana2() {
		iniciarComponente();
		setTitle("Don Aparato");
		setSize(500,400);
		setLocationRelativeTo(null);
		}
	private void iniciarComponente() {
		mipanel=new JPanel();
		mipanel.setLayout(null);
		mipanel.setBackground(Color.blue);
		
		boton3 = new JButton();
		boton3.setBounds(186, 306, 113, 30);
		boton3.setText("Consultar");
		boton3.addActionListener(this);
		
		mipanel.add(boton3);
		add(mipanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
