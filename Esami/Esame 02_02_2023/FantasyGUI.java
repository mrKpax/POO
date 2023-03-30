import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FantasyGUI extends JFrame
{
	public FantasyGUI()
	{
		this.setTitle("Gioco Fantasy");
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
			
			ArrayList<Personaggio> list = new ArrayList<Personaggio>();
			
			Random r = new Random();
			
			for(int i=0; i<num; i++)
			{
				int scelta = r.nextInt(2);
				if(scelta==0) list.add(new Orco("Orco", 50, 5));
				else list.add(new Cavaliere("Cavaliere", 30, 7));
			}
			
		});
		
		formPanel.add(numLabel);
		formPanel.add(numText);
		formPanel.add(button);
		
		mainPanel.add(formPanel);
		
		return mainPanel;
	}
}