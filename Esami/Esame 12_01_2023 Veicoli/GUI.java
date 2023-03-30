import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame
{
	public GUI()
	{
		this.setTitle("Crea autovetture");
		this.setSize(750,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
			
		JPanel panel =  buildPanel();
		this.add(panel);
	}
		
	private JPanel buildPanel()
	{
		JPanel mainPanel = new JPanel();
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(10,2));
		
		ArrayList<Autovettura> list = new ArrayList<Autovettura>();
		
		JLabel tipoLabel = new JLabel("Tipo: ");
		JComboBox tipoCombo = new JComboBox();
		tipoCombo.addItem("Macchina");
		tipoCombo.addItem("Camion");
		
		JLabel cilLabel = new JLabel("Cilindrata: ");
		JTextField cilText = new JTextField("",5);
		
		JLabel colLabel = new JLabel("Colore: ");
		JTextField colText = new JTextField("");
		
		JLabel tarLabel = new JLabel("Targa: ");
		JTextField tarText = new JTextField("");
		
		JLabel numLabel = new JLabel("Marce: ");
		JTextField numText = new JTextField("",1);
		
		JLabel ruoteLabel = new JLabel("Ruote (solo Camion): ");
		JTextField ruoteText = new JTextField("",1);
			
		JButton button = new JButton("Crea");
		button.addActionListener((ActionEvent e) -> {
			System.out.println("Creazione " + tipoCombo.getSelectedItem());
			Autovettura a = null;
				
			if(tipoCombo.getSelectedItem().equals("Macchina"))
			{
				a = new Macchina(Integer.parseInt(cilText.getText()), colText.getText(), tarText.getText(), Integer.parseInt(numText.getText()));
				JOptionPane.showMessageDialog(null, "Macchina registrata.");
				cilText.setText("");
				colText.setText("");
				tarText.setText("");
				numText.setText("");
				ruoteText.setText("");
			}
			else if(tipoCombo.getSelectedItem().equals("Camion"))
			{
				a = new Camion(Integer.parseInt(ruoteText.getText()) ,Integer.parseInt(cilText.getText()), colText.getText(), tarText.getText(), Integer.parseInt(numText.getText()));
				JOptionPane.showMessageDialog(null, "Camion registrato.");
				cilText.setText("");
				colText.setText("");
				tarText.setText("");
				numText.setText("");
				ruoteText.setText("");
			}
			
			list.add(a);
			
			PrintWriter out = null;
			try
			{
				out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 12-01-2023 II/src/veicoli.txt", true)));
				out.println(a);
				out.close();
			}
			catch(EOFException ex)
			{
				System.out.println("Fine stream.");
				out.close();
			}
			catch(Exception ex)
			{
				System.out.println("Errore durante la scrittura su file.");
				out.close();
			}
				
		});
			
		formPanel.add(tipoLabel);
		formPanel.add(tipoCombo);
		formPanel.add(cilLabel);
		formPanel.add(cilText);
		formPanel.add(colLabel);
		formPanel.add(colText);
		formPanel.add(tarLabel);
		formPanel.add(tarText);
		formPanel.add(numLabel);
		formPanel.add(numText);
		formPanel.add(ruoteLabel);
		formPanel.add(ruoteText);
		formPanel.add(button);
			
		mainPanel.add(formPanel);
			
		return mainPanel;
	}
}