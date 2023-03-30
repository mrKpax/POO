import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OtherButton extends JButton implements ActionListener
{
	OtherButton()
	{
		addActionListener(this);
		setText("Patente");
		this.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		ImageIcon img = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/license.png");
		setIcon(img);
		
		this.setHorizontalTextPosition(CENTER);
		this.setVerticalTextPosition(BOTTOM);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this)	
		{
			ImageIcon icon = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/license.png");
			String opzioni[] = {"Yes Sir", "No :(", "Devo scappare..."};
			
			int op = JOptionPane.showOptionDialog(null, "Hai la patente?", "Patente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, opzioni, -1);
			
			switch(op)
			{
			case 0:
				JOptionPane.showMessageDialog(null, "Bravo ragazzo...", "YES", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Complimenti!\nCRIMINALE!", "NO", JOptionPane.WARNING_MESSAGE);
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "Sarà per la prossima.", "Annulla", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}
	}
}
