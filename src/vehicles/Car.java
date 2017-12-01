package vehicles;

import enums.Colour;

public class Car implements Vehicles{
	
	String vehicleNo;
	Colour colour;
	
	public Car(String vehicleNumber,Colour carColour){
		this.vehicleNo=vehicleNumber;
		this.colour=carColour;
		
		}

	@Override
	public String getVehicleNo() {
		return vehicleNo;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Colour getVehicleColour() {
		return colour;
		// TODO Auto-generated method stub
		
	}

}
