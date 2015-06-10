package $organization$.$name;format="word,lower"$

import org.hyperscala.web._
import com.outr.net.http.jetty.JettyApplication

object $name;format="Camel"$ extends BasicWebsite with JettyApplication {
  val hello = page(new HelloPage, Scope.Page, "/", "/index.html")
}
