package segundaUnidad;

public class usaFruta {
	public static void main(String[] args) {
		Fruta fruta1 = new Fruta ("platano"); //creamos 3 objetos de tipo Fruta
		Fruta fruta2 = new Fruta ("manzana"); 
		Fruta fruta3 = new Fruta ("durazno"); 
		
		fruta1.setPeso(40); //le damos valores al peso y calorias del primer objeto
		fruta1.setCalorias(2);
		
		fruta2.setPeso(55);//le damos valores al peso y calorias del segundo objeto
		fruta2.setCalorias(1);
		
		fruta3.setPeso(100);//le damos valores al peso y calorias del tercer objeto
		fruta3.setCalorias(3);

		System.out.print(fruta1.toString()); 
		System.out.println(" el total de calorias es: "+fruta1.totalCalorias());//mostramos el peso y nombre de cada objeto
		System.out.print(fruta2.toString());
		System.out.println(" el total de calorias es: "+fruta2.totalCalorias());
		System.out.print(fruta3.toString());
		System.out.println(" el total de calorias es: "+fruta3.totalCalorias());
	}
}
