import javax.swing.JFrame;
import java.io.IOException; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;

public class Ventana1 extends JFrame implements ActionListener {

public static double valor1,cantidad1,total,descuento;

JPanel mipanel;
JButton boton1,boton2;
JLabel title,datos,nombre,edad,telefono,tipo;
JTextField campo1,campo2,campo3,campo4;

public static double n1,n2,n3;

public Ventana1() {
iniciarComponente();
setTitle("Don Aparato");
setSize(500,400);
setLocationRelativeTo(null);
}

private void iniciarComponente() {
mipanel=new JPanel();
mipanel.setLayout(null);
mipanel.setBackground(new Color(0, 128, 255));

title=new JLabel();
title.setFont(new Font("Times New Roman", Font.PLAIN, 18));
title.setText("Calculadora de Notas");
title.setBounds(171, 20, 157, 30);

datos=new JLabel();
datos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
datos.setText("Ingrese los siguientes datos:");
datos.setBounds(171, 61, 180, 30);

nombre=new JLabel();
nombre.setText("NOMBRE USUARIO");
nombre.setBounds(201, 98, 150, 30);
campo1=new JTextField();
campo1.setBounds(171, 123, 150, 30);

edad=new JLabel();
edad.setText("Ingrese la nota 1: ");
edad.setBounds(86, 164, 106, 30);
campo2=new JTextField();
campo2.setBounds(96, 197, 77, 30);

telefono=new JLabel();
telefono.setText("Ingrese la nota 2: ");
telefono.setBounds(305, 164, 106, 30);
campo3=new JTextField();
campo3.setBounds(315, 197, 77, 30);

tipo=new JLabel();
tipo.setText("Ingrese la nota 3: ");
tipo.setBounds(208, 218, 113, 30);
campo4=new JTextField();
campo4.setBounds(212, 245, 77, 30);

boton1=new JButton();
boton1.setText("Calcular");
boton1.setBounds(315, 284, 113, 30);
boton1.addActionListener(this);

boton2=new JButton();
boton2.setText("Limpiar");
boton2.setBounds(63, 284, 113, 30);
boton2.addActionListener(this);

mipanel.add(title);
mipanel.add(boton1);
mipanel.add(boton2);
mipanel.add(campo1);
mipanel.add(campo2);
mipanel.add(campo3);
mipanel.add(campo4);
mipanel.add(datos);
mipanel.add(nombre);
mipanel.add(edad);
mipanel.add(telefono);
mipanel.add(tipo);

getContentPane().add(mipanel);
}

@Override
public void actionPerformed(ActionEvent e)  {
if(e.getSource()==boton1) {
	n1=Double.parseDouble(campo2.getText());
	n2=Double.parseDouble(campo3.getText());
	n3=Double.parseDouble(campo4.getText());
	
	int cod = 0;
	do {
		if(n1<0||n1>5 ||n2<0||n2>5 || n3<0||n3>5) {
			JOptionPane.showMessageDialog(null, "Las notas deben de estar en el rango de 1 a 5");
			cod = 1;
		}else {
			Procesos.Procesos1(n1,n2,n3,campo1.getText());
			cod = 1;
		}
	} while (cod != 1);
	
}
if(e.getSource()==boton2) {
	campo1.setText("");
	campo2.setText("");
	campo3.setText("");
	campo4.setText("");
	JOptionPane.showMessageDialog(null, "Limpiando formulario...");
	for (int i = 0; i < 10; i++) {
		System.out.println();
	}
	}  
}
}