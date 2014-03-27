import grails.converters.JSON
import restful.grails.springsecurity.greach2014.Game
import restful.grails.springsecurity.greach2014.Category

class BootStrap {

    def init = { servletContext ->
        def slot = new Category(name: 'Slot').save()
        def instantWin = new Category(name: 'Instant Win').save()
        def card = new Category(name: 'Card').save()
        def cascade = new Category(name: 'Cascade').save()
        def table = new Category(name: 'Table').save()

        def castleBuilder = new Game(name: 'Castle Builder').addToCategories(slot).save()
        def amazingCircus = new Game(name: 'The Amazing Circus').addToCategories(instantWin).save()
        def pokerDrop = new Game(name: 'Poker Drop Riches').addToCategories(card).addToCategories(cascade).save()
        def petsPayDay = new Game(name: "Pet's Pay Day").addToCategories(slot).save()
        def grandBlackjack = new Game(name: 'Grand Blackjack').addToCategories(card).addToCategories(table).save()

        JSON.registerObjectMarshaller(Game) { Game game ->
            [
                id: game.id,
                name: game.name,
                categories: game.categories
            ]
        }

        JSON.registerObjectMarshaller(Category) { Category category ->
            [
                id: category.id,
                name: category.name
            ]
        }
    }
    def destroy = {
    }
}
