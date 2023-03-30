
public class CameraExtraLuxury extends CameraLuxury
{

	CameraExtraLuxury(int idCamera)
	{
		super(idCamera);
		this.prezzo = 200;
		this.stato = "libera";
		this.tipo = "Extra Luxury";
		this.posti = 5;
	}
	
	void cena()
	{
		System.out.println("Optional: cena inclusa nel prezzo.");
	}
	
	@Override
	void optional()
	{
		pulisci();
		colazione();
		televisione();
		cena();
	}

}
