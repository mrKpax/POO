import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test 
{

	public static void main(String[] args) throws ViaggioException, IOException 
	{
		Viaggio v1 = new Viaggio("Viaggio in Francia", "Parigi, Marsiglia, Lione", 14, 1300.00);
		Viaggio v2 = new Viaggio("Viaggio in Germania", "Berlino, Amburgo, Stoccarda", 14, 800.00);
		Viaggio v3 = new Viaggio("Viaggio in Inghilterra", "Londra, Manchester, Liverpool", 14, 1500.00);
		
		ViaggiodeiSogni lista = new ViaggiodeiSogni("Viaggi in Europa", 14);
		lista.aggiungi(v1);
		lista.aggiungi(v2);
		lista.aggiungi(v3);

		//Test funzione modifica
		lista.modifica("Europa");
		lista.modifica(15);
		
		//Salvataggio su file
		PrintWriter out = null;
				
		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/Passiatore_Francesco_(0512113228)/src/viaggi.txt")));
			
			out.println(lista);
			
			for(Viaggio g : lista.getLista())
				out.println(g);
			
			out.println("\n");
					
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
		
		//GUI
		GUI frame = new GUI();
		
		//Esercizio 2
		System.out.println("\nStampa descrizione itinerario di ogni viaggio nella lista con espressione lambda");
		printItinerario(lista);
		
		//Esercizio 3
		System.out.println("\nStampa il numero di viaggi che hanno costo maggiore di 1000 e durano più di 2 giorni: " + CondViaggio(lista));

		//Esercizio 4
		System.out.println("\nIstanza oggetti della classe Viaggio con Stream Tokenizer tastiera");
		token(lista);
	}
	
	public static void printItinerario(ViaggiodeiSogni lista)
	{
		Consumer<Viaggio> block = v -> System.out.println(v.getDescrizione());
		
		for(Viaggio v : lista.getLista())
			block.accept(v);
	}
	
	public static int CondViaggio(ViaggiodeiSogni l)
	{
		Predicate<Viaggio> pred = v -> v.getCosto() > 1000 && v.getDurata() > 2;
		
		return (int) l.getLista().stream().filter(pred).count();
	}
	
	public static void token(ViaggiodeiSogni lista) throws IOException, ViaggioException
	{
		StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		
		while(true)
		{
			System.out.println("Inserisci nome, descrizione, durata e costo del viaggio: \n");
			
			tokenizer.nextToken();
			String nome = tokenizer.sval;
			tokenizer.nextToken();
			String descrizione = tokenizer.sval;
			tokenizer.nextToken();
			int durata = (int) tokenizer.nval;
			tokenizer.nextToken();
			double costo = (double) tokenizer.nval;
			
			Viaggio v = new Viaggio(nome, descrizione, durata, costo);
			lista.aggiungi(v);
			
			System.out.println("Continuare? (Y/N)");
			tokenizer.nextToken();
			String op = tokenizer.sval;
			if(op.equals("N"))
				break;
		}
	}

}
