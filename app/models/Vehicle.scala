package models

case class Vehicle(id: Int, vehicleRegNum: String, vehicleMake: String)

object Vehicle {

  private var vehicleList: List[Vehicle] = List(Vehicle(1001,"AB12BC", "ABC"), 
											    Vehicle(1002,"XY12YX", "XYZ"),
												Vehicle(1003,"AB12YX", "PQR"),
												Vehicle(1004,"MN12NO", "MNO"))

 
  def get(vehicleRegNum: String, vehicleMake: String) = {
	vehicleList.filter(vehicle => vehicle.vehicleRegNum == vehicleRegNum && vehicle.vehicleMake == vehicleMake)
  }

}
