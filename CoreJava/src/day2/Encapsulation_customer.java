package day2;
//Customer data collection by using entity
public class Encapsulation_customer {
//Customer 
	private int cid;
	private String name;
	private String city;
		//JVM needs the constructor call whenever we created an object
	public int getCid() {
		return cid;
	 }
	 public void setCid(int cid) {
		 this.cid = cid;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 @Override
	 public String toString() {
		return "Encapsulation_customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	 }
}
