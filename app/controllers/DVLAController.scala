package controllers

import models.Vehicle
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._

object DVLAController extends Controller {

  val form = Form(mapping(
    "id" -> number,
    "vehicleRegNum" -> text,
    "vehicleMake" -> text
  )(Vehicle.apply)(Vehicle.unapply))
  
  def index = Action {
     Ok(views.html.index("Get vehicle information from DVLA"))
  }
  
  def search = Action {
     Ok(views.html.search("DVLA Vehicle Search"))
  }

  def getVehicle = Action {
    implicit request =>
      val v = Vehicle.get(request.queryString.get("vehicleRegNum").get.head,request.queryString.get("vehicleMake").get.head)
      Ok(views.html.results(v))
  }
  
}
