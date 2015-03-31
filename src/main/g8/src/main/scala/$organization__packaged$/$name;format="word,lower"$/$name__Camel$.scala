package $organization$.$name;format="word,lower"$

import org.hyperscala.web._
import com.outr.net.http.jetty.JettyApplication

object $name;format="Camel"$ extends BasicWebsite with StaticWebsite with JettyApplication {
  def index = new HelloPage
}
