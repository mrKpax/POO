import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test 
{

	public static void main(String[] args) throws GiocatoreException, IOException 
	{
		Squadra squadra = new Squadra(19, "Juventus", "Serie A", 2023);
		Giocatore g1 = new Giocatore("Vlahovic", 23, 500000);
		Giocatore g2 = new Giocatore("Chiesa", 25, 780000);
		Giocatore g3 = new Giocatore("Di Maria", 33, 600000);
		
		squadra.aggiungi(g1);
		squadra.aggiungi(g2);
		squadra.aggiungi(g3);
		
		//GUI
		GUI frame = new GUI();
		
		//Salvataggio su file
		PrintWriter out = null;
		
		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 22-02-2023 Calcio/src/squadra.txt")));
			
			for(Giocatore g : squadra.getLista())
				out.println(g);
			
			out.close();
		}
		catch(EOFException e)
		{
			System.out.println("Fine stream\n");
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Errore durante la scrittura su file\n");
			out.close();
		}
		
		
		//Esercizio 2
		System.out.println("\nStampa il cartellino di ogni giocatore presente in una Squadra con espressione lambda");
		printCodice(squadra);
		
		//Esercizio 3
		System.out.println("\nStampa il numero di giocatori che hanno meno di 24 anni e guadagnano più di 100.000 euro: " + CondGiocatori(squadra));

		//Esercizio 4
		System.out.println("\nIstanza oggetti della classe giocatore con Stream Tokenizer tastiera");
		token(squadra);
	}
	
	public static void printCodice(Squadra s)
	{
		Consumer<Giocatore> block = g -> System.out.println(g.getCodice());
		
		for(Giocatore g : s.getLista())
			block.accept(g);
	}
	
	public static int CondGiocatori(Squadra s)
	{
		Predicate<Giocatore> pred = g -> g.getAnni() < 24 && g.getStipendio() > 100000;
		
		return (int) s.getLista().stream().filter(pred).count();
	}
	
	public static void token(Squadra squadra) throws GiocatoreException, IOException
	{
		StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		
		while(true)
		{
			System.out.println("Inserisci nome, età e stipendio del giocatore: \n");
			
			tokenizer.nextToken();
			String nome = tokenizer.sval;
			tokenizer.nextToken();
			int anni = (int) tokenizer.nval;
			tokenizer.nextToken();
			double stipendio = (double) tokenizer.nval;
			
			Giocatore g = new Giocatore(nome, anni, stipendio);
			squadra.aggiungi(g);
			
			PrintWriter out = null;
			
			try
			{
				out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 22-02-2023 Calcio/src/squadra.txt", true)));
				
				out.println(g);
				
				out.close();
			}
			catch(EOFException ex)
			{
				System.out.println("Fine stream\n");
				out.close();
			}
			catch(Exception ex)
			{
				System.out.println("Errore durante la scrittura su file\n");
				out.close();
			}
			
			System.out.println("Continuare? (Y/N)");
			tokenizer.nextToken();
			String op = tokenizer.sval;
			if(op.equals("N"))
				break;
		}
	}

}
