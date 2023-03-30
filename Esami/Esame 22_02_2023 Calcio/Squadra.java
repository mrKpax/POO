
public class Squadra extends ListaGiocatori
{
	

	Squadra(int codice, String nome, String campionato, int anno)
	{
		super(codice, nome, campionato, anno);
	}

	@Override
	public void aggiungi(Giocatore g) throws GiocatoreException 
	{
		if((this.getCount() >= this.getMaxGiocatori()) && !(this.getLista().contains(g)))
		{
			throw new GiocatoreException("Numero massimo di giocatori raggiunto.");
		}
		else
		{
			this.getLista().add(g);
			this.setCount(getCount()+1);
			System.out.println("Giocatore aggiunto.");
		}
	}

	@Override
	public void rimuovi(Giocatore g) throws GiocatoreException 
	{
		if((this.getCount() <= 0) && (this.getLista().contains(g)))
		{
			throw new GiocatoreException("Impossibile rimuovere il giocatore: lista vuota o non presente.");
		}
		else
		{
			this.getLista().remove(g);
			this.setCount(getCount()-1);
			System.out.println("Giocatore rimosso.");
		}
	}

}
