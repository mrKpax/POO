import java.util.Random;
import javax.swing.JOptionPane;

public class test
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int x = random.nextInt(19)+1;
		System.out.println("Numero generato: " + x);
		//JOptionPane.showMessageDialog(null, "Numero generato: " + x);
		
		//generazione casuale con un range di valori
		int y = random.nextInt(15, 20)+1;
		System.out.println("Numero generato: " + y);
	}

}
