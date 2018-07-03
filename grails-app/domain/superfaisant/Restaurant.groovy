package superfaisant

class Restaurant {

	String name

    static constraints = {
    	name blank: false, unique:true
    }
}
