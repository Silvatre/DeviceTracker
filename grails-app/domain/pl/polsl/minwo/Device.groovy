package pl.polsl.minwo

class Device {
	String name;
	String description;
	
	static hasMany = [locations: Location];
	
    static constraints = {
		name();
		description();
		locations(nullable: true);
    }
	
	@Override
	public String toString() {
		"${name}"
	}
}
