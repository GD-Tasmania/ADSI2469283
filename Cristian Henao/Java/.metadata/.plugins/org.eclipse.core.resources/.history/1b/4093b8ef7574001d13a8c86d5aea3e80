import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;

public class Ventana1 extends JFrame implements ActionListener{

public static double valor1,cantidad1,total,descuento;

JPanel mipanel;
JButton boton1,boton2,boton3;
JLabel title,datos,nombre,edad,telefono,tipo,producto,valor,cantidad;
JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7;
JTable tabla1;

public Ventana1() {
iniciarComponente();
setTitle("Don Aparato");
setSize(600,500);
setLocationRelativeTo(null);
}

private void iniciarComponente() {
mipanel=new JPanel();
mipanel.setLayout(null);
mipanel.setBackground(Color.gray);

title=new JLabel();
title.setFont(new Font("Times New Roman", Font.PLAIN, 18));
title.setText("Tienda Don Aparato");
title.setBounds(130, 20, 157, 30);

datos=new JLabel();
datos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
datos.setText("Ingrese los siguientes datos:");
datos.setBounds(100, 150, 180, 30);

nombre=new JLabel();
nombre.setText("NOMBRE USUARIO");
nombre.setBounds(115, 180, 150, 30);
campo1=new JTextField();
campo1.setBounds(110, 210, 150, 30);

edad=new JLabel();
edad.setText("EDAD");
edad.setBounds(320, 180, 150, 30);
campo2=new JTextField();
campo2.setBounds(320, 210, 150, 30);

telefono=new JLabel();
telefono.setText("TELEFONO");
telefono.setBounds(115, 240, 150, 30);
campo3=new JTextField();
campo3.setBounds(110, 270, 150, 30);

tipo=new JLabel();
tipo.setText("TIPO");
tipo.setBounds(320, 240, 150, 30);
campo4=new JTextField();
campo4.setBounds(320, 270, 150, 30);

producto=new JLabel();
producto.setText("NOMBRE PRODUCTO");
producto.setBounds(65, 310, 150, 30);
campo5=new JTextField();
campo5.setBounds(60, 340, 150, 30);

valor=new JLabel();
valor.setText("VALOR UNITARIO");
valor.setBounds(225, 310, 150, 30);
campo6=new JTextField();
campo6.setBounds(220, 340, 150, 30);

cantidad=new JLabel();
cantidad.setText("CANTIDAD PRODUCTO");
cantidad.setBounds(385, 310, 150, 30);
campo7=new JTextField();
campo7.setBounds(380, 340, 150, 30);

boton1=new JButton();
boton1.setText("Comprar");
boton1.setBounds(70, 400, 150, 30);
boton1.addActionListener(this);

boton2=new JButton();
boton2.setText("Consultar");
boton2.setBounds(225, 400, 150, 30);
boton2.addActionListener(this);

boton3=new JButton();
boton3.setText("Limpiar");
boton3.setBounds(380, 400, 150, 30);
boton3.addActionListener(this);

String column[]={"",""};  

String data[][]={{"TIPO","BENEFICIO"},
{"A","Descuento del 40% sobre el total de la venta"},    
                {"B","Descuento del 20% sobre el total de la venta"},
                {"C","Descuento del 10% sobre el total de la venta"},
                {"D","No esta afiliado"}};  
tabla1=new JTable(data,column);
tabla1.setBounds(70, 60, 480, 80);
tabla1.setBackground(new Color(128, 255, 255));

mipanel.add(title);
mipanel.add(tabla1);
mipanel.add(boton1);
mipanel.add(boton2);
mipanel.add(boton3);
mipanel.add(campo1);
mipanel.add(campo2);
mipanel.add(campo3);
mipanel.add(campo4);
mipanel.add(campo5);
mipanel.add(campo6);
mipanel.add(campo7);
mipanel.add(datos);
mipanel.add(nombre);
mipanel.add(edad);
mipanel.add(telefono);
mipanel.add(tipo);
mipanel.add(producto);
mipanel.add(valor);
mipanel.add(cantidad);

getContentPane().add(mipanel);
}

@Override
public void actionPerformed(ActionEvent e) {
// campo1.getText();
switch (campo4.getText()) {
case "A":
descuento=0.4;
break;
case "B":
descuento=0.2;
break;
case "C":
descuento=0.1;
break;
case "D":
descuento=0.0;
break;
default:
JOptionPane.showMessageDialog(null, "El tipo no existe");
break;
}

valor1=Double.parseDouble(campo6.getText());
cantidad1=Double.parseDouble(campo7.getText());
total=valor1*cantidad1;

String menuCompra = "";
menuCompra+="Nombre: "+campo1.getText()+"\n";
menuCompra+="Tipo: "+campo4.getText()+"\n";
menuCompra+="Precio: $"+total+"\n";
menuCompra+="Descuento: "+(descuento*100)+"%\n";
menuCompra+="Precio Total: $"+(total-descuento*total)+"\n";

String menuConsulta="";
menuConsulta+="Nombre: "+campo1.getText()+"\n";
menuConsulta+="Edad: "+campo2.getText()+"\n";
menuConsulta+="Telefono: "+campo3.getText()+"\n";
menuConsulta+="Tipo: "+campo4.getText()+"\n";

if(e.getSource()==boton1) {
JOptionPane.showMessageDialog(null, menuCompra);
}
if(e.getSource()==boton2) {
JOptionPane.showMessageDialog(null, menuConsulta);
}
if(e.getSource()==boton3) {
campo1.setText("");
campo2.setText("");
campo3.setText("");
campo4.setText("");
campo5.setText("");
campo6.setText("");
campo7.setText("");
JOptionPane.showMessageDialog(null, "Limpiando formulario...");
}
}
}