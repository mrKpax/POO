import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class UpperButton extends JButton implements ActionListener
{
	UpperButton()
	{
		addActionListener(this);
		setText("Prenota");
		this.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		ImageIcon img = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/trip.png");
		setIcon(img);
		
		this.setHorizontalTextPosition(CENTER);
		this.setVerticalTextPosition(BOTTOM);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this)
		{
			Trip trip = new Trip();
		}
	}

}
