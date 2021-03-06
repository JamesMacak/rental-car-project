/**
 * A car of type Vehicle. Class was created so we have a car data type. Does not add any new instance variables.
 * 
 * @author Matt Mackenzie & James Macak
 * @version 1.0
 */
public class Car extends Vehicle {

	/**
	 * Parameterized constructor for a Car. Must include the vinNumber,
	 * licensePlate, raw company ID, and retail price because no setters exist.
	 * The specific Company ID for the car. The car's ID modifier = 01
	 * 
	 * @param make
	 *            The make of the car.
	 * @param model
	 *            The model of the car.
	 * @param year
	 *            The year of the car.
	 * @param color
	 *            The color of the car.
	 * @param numberOfCylinders
	 *            The number of cylinders in the car's engine.
	 * @param numberOfDoors
	 *            The number of doors on the car.
	 * @param vinNumber
	 *            The VIN number of the car.
	 * @param licensePlate
	 *            The license plate number of the car.
	 * @param companyID
	 *            The raw company ID for the vehicle.
	 * @param dailyRentalPrice
	 *            The daily rental price of the vehicle.
	 */
	public Car(String make, String model, String year, String color, String numberOfCylinders, String numberOfDoors,
			String vinNumber, String licensePlate, String companyID, double dailyRentalPrice, double currentMiles, double gasCapacity) {
		super(make, model, year, color, numberOfCylinders, numberOfDoors, vinNumber, licensePlate, companyID + "-01",
				dailyRentalPrice, currentMiles, gasCapacity);
	}

	/**
	 * Null constructor for a vehicle. However, must include the vinNumber,
	 * licensePlate, raw company ID, and rental price because no setters exist.
	 * 
	 * @param vinNumber
	 *            The VIN number of the vehicle.
	 * @param licensePlate
	 *            The license plate number of the vehicle.
	 * @param companyID
	 *            The raw company ID for the vehicle.
	 * @param dailyRentalPrice
	 *            The daily rental price of the vehicle.
	 */
	public Car(String vinNumber, String licensePlate, String companyID, double dailyRentalPrice) {
		this(null, null, null, null, null, null, vinNumber, licensePlate, companyID + "-01", dailyRentalPrice, 1200.00, 12);
	}

	//////////////////////////////////////////////////////////////////////////

}
