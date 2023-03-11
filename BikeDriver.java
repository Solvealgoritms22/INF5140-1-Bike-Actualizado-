package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike("drop", "racing", "tread less", "razor", 19, 20, 20);
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		//Bike bike4 = new Bike();
		
		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println(bike3.toString());
		//System.out.println(bike4.toString());
	}//end method main

}//end class BikeDriver