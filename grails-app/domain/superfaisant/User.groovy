package superfaisant

class User {

	String name
	String lastName
	String login
	String password
	String email
	boolean admin = false

	String toString() {
		return this.name + ' ' + this.lastName
	}

    static constraints = {
    	name blank: false
        lastName blank: false
        login size: 5..15, blank: false, unique: true
        password size: 5..15, blank: false
        email email: true
    }
}
