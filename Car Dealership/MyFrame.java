import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		setTitle("Home"); //imposta il titolo della finestra
		setVisible(true); //imposta la finestra visibile
		setSize(750, 500); //modifica le dimensioni della finestra
		setLocationRelativeTo(null); //modifica la parte di schermo in cui la finestra compare (al centro)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //chiudi il programma alla chiusura della finestra
	
	}
}
