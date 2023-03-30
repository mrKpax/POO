import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyPanel extends JPanel
{
	MyPanel()
	{
		this.setLayout(new BorderLayout());
		this.add(new MyButton(), BorderLayout.EAST);
		this.add(new MyLabel(), BorderLayout.CENTER);
		this.add(new OtherButton(), BorderLayout.WEST);
		this.add(new MiniPanel(), BorderLayout.SOUTH);
		this.add(new UpperButton(), BorderLayout.NORTH);
	}
	
}
