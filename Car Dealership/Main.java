import java.awt.BorderLayout;

import javax.swing.*;

public class Main
{

	public static void main(String[] args)
	{
		
		MyFrame frame = new MyFrame(); //crea finestra vuota
		MyButton button = new MyButton(); //crea nuovo button
		MyLabel label = new MyLabel(); //crea una nuova label
		MyPanel panel = new MyPanel(); //crea nuovo panel
		
		frame.add(panel);
	}

}
