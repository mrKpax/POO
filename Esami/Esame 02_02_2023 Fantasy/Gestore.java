import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Gestore 
{

	public static void main(String[] args) 
	{
		ArrayList<Personaggio> lista = new ArrayList<Personaggio>();
		Cavaliere c1 = new Cavaliere(350);
		Orco o1 = new Orco(500);
		Cavaliere c2 = new Cavaliere(400);
		Cavaliere c3 = new Cavaliere(150);
		Orco o2 = new Orco (700);
		
		lista.add(c1);
		lista.add(o1);
		lista.add(c2);
		lista.add(c3);
		lista.add(o2);
		
		//Salva su file
		PrintWriter out = null;
		
		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 02-02-2023 Fantasy/src/fantasy.txt")));
			
			for(Personaggio a : lista)
				out.println(a);
			
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
		
		//Interfaccia grafica
		GUI form = new GUI();
		
		//Espressione lambda
		System.out.println("Stampa ID di ogni Orco con espressione lambda.");
		Predicate<Personaggio> pred = p -> p instanceof Orco;
		Consumer<Personaggio> block = (p) -> {
			Orco app = (Orco) p;
			System.out.println(app.getId());
		};
		printID(lista,pred,block);
		
		//Esercizio 3
		System.out.println("\nStampa il numero dei Cavalieri che posseggono energia maggiore di 50 e hanno posizione minore di 50 unità di misura");
		Predicate<Personaggio> cond = p -> p instanceof Cavaliere && p.getEnergia() > 50 && p.getGamePos() < 50;
		System.out.println(condCavalieri(lista,cond));
		
		//Esercizio 4
		System.out.println("\nStampa ID di Cavalieri con energia maggiore di 70");
		printCavalieri(lista);
		
	}
	
	public static void printID(ArrayList<Personaggio> lista, Predicate<Personaggio> pred, Consumer<Personaggio> block)
	{
		for(Personaggio a : lista)
			if(pred.test(a))
				block.accept(a);
	}
	
	public static int condCavalieri(ArrayList<Personaggio> lista, Predicate<Personaggio> cond)
	{
		return (int) lista.stream().filter(cond).count();
	}
	
	public static void printCavalieri(ArrayList<Personaggio> pers)
	{
		pers.stream().filter(a -> a instanceof Cavaliere && ((Cavaliere) a).getEnergia() >= 70).forEach(System.out::println);
	}
	
	public int getPos(Personaggio pers)
	{
		return pers.getGamePos();
	}
	
	public void getPosAll(ArrayList<Personaggio> lista)
	{
		for(Personaggio p : lista)
			System.out.println("Personaggio ID " + p.getId() + " in posizione " + p.getGamePos());
	}
	
	public String getType(Personaggio pers)
	{
		return pers.getTipo();
	}

}
