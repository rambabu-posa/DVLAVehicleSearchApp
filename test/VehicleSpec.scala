import org.specs2.mutable._

import models._
import play.api.test.{WithApplication, FakeRequest}
import play.api.test.Helpers._

class VehicleSpec extends Specification {

	"The 'vehicle' string" should {
        "contain seven characters" in {
          "vehicle" must have size(7)
        }
    }

    "models.Vehicle" should {
	    "create a vehicle" in new WithApplication {
        val vehicle = Vehicle(1, "ABC", "AFS")
   
        vehicle must not be null
		}
	}
	
	"models.Vehicle" should {
	    "get vehicle details with vehicleRegNum='AB12BC' and vehicleMake='ABC'. " in new WithApplication {
        val vehicle = Vehicle.get("AB12BC", "ABC")
   
        vehicle must not be null
		}
	}
}