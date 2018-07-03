package superfaisant

class EventController {

    def index() { }
    def listEvent() {
    	[events: Event.listOrderByName()]
    }
    def login() {
    	if (params.login != null) {
    		def user = User.findByLogin(params.login)
    		if (user != null) {
                if (user.password == params.password) {
                    session.user = user.login
                    session.userAdmin = user.admin
                    session.userLastName = user.lastName
                    session.userName = user.name
                    redirect(controller: "Event", action: "listEvent")
                } 
            }
    	}
    	[login: false, message: 'Login ou mot de passe incorrect']
    }
}
