@Grab('io.ratpack:ratpack-groovy:1.4.5')
import static ratpack.groovy.Groovy.ratpack
import ratpack.http.MutableHeaders

import groovy.transform.CompileStatic
import ratpack.groovy.handling.GroovyContext
import ratpack.groovy.handling.GroovyHandler

@CompileStatic
class CORSHandler extends GroovyHandler {
  @Override
  protected void handle(GroovyContext context) {
    MutableHeaders headers = context.response.headers
    headers.set('Access-Control-Allow-Origin', '*')
    headers.set('Access-Control-Allow-Headers', 'x-requested-with, origin, content-type, accept')
    context.next()
  }
}

ratpack {
  handlers {

    //Declare a new handler to handle all incoming requests regardless of method or path
    all(new CORSHandler())

    get {
      render 'Hej Verden 2'
    }
  }
}
