package $organization$.$name;format="word,lower"$

import org.hyperscala.web._
import org.hyperscala.html._

class HelloPage extends Webpage {
  body.contents += new tag.H1(content = "Hello, World!")
}
