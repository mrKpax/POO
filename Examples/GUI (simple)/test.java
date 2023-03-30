import javax.swing.JOptionPane;

public class test
{

	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Come ti chiami bro?");
		JOptionPane.showMessageDialog(null, "Ciao " + name + "!");
	
		//showInputDIalog restituisce un tipo String, quindi occorre convertirlo con parseInt
		int age = Integer.parseInt(JOptionPane.showInputDialog("Quanti anni hai " + name + "?"));
		JOptionPane.showMessageDialog(null, "Ciao " + name + " di " + age + " anni...");
		
		//vale lo stesso discorso con Double
	}

}
