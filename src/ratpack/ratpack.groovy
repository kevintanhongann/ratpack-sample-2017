// @Grab('io.ratpack:ratpack-groovy:1.4.5')
import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    //Declare a new handler to handle all incoming requests regardless of method or path
    all(new CORSHandler())

    get {
      render 'Hej Verden 2'
    }

    prefix('item') {

      get {
        //get the list of items
        render 'get list of items'
      }

      get(':id'){
        render 'get item '+pathTokens.id
      }

      get('update/:id?'){

      }

      get('create') {
        render 'create item'
      }

      post('save'){

      }
    }

  }
}
