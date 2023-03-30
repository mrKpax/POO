import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyButton extends JButton implements ActionListener
{
	MyButton()
	{
		addActionListener(this);
		setText("Start");
		this.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		ImageIcon img = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/car.png");
		setIcon(img);
		
		this.setHorizontalTextPosition(CENTER);
		this.setVerticalTextPosition(BOTTOM);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this)
		{
			int op = JOptionPane.showConfirmDialog(null, "Vuoi accendere il motore?", "Jaguar Model X", JOptionPane.YES_NO_CANCEL_OPTION);
			
			switch(op)
			{
				case 0:
					JOptionPane.showMessageDialog(null, "Vroom!", "Accensione", JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case 1:
					JOptionPane.showMessageDialog(null, "Bye...", "Uscita", JOptionPane.WARNING_MESSAGE);
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Parcheggiando...\nDando la mancia a Gennaro...", "Parking", JOptionPane.WARNING_MESSAGE);
					break;
			}
		}
	}
	
}
