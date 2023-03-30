import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Camera> camere = new ArrayList<Camera>();
		
		int op = 0;
		
		while(op != -1)
		{
			System.out.println("\nQuale operazione vuoi eseguire?");
			System.out.println("1. Crea nuova stanza.");
			System.out.println("2. Registra nuovi clienti.");
			System.out.println("3. Effettua checkout di una stanza.");
			System.out.println("4. Ottieni informazioni su una stanza.");
			System.out.println("5. Ottieni lista stanze e relativo stato.");
			System.out.println("-1 per uscire...");
			op = scanner.nextInt();
			scanner.nextLine();
			
			int id;
			
			switch(op)
			{
				case 1:
					System.out.println("Di che tipo è la stanza che vuoi creare? (Standard, Luxury, Extra Luxury)");
					String tipo = scanner.nextLine();
					id = camere.size();
					
					if(tipo.equals("Standard"))
					{
						CameraStandard nuova = new CameraStandard(id);
						camere.add(nuova);
						System.out.println("Creata stanza " + tipo + " con ID: " + id + ".");
					}
					else if(tipo.equals("Luxury"))
					{
						CameraLuxury nuova = new CameraLuxury(id);
						camere.add(nuova);
						System.out.println("Creata stanza " + tipo + " con ID: " + id + ".");
					}
					else if(tipo.equals("Extra Luxury"))
					{
						CameraExtraLuxury nuova = new CameraExtraLuxury(id);
						camere.add(nuova);
						System.out.println("Creata stanza " + tipo + " con ID: " + id + ".");
					}
					else
					{
						System.out.println("Errore durante la creazione della stanza.");
					}
					break;
				
				case 2:
					System.out.println("In quale stanza soggiorneranno?");
					id = scanner.nextInt();
					scanner.nextLine();
					
					if(camere.get(id).stato.equals("libera"))
					{
						int i = 1;
						while(i <= camere.get(id).posti)
						{
							System.out.println("Tipologia: Adulto, Bambino, Ragazzo");
							String tip = scanner.nextLine();
							if (tip.equals("Adulto"))
							{
								System.out.println("Inserisci nome: ");
								String nome = scanner.nextLine();
								System.out.println("Inserisci cgnome: ");
								String cognome = scanner.nextLine();
								System.out.println("Inserisci ID Card: ");
								String idCard = scanner.nextLine();
								
								camere.get(id).insertAdulto(nome, cognome, tip, id, idCard);
								i++;
							}
							else if (tip.equals("Ragazzo"))
							{
								System.out.println("Inserisci nome: ");
								String nome = scanner.nextLine();
								System.out.println("Inserisci cgnome: ");
								String cognome = scanner.nextLine();
								System.out.println("Inserisci ID Card: ");
								String idCard = scanner.nextLine();
								
								camere.get(id).insertRagazzo(nome, cognome, tip, id, idCard);
								i++;
							}
							else if (tip.equals("Bambino"))
							{
								System.out.println("Inserisci nome: ");
								String nome = scanner.nextLine();
								System.out.println("Inserisci cgnome: ");
								String cognome = scanner.nextLine();
								System.out.println("Inserisci età: ");
								int anni = scanner.nextInt();
								System.out.println("Inserisci madre: ");
								String madre = scanner.nextLine();
								System.out.println("Inserisci padre: ");
								String padre = scanner.nextLine();
								
								camere.get(id).insertBambino(nome,  cognome, tip, id, anni, madre, padre);
								i++;
							}
						}
						camere.get(id).stato = "occupata";
					}
					else
					{
						System.out.println("Camera occupata.");
					}
					break;
			
				case 3:
					System.out.println("Di quale stanza si desidera effettuare il checkout?");
					id = scanner.nextInt();
					scanner.nextLine();
					
					if(camere.get(id).stato.equals("libera"))
						System.out.println("Stanza già libera.");
					else
					{
						camere.get(id).checkout();
						System.out.println("Checkout effettuato.");
					}
					break;
					
				case 4:
					System.out.println("Di quale stanza si desidera ottenere informazioni?");
					id = scanner.nextInt();
					scanner.nextLine();
					
					camere.get(id).informazioni();
					camere.get(id).optional();
					break;
					
				case 5:
					System.out.println("Lista stanze: ");
					
					for(int i = 0; i < camere.size(); i++)
					{
						System.out.println("ID: " + camere.get(i).idCamera + "| Tipo: " + camere.get(i).tipo + "| Stato: " + camere.get(i).stato + ".");
					}
					break;
						
			}
				
		}
		
		scanner.close();
		
	}

}
