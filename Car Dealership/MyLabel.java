import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabel extends JLabel
{
	MyLabel()
	{
		setText("Jaguar Cars Ltd.");
		
		ImageIcon img = new ImageIcon("/Users/francesco/eclipse-workspace/interfaccia grafica/src/jaguar.png");
		setIcon(img);
		
		this.setHorizontalTextPosition(JLabel.CENTER); //posiziona il testo della label al centro
		this.setVerticalTextPosition(JLabel.BOTTOM); //posiziona il testo della label in basso
		
		this.setHorizontalAlignment(CENTER); //posiziona la label al centro del suo blocco
		this.setVerticalAlignment(CENTER); //posiziona la label al centro del suo blocco
		
		this.setFont(new Font("Times New Roman", Font.PLAIN, 50));
	}
}
