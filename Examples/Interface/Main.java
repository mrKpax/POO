
public class Main
{

	public static void main(String[] args)
	{
		Leone lion = new Leone();
		Zebra zebra = new Zebra();
		Squalo shark = new Squalo();
		Balena whale = new Balena();
		
		lion.cammina();
		lion.mangiaCarne();
		lion.respira();
		System.out.println(lion.toString() + "\n");
		
		zebra.cammina();
		zebra.mangiaPiante();
		zebra.respira();
		System.out.println(zebra.toString() + "\n");
		
		shark.nuota();
		shark.mangiaCarne();
		shark.respira();
		System.out.println(shark.toString() + "\n");
		
		whale.nuota();
		whale.mangiaPiante();
		whale.respira();
		System.out.println(whale.toString() + "\n");
		
	}

}
