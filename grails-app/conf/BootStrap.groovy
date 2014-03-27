import grails.converters.JSON
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import restful.grails.springsecurity.greach2014.Game
import restful.grails.springsecurity.greach2014.Category

class BootStrap {

    def userDetailsService

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

        UserDetails jimi = new User('jimi', 'jimispassword', [new SimpleGrantedAuthority('ROLE_USER'), new SimpleGrantedAuthority('ROLE_ADMIN')])
        userDetailsService.createUser(jimi)

        UserDetails alvaro = new User('115537660854424164575', 'N/A', [new SimpleGrantedAuthority('ROLE_USER'), new SimpleGrantedAuthority('ROLE_ADMIN')])
        userDetailsService.createUser(alvaro)

    }
    def destroy = {
    }
}
