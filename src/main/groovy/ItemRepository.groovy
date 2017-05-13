import ratpack.exec.Blocking

/**
 * Created by kevintan on 25/03/2017.
 */
class ItemRepository {

    def save(String name , String description){
        Item item = new Item(name: name, description: description)
        item.save()
    }

    def list(){
        Blocking.get {
            Item.all
        }
    }

    def getById(Long id){
        Blocking.get {
            Item.findById(id)
        }
    }

    def findByName(String name){
        Blocking.get {
            Item.findByName(name)
        }
    }
}
