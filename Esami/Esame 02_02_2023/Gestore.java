import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Gestore
{
	public static void main(String arg[])
	{
		FantasyGUI frame = new FantasyGUI();
		
		ArrayList<Personaggio> lista = new ArrayList<Personaggio>();
		
		Orco orco = new Orco("Orco", 10, 1);
		Cavaliere cavaliere = new Cavaliere("Cavaliere", 85, 45);
		Orco orco2 = new Orco("Orco", 11, 2);
		
		lista.add(orco);
		lista.add(cavaliere);
		lista.add(orco2);
		
		PrintWriter out = null;
		

		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 02-02-2023/src/fantasy.txt")));
			
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
		
		getPosAll(lista);
		
		//-----
		System.out.println("\nStampa ID di ogni Orco con espressione lambda");
		
		Predicate<Personaggio> pred = a -> a instanceof Orco;
		
		Consumer<Personaggio> block = (a) -> {
			Orco app = (Orco) a;
			System.out.println(app.getID());
		};
		
		printIDOrco(lista,pred,block);
		
		//-----
		System.out.println("\nStampa il numero dei Cavalieri che posseggono energia maggiore di 50 e hanno posizione minore di 50 unità di misura");
		
		Predicate<Personaggio> cond = (a) -> a instanceof Cavaliere && ((Cavaliere) a).getEnergia() > 50 && ((Cavaliere) a).getGamePos() < 50;
		System.out.println(CondCavalieri(lista,cond));
		
		//---
		System.out.println("\nStampa ID di Cavalieri con energia maggiore di 70");
		printCavalieri(lista,70);
		
	}
	
	public static void printIDOrco(ArrayList<Personaggio> pers, Predicate<Personaggio> cond, Consumer<Personaggio> block)
	{
		for(Personaggio a : pers)
			if(cond.test(a))
				block.accept(a);
	}
	
	public static int CondCavalieri(ArrayList<Personaggio> pers, Predicate<Personaggio> cond)
	{
		return (int) pers.stream().filter(cond).count();
	}
	
	public static void printCavalieri(ArrayList<Personaggio> pers, int energia)
	{
		pers.stream().filter(a -> a instanceof Cavaliere && ((Cavaliere) a).getEnergia() >= energia).forEach(System.out::println);
	}
	
	public int get_Pos(Personaggio pers)
	{
		return pers.getGamePos();
	}
	
	static void getPosAll(ArrayList<Personaggio> lista)
	{
		for (Personaggio p : lista)
		{
			System.out.println( p.getTipo() + " in posizione " + p.getGamePos());
		}
	}
	
	public String get_Type(Personaggio pers)
	{
		return pers.getTipo();
	}
}