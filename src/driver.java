import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {

		createCompanyCars();
		createCompanyVans();
		createCompanyTrucks();

		// for (int i = 0; i < Dealer.getVehicles().size(); i++) {
		// System.out.println(Dealer.getVehicles().get(i));
		// }

		createSamplePeople();
		Dealer.createBasicCustomer("Matt", "Mackenzie", "01/16/1997", "115 86 1747", "MALE", "275 Violet Street");
		Dealer.createBasicCustomer("Roger", "Smith", "04/26/1962", "114 76 1448", "MALE", "4 Eve Drive");

		
		try {
			Dealer.changeToPriviledgedCustomer(Dealer.getBasicCustomer(Dealer.getCustomers().get(20)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Dealer.getCustomers().sort(null);
		DealerGUI GUI = new DealerGUI();
		GUI.run();

	}

	/////////////////////////////////////////////////////////

	public static void createSamplePeople() {
		String fileName = "/Users/Mattmacks/Desktop/customers.txt";
		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] data = line.split(",");

			Dealer.createBasicCustomer(data[0], data[1], data[2], data[3], data[4], data[5]);
		}
	}

	public static void createCompanyCars() {
		String fileName = "/Users/Mattmacks/Desktop/cars.txt";
		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] data = line.split(",");

			Dealer.createCar(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7],
					Double.parseDouble(data[8]), Double.parseDouble(data[9]));
		}
	}

	public static void createCompanyVans() {
		String fileName = "/Users/Mattmacks/Desktop/vans.txt";
		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] data = line.split(",");

			Dealer.createVan(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7],
					Double.parseDouble(data[8]), Double.parseDouble(data[9]));
		}
	}

	public static void createCompanyTrucks() {
		String fileName = "/Users/Mattmacks/Desktop/trucks.txt";
		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] data = line.split(",");

			Dealer.createTruck(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7],
					Double.parseDouble(data[8]), Double.parseDouble(data[9]));
		}
	}

}
