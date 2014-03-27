import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer
import restful.grails.springsecurity.greach2014.Game
import restful.grails.springsecurity.greach2014.Category

// Place your Spring DSL code here
beans = {

    categoriesRenderer(JsonCollectionRenderer, Category) {
        excludes = ['class']
    }

    categoryRenderer(JsonRenderer, Category) {
        excludes = ['class']
    }



}
