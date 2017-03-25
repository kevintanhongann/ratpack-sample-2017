@Grab('io.ratpack:ratpack-groovy:1.4.5')
import static ratpack.groovy.Groovy.ratpack
import ratpack.http.MutableHeaders




ratpack {
  handlers {

    //Declare a new handler to handle all incoming requests regardless of method or path
    all {
      MutableHeaders headers = response.headers
      //CORS headers
      headers.set('Access-Control-Allow-Origin', '*')
      headers.set('Access-Control-Allow-Headers', 'x-requested-with, origin, content-type, accept')
      //Delegate processing to the next Handler in the chain
      next()
    }

    get {
      render 'Hej Verden 2'
    }
  }
}
