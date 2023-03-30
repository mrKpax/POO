import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame
{
	public GUI()
	{
		this.setTitle("Crea squadra");
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
			
		JLabel numLabel = new JLabel("Dimensioni lista");
		JTextField numText = new JTextField("",3);
		
		JButton button = new JButton("Crea");
		
		button.addActionListener((ActionEvent e) -> {
			int num = Integer.parseInt(numText.getText());
			System.out.println("\nDimensione lista indicata: " + num +"\n");
				
			ArrayList<Giocatore> list = new ArrayList<Giocatore>();
			Squadra squadra = new Squadra(001, "Test", "Lega", 2023);
			
		 	for(int i=0; i<num; i++)
			{
				String nome = JOptionPane.showInputDialog("Nome giocatore n."+ i);
				int anni = Integer.parseInt(JOptionPane.showInputDialog("Età giocatore n." + i));
				double stipendio = Double.parseDouble(JOptionPane.showInputDialog("Stipendio giocatore n." + i));
				
				Giocatore g = new Giocatore(nome, anni, stipendio);
				try
				{
					squadra.aggiungi(g);
				}
				catch (GiocatoreException e1)
				{
					e1.printStackTrace();
				}
			}
		 	
		 	PrintWriter out = null;
			
			try
			{
				out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 22-02-2023 Calcio/src/squadra.txt", true)));
				
				for(Giocatore g : squadra.getLista())
					out.println(g);
				
				out.close();
			}
			catch(EOFException ex)
			{
				System.out.println("Fine stream\n");
				out.close();
			}
			catch(Exception ex)
			{
				System.out.println("Errore durante la scrittura su file\n");
				out.close();
			}
		});
		
		formPanel.add(numLabel);
		formPanel.add(numText);
		formPanel.add(button);
			
		mainPanel.add(formPanel);
			
		return mainPanel;
	}
}
