import java.util.ArrayList;

public class ViaggiodeiSogni extends ListaViaggi
{

	private ArrayList<Viaggio> lista;

	ViaggiodeiSogni(String nome, int validita)
	{
		super(nome, validita);
		this.setCodice(super.getCount());
		lista = new ArrayList<Viaggio>();
	}

	@Override
	public void aggiungi(Viaggio v) throws ViaggioException 
	{
		if(!lista.contains(v))
		{
			lista.add(v);
			System.out.println("Viaggio aggiunto.");
		}
		else
		{
			throw new ViaggioException("Viaggio già presente in lista.");
		}
	}

	@Override
	public void rimuovi(Viaggio v) throws ViaggioException
	{
		if(lista.contains(v))
		{
			lista.remove(v);
			System.out.println("Viaggio rimosso.");
		}
		else
		{
			throw new ViaggioException("Viaggio non presente in lista.");
		}
	}
	
	@Override
	public void modifica(Object val)
	{
		if(val instanceof String)
		{
			this.setNome((String) val);
		}
		if(val instanceof Integer)
		{
			this.setValidita((int) val);
		}
	}
	
	public ArrayList<Viaggio> getLista() 
	{
		return lista;
	}

	public void setLista(ArrayList<Viaggio> lista) 
	{
		this.lista = lista;
	}

}
