package pl.polsl.minwo

import java.util.Formatter.DateTime

class Location {
	Date date;
	double latitude;
	String latitudeDirection;
	double longitude;
	String longitudeDirection;
	
	static belongsTo = [device: Device];
    static constraints = {
		device();
		latitude();
		latitudeDirection();
		longitude();
		longitudeDirection();
		date(); 
		latitude(min: 0d, max: 90d, scale: 15);
		latitudeDirection(inList: ["N","S"]);
		longitudeDirection(inList: ["E","W"]);
		longitude(min: 0d, max: 180d, scale: 15);
    }
	
	@Override
	public String toString() {
		return date.toString();
	}
}
