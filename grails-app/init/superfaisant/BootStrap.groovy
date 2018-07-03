package superfaisant

class BootStrap {

    def init = { servletContext ->
	    if (!Restaurant.count()) {
	    	print 'Create'
	    	new Restaurant(name: 'King Croissant').save(failOnError: true)
	    	new Restaurant(name: 'Les trois mi-temps').save(failOnError: true)
	    	new User(name: 'Antoine', lastName: 'Svahn', login: 'toinou', password: 'jilpo:32', email: 'antoine@svahn.fr').save(failOnError: true)
	    	new Event(name: 'barbeuc de faisant', owner: User.findByLogin('toinou')).save(failOnError: true)

	    }
    }
    def destroy = {
    }
}
