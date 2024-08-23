package uchile.dcc.cl
package social
import scala.collection.mutable.Map //así el map puede ser mutable, aunque no se pueda modificar users por otro map (lo que está bien igual)

class SocialY {
  
  private val users: Map[String, String] = Map()
  
  def login(username: String, password: String): Boolean = {
    val pass = users.get(username) //si existe, me devuelve el string, y si no, None. Es un Option!
    if (pass.isDefined && pass.get == password){
      true
    }
    else false
  }

  def register(username: String, password: String): Boolean = {
    if (users.contains(username)) {
      false
    } else {
      users(username) = password
      true
    }
  }
}
