package test7
import grails.rest.*
@Resource(uri='/products')

class Product {
    String orderablePart
    String rootPart
    String productFamily
    String description
    String productLifeCycle


    static constraints = {
        orderablePart nullable: true
        rootPart nullable: true
        productFamily nullable: true
        description nullable: true
        productLifeCycle nullable: true
        version nullable: true
    }
}
