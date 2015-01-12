package $organization$.$name;format="word,lower"$

import org.hyperscala.web.StaticWebsite
import org.hyperscala.web.BasicWebsite
import com.outr.net.http.session.MapSession
import com.outr.net.http.jetty.JettyApplication

object $name;format="Camel"$ extends BasicWebsite with StaticWebsite[MapSession] with JettyApplication {
  def index = new HelloPage
}
