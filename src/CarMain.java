import javax.swing.JOptionPane;
public class CarMain {

	public static void main(String[] args) {		
		
		String carType;
		String carBrand;
		String carModel;
		String groundCar;
		String humanPowered;
		String motorPowered;
		String electric;
		String wheelNum;
		
		groundCar= JOptionPane.showInputDialog ("Kara arabasi mi? Ornek: true & false");
		carType= JOptionPane.showInputDialog ("Araba tipini griniz. Tipler(Sedan, Off-Road, Truck, Sport Car, Mini Van) Ornek: Sedan");
		carBrand= JOptionPane.showInputDialog ("Araba markasini griniz. Markalar(BMW, Mercedes, Toyota, Tesla, Buggatti) Ornek: BMW");
		carModel= JOptionPane.showInputDialog ("Araba modelini griniz. Modeller(BMW[3-series,5series], Mercedes[C-series, E-series]) Ornek: 3 ve ya C");
		humanPowered= JOptionPane.showInputDialog ("Araba Insan gucuyle mi? Ornek: true & false");
		motorPowered= JOptionPane.showInputDialog ("Araba motor gucuyle mi? Ornek: true & false");
		electric= JOptionPane.showInputDialog ("Araba elektrik mi? Ornek: true & false");
		wheelNum= JOptionPane.showInputDialog ("Araba teker sayisini giriniz. Ornek: 2 ve ya 4");

		boolean groundCarB= Boolean.parseBoolean(groundCar);
		boolean humanPoweredB= Boolean.parseBoolean(humanPowered);
		boolean motorPoweredB= Boolean.parseBoolean(motorPowered);
		boolean electricB= Boolean.parseBoolean(electric);
		short wheelNumS= Short.parseShort(wheelNum);
		
		Car car = new Car(carType, carBrand, carModel, groundCarB, humanPoweredB, motorPoweredB, electricB, wheelNumS);
		
		System.out.println("Kara Araci:" + groundCar + "\n" + "Araba Tipi:" + carType+ "\n" 
				+"Araba Markasi:" + carBrand+ "\n" + "Araba Modeli:" + carModel+ "\n" 
				+ "Insan Gucu:" + humanPowered+ "\n" + "Motor Gucu:" + motorPowered 
				+ "\n" + "Elektrikli:" + electric+ "\n" + "Teker Sayi:" + wheelNum+ "\n");
		 
	}
}