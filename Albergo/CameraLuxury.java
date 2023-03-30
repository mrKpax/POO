
public class CameraLuxury extends CameraStandard
{
	CameraLuxury(int idCamera)
	{
		super(idCamera);
		this.prezzo = 100;
		this.stato = "libera";
		this.tipo = "Luxury";
		this.posti = 3;
	}
	
	void televisione()
	{
		System.out.println("Optional: televisione in camera.");
	}
	
	@Override
	void optional()
	{
		pulisci();
		colazione();
		televisione();
	}
	
}
