import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			FileWriter writer = new FileWriter("test.txt", true);
			System.out.println("Cosa vuoi scrivere nel file?");
			String testo = scanner.nextLine();
			
			writer.append("\n" + testo);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			FileReader file = new FileReader("test.txt");
			int i = file.read();
				
			while(i != -1)
			{
				System.out.print((char)i);
				i = file.read();
			}
				
			file.close();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		scanner.close();
		
	}

}
