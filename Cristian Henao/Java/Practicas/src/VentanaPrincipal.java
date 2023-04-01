import javax.swing.*;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements ActionListener{
	JPanel miPanel;
	JLabel miTitulo;
	JButton miBoton;
	JButton miBoton2;
	JTextField miCampoDeTexto;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Mi primer ventana swing");
		setSize(400,300);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.orange);
		
		miTitulo=new JLabel();
		miTitulo.setText("WORK SERVICES");
		miTitulo.setBounds(130,30,120,30);
		
		miCampoDeTexto=new JTextField();
		miCampoDeTexto.setBounds(110,80,150,30);
		
		miBoton=new JButton();
		miBoton.setText("Boton 1");
		miBoton.setBounds(110,130,150,30);
		miBoton.addActionListener(this);
		
		miBoton2=new JButton();
		miBoton2.setText("Boton 2");
		miBoton2.setBounds(110,170,150,30);
		miBoton2.addActionListener(this);
		
		miPanel.add(miTitulo);
		miPanel.add(miCampoDeTexto);
		miPanel.add(miBoton);
		miPanel.add(miBoton2);
		
		add(miPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==miBoton) {
			JOptionPane.showMessageDialog(null, "Boton 1 "+miCampoDeTexto.getText());
		}
		if(e.getSource()==miBoton2) {
			JOptionPane.showMessageDialog(null, "Boton 2 "+miCampoDeTexto.getText());
		}
	}

}
