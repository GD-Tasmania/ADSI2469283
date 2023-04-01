import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class Notas extends JFrame{
	JPanel miPanel;
	JLabel minota1;
	JLabel minota2;
	JLabel minota3;
	
	JTextField nota1;
	private JFormattedTextField nota1_1;
	JTextField nota2;
	JTextField nota3;
	
	JButton btnNewButton_1;

	public Notas() {
		iniciarComponentes();
		setTitle("Calculadora de Notas");
		setSize(400,332);                                  
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		miPanel=new JPanel();
		miPanel.setBackground(new Color(0, 255, 64));
		miPanel.setLayout(null);
		
		minota1=new JLabel();
		minota1.setText("Ingrese la nota 1: ");
		minota1.setBounds(100, 70, 150, 30);
		nota1 = new JTextField();
		nota1.setBounds(100, 100, 150, 30);
		
		minota2=new JLabel();
		minota2.setText("Ingrese la nota 1: ");
		minota2.setBounds(100, 70, 150, 30);
		nota1 = new JTextField();
		nota1.setBounds(100, 100, 150, 30);
		
		minota1=new JLabel();
		minota1.setText("Ingrese la nota 1: ");
		minota1.setBounds(55, 120, 99, 30);
		nota1_1 = new JFormattedTextField();
		nota1_1.setBounds(55, 151, 89, 30);
		
		JLabel lblIngreseLaNota = new JLabel();
		lblIngreseLaNota.setText("Ingrese la nota 2: ");
		lblIngreseLaNota.setBounds(232, 120, 99, 30);
		miPanel.add(lblIngreseLaNota);
		
		JLabel minota1_1_1 = new JLabel();
		minota1_1_1.setText("Ingrese la nota 3: ");
		minota1_1_1.setBounds(149, 192, 99, 30);
		miPanel.add(minota1_1_1);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DE NOTAS");
		lblNewLabel.setBounds(121, 11, 150, 27);
		miPanel.add(lblNewLabel);

		
		JFormattedTextField nota1_1_1 = new JFormattedTextField();
		nota1_1_1.setBounds(108, 79, 150, 30);
		miPanel.add(nota1_1_1);
		
		JFormattedTextField nota1_1_2 = new JFormattedTextField();
		nota1_1_2.setBounds(232, 151, 89, 30);
		miPanel.add(nota1_1_2);
		
		JFormattedTextField nota1_1_3 = new JFormattedTextField();
		nota1_1_3.setBounds(149, 219, 89, 30);
		miPanel.add(nota1_1_3);
		
		JLabel minota1_1 = new JLabel();
		minota1_1.setText("Ingrese el nombre: ");
		minota1_1.setBounds(131, 49, 99, 30);
		miPanel.add(minota1_1);
		
		btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(33, 234, 89, 23);
		miPanel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(267, 234, 89, 23);
		miPanel.add(btnNewButton);
		
		
		miPanel.add(minota1);
		miPanel.add(nota1_1);
		
		getContentPane().add(miPanel);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1) {
			JOptionPane.showMessageDialog(null, "s");
			}
	}
}
