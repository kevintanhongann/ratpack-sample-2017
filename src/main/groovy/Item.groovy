import grails.persistence.Entity
import groovy.transform.ToString

/**
 * Created by kevintan on 25/03/2017.
 */

@Entity
@ToString
class Item {
    String name
    String description
}
