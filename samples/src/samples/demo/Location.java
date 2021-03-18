package samples.demo;

public class Location {

	private String locationName;
	private int locationID;
	private String locationDetail;
	
	public void setLocationName(String locationName) {
		this.locationName=locationName;
	}
	
	public void setLocationID(int locationID) {
		this.locationID=locationID;
	}
	
	public void setLocationDetail(String locationDetail) {
		this.locationDetail=locationDetail;
	}
	
	public String getLocationName() {
		return locationName;
	}
	
	public int getLocationID() {
		return locationID;
	}
	
	public String getLocationDetail() {
		return locationDetail;
	}
}
