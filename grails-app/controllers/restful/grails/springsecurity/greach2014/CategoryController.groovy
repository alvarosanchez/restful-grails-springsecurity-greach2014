package restful.grails.springsecurity.greach2014

import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CategoryController extends RestfulController {

    static responseFormats = ['json', 'xml']

    CategoryController() {
        super(Category)
    }


}
