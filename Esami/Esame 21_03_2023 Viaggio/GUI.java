import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame
{
	public GUI()
	{
		this.setTitle("Cerca lista");
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
			
		JLabel numLabel = new JLabel("Codice della lista: ");
		JTextField numText = new JTextField("",3);
		
		JButton button = new JButton("Invia");
		button.addActionListener((ActionEvent e) -> {
			int cod = Integer.parseInt(numText.getText());
			
			ViaggiodeiSogni lista = new ViaggiodeiSogni("Viaggio GUI", 7);
			lista.setCodice(cod);
			
			System.out.println("Lista " + cod + " creata.");
		});
		
			formPanel.add(numLabel);
			formPanel.add(numText);
			formPanel.add(button);
				
			mainPanel.add(formPanel);
				
			return mainPanel;
	}
}
