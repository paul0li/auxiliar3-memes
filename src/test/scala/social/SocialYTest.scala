package uchile.dcc.cl
package social

import munit.FunSuite

class SocialYTest extends FunSuite{
  
  private var user1: String = _
  private var user2: String = _
  private var pass1: String = _
  private var pass2: String = _
  private var name: String = _
  var social: SocialY = _
  

  override def beforeEach(context: BeforeEach): Unit = {
    user1 = "paul0li"
    user2 = "pauloli"
    pass1 = "contraseña"
    pass2 = "cotrasea"
    name = "pausipisi"
    social = new SocialY()
  }
  
  test("An user must be able to log in") {
    val res = social.login(user1,pass1)
    assert(res) //usuario correcto
  }
  
  test("If user does not exists, user can't log in"){
    val res = social.login(user2,pass1)  //usuario incorrecto
    assert(!res)
  }

  test("An user can only login if their password is correct") {
    assert(!social.login(user1, pass2)) //contraseña incorrecta
  }
  
  test("User must be able to register") {
    assert(social.register("pausipisi","contraseña2")) //nuevo usuario registrado
  }

  test("User can't register if it is already registered") {
    assert(!social.register("paul0li", "contraseña2")) // usuario ya registrado
  }
}

