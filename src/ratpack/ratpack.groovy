// @Grab('io.ratpack:ratpack-groovy:1.4.5')

import ratpack.groovy.template.MarkupTemplateModule
import ratpack.groovy.template.TextTemplateModule
import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack
import asset.pipeline.ratpack.AssetPipelineModule
import asset.pipeline.ratpack.AssetPipelineHandler

ratpack {
  bindings {
    module(MarkupTemplateModule)
    module(TextTemplateModule)
  }
  handlers {
    //Declare a new handler to handle all incoming requests regardless of method or path
//    all(new CORSHandler())

    get {
      render groovyTemplate("index.html")
    }

    prefix('item') {

      get {
        //get the list of items
//        render 'get list of items'
        render groovyTemplate('welcome.html')
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

    prefix('api'){

    }


//    assets "static"
    //Served by default from /assets or in this example from the root url
    all(AssetPipelineHandler)
  }

}
