package restful.grails.springsecurity.greach2014

import grails.rest.Resource

@Resource
class Game {

    String name

    static hasMany = [categories: Category]

    static constraints = {
    }
}
