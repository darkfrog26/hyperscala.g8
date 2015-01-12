package $organization$.$name;format="word,lower"$

import org.hyperscala.web.Webpage
import org.hyperscala.html._
import com.outr.net.http.session.Session
import org.hyperscala.web.Website

class HelloPage extends Webpage($name;format="Camel"$) {
  body.contents += new tag.H1(content = "Hello, World!")
}
