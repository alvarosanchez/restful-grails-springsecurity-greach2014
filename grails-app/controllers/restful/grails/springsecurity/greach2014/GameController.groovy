package restful.grails.springsecurity.greach2014

import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class GameController extends RestfulController {

    static responseFormats = ['json', 'xml']

    GameController() {
        super(Game)
    }

}
