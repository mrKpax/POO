import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiniPanel extends JPanel implements ActionListener
{
	JButton button;
	JTextField tField;
	JLabel lab;
	
	public MiniPanel()
	{
		setLayout(new FlowLayout());
		
		button = new JButton("Invia");
		button.addActionListener(this);
		ImageIcon img = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/parking.png");
		button.setIcon(img);
		
		tField = new JTextField();
		tField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tField.setForeground(new Color(0x00FF00));
		tField.setPreferredSize(new Dimension(150,30));
		
		lab = new JLabel("Inserisci targa:");
		
		this.add(lab);
		this.add(tField);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			JOptionPane.showMessageDialog(null, "Veicolo con targa " + tField.getText() + " registrato.");
			tField.setText("");
		}
	}
	
	
}
