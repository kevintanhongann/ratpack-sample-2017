// @Grab('io.ratpack:ratpack-groovy:1.4.5')
import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    //Declare a new handler to handle all incoming requests regardless of method or path
    all(new CORSHandler())

    get {
      render 'Hej Verden 2'
    }
  }
}
