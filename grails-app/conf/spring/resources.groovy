import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer
import restful.grails.springsecurity.greach2014.Category
import restful.grails.springsecurity.greach2014.Game

// Place your Spring DSL code here
beans = {

    categoriesRenderer(HalJsonCollectionRenderer, Category)

    categoryRenderer(HalJsonRenderer, Category)

    gamesRenderer(HalJsonCollectionRenderer, Game)

    gameRenderer(HalJsonRenderer, Game)

}
