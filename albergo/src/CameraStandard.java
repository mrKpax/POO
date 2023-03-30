
public class CameraStandard extends Camera
{
	CameraStandard(int idCamera)
	{
		super(idCamera);
		this.prezzo = 50;
		this.stato = "libera";
		this.tipo = "Standard";
		this.posti = 1;
	}
	
	void colazione()
	{
		System.out.println("Optional: colazione inclusa nel prezzo");
	}
	
	@Override
	void optional()
	{
		pulisci();
		colazione();
	}
}
