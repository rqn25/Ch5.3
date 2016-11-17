
public class CarsDriver {
	public static void main(String [] args) {
		Cars myCar = new Cars();
		Cars hisCar = new Cars("Black", 400, 3.5, "Honda");
		Cars herCar = new Cars("Pink", 300, 2.5, "Volks");

		System.out.println("myCar: " + myCar);
		System.out.println("hisCar: " + hisCar);
		System.out.println("herCar: " + herCar);

		myCar.setColor("Blue"); myCar.setHorsePower(650); myCar.setEngineSize(6.5); myCar.setMake("Ferrari");

		hisCar.setColor("Blue"); hisCar.setHorsePower(650); hisCar.setEngineSize(6.5); hisCar.setMake("Ferrari");

		herCar.setColor("Blue"); herCar.setHorsePower(650); herCar.setEngineSize(6.5); herCar.setMake("Ferrari");
		
		//System.out.println("\nCar objects");

		System.out.println("\ncarObjects: Color = " + myCar.getColor() + ", Horse power = " + myCar.getHorsePower() + ", Engine size = " + myCar.getEngineSize() + ", Make = " + myCar.getMake());

		//System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());

		//System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());

	}

}
