import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test 
{

	public static void main(String[] args) 
	{
		GUI frame = new GUI();
		
		ArrayList<Autovettura> lista = new ArrayList<Autovettura>();
		
		Macchina m1 = new Macchina(2000, "Blu", "AA123BB", 6);
		Macchina m2 = new Macchina(1800, "Rosso", "CC777DD", 5);
		Macchina m3 = new Macchina(1600, "Verde", "ZZ987XY", 7);
		Camion c1 = new Camion(8, 4000, "Bianco", "JK908OP", 7);
		Camion c2 = new Camion(6, 5000, "Nero", "HH989WQ", 8);
		c1.caricaRimorchio(6000);
		c1.setLimiteVel(90);
		
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		lista.add(c1);
		lista.add(c2);
		
		PrintWriter out = null;
		
		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/francesco/eclipse-workspace/esame 12-01-2023 II/src/veicoli.txt")));
			
			for(Autovettura a : lista)
				out.println(a);
			out.close();
		}
		catch(EOFException e)
		{
			System.out.println("Fine stream.");
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Errore durante la scrittura su file.");
			out.close();
		}
		
		//Esercizio 2
		System.out.println("Stampa matricola camion con espressione lambda.");
		Predicate<Autovettura> pred = a -> a instanceof Camion;
		Consumer<Autovettura> block = (a) -> {
			Macchina app = (Macchina) a;
			System.out.println(app.getMatricola());
		};
		printMatricolaCamion(lista,pred,block);
		
		//Esercizio 3
		System.out.println("\nStampa numero di camion con peso maggiore di 5t e limite di velocità superiore a 80.");
		Predicate<Autovettura> cond = (a) -> a instanceof Camion && ((Camion) a).getPesoCarico() > 5000 && ((Camion) a).getLimiteVel() > 80;
		System.out.println(countCamionByCondition(lista,cond));
		
		//Esercizio 4
		System.out.println("\nStampa numero di macchine con almeno 6 marce.");
		printMacchineByMarce(lista,6);
		
	}
	
	public static void printMatricolaCamion(ArrayList<Autovettura> auto, Predicate<Autovettura> cond, Consumer<Autovettura> block)
	{
		for(Autovettura a : auto)
			if(cond.test(a))
				block.accept(a);
	}
	
	public static int countCamionByCondition(ArrayList<Autovettura> auto, Predicate<Autovettura> cond)
	{
		return (int) auto.stream().filter(cond).count();
	}
	
	public static void printMacchineByMarce(ArrayList<Autovettura> auto, int marce)
	{
		auto.stream()
			.filter(a -> a instanceof Macchina && ((Macchina)a).getMarce() >= marce && !(a instanceof Camion))
			.map(a -> ((Macchina)a).getMatricola())
			.forEach(System.out::println);
	}

}
