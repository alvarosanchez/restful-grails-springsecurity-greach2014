package restful.grails.springsecurity.greach2014

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CategoryController extends RestfulController {

    static responseFormats = ['json', 'hal']

    CategoryController() {
        super(Category)
    }

    @Secured(['ROLE_USER'])
    def index() {
        respond params.gameId ? Game.get(params.gameId).categories : Category.list()
    }


}
