package org.transport;

import org.road.Road;

public class Transport extends Road{
	//Create an object for all 4 classes  inside the Transport class 
	//and call all classes methods also follow the all coding standards. 
	public void TransportForm() {
		System.out.println("Transport Form");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.TransportForm();
		t.bike();
		t.cycle();
		t.bus();
		t.car();
		t.aeroPlane();
		t.heliCopter();
		t.boat();
		t.ship();
	
	}
}
