package com.Mock1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Dispatchable{
	void generateDispatchNote(Delivery[] items);

	double findTotalBilling(Delivery[] items);

	double findTotalBilling(Delivery[] items, String city);
}
abstract class Delivery{
	private String deliveryId;
	private String customerName;
	private double packageWeight;
	private double dispatchCharge;
	
	private static long localCounter;
	private static long interstateCounter;
	static {
		localCounter = 1000; 
		interstateCounter = 1000;
	}
	
	public abstract void calculateDispatchCharge(); 
	
	public Delivery(String customerName,double packageWeight) {
		setCustomerName(customerName);
		setPackageWeight(packageWeight);
	}
	public void setCustomerName(String name) {
		if(name.matches("[A-Z][a-z]+( [A-Z][a-z]+)+")) {
			this.customerName=name;
		}
	}
	public void setPackageWeight(double pw) {
		if(pw>0)this.packageWeight=pw;
		else this.packageWeight=0;
	}

	public String getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public double getDispatchCharge() {
		return dispatchCharge;
	}

	public void setDispatchCharge(double dispatchCharge) {
		this.dispatchCharge = dispatchCharge;
	}

	public static long getLocalCounter() {
		return localCounter;
	}

	public static void setLocalCounter(long localCounter) {
		Delivery.localCounter = localCounter;
	}

	public static long getInterstateCounter() {
		return interstateCounter;
	}

	public static void setInterstateCounter(long interstateCounter) {
		Delivery.interstateCounter = interstateCounter;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getPackageWeight() {
		return packageWeight;
	}
	
	
}
class LocalDelivery extends Delivery{
	private String serviceCity;
	
	public LocalDelivery(String customerName, double packageWeight,String serviceCity) {
		super(customerName, packageWeight);
		setLocalCounter(getLocalCounter()+1);
		this.setDeliveryId("LDL"+getLocalCounter());
		this.serviceCity=serviceCity;
	}

	@Override
	public void calculateDispatchCharge() {
		int rate;
		double q=this.getPackageWeight();
		if(q<=5)rate=8;
		else if(q<=20)rate=6;
		else rate=5;
		
		String city=this.serviceCity;
		int extra=0;
		if(city.equals("Pune"))extra=20;
		else if(city.equals("Surat"))extra=25;
		else if(city.equals("Bhopal"))extra=30;
		else extra=40;
		this.setDispatchCharge(((q*rate+extra)*100)/100.0);
	}

	public String getServiceCity() {
		return serviceCity;
	}

	public void setServiceCity(String serviceCity) {
		this.serviceCity = serviceCity;
	}
	
}
class InterstateDelivery extends Delivery{
	private String destinationState;
	private double interstateLevy;
	
	public InterstateDelivery(String customerName, double packageWeight,String destinationState) {
		super(customerName, packageWeight);
		setInterstateCounter(getInterstateCounter()+1);
		this.setDeliveryId("IDL"+getInterstateCounter());
		this.destinationState=destinationState;
	}

	@Override
	public void calculateDispatchCharge() {
		double base=getPackageWeight()*15;
		int percent=0;
		String state=this.destinationState;
		if(state.equals("Odisha"))percent=12;
		else if(state.equals("Assam"))percent=15;
		else if(state.equals("Punjab"))percent=10;
		else percent=20;
		
		this.interstateLevy=Math.round((base * percent / 100) * 100) / 100.0;
		setDispatchCharge(Math.round((base + interstateLevy) * 100) / 100.0);
	}

	public String getDestinationState() {
		return destinationState;
	}

	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

	public double getInterstateLevy() {
		return interstateLevy;
	}

	public void setInterstateLevy(double interstateLevy) {
		this.interstateLevy = interstateLevy;
	}
	
}
class NoDeliveryFoundException extends Exception{
	public NoDeliveryFoundException(String str) {
		super(str);
	}
}
public class DeliveryManager implements Dispatchable {
	public void generateDispatchNote(Delivery[] items) {
		for(Delivery item:items) {
			item.calculateDispatchCharge();
		}
	}
	public double findTotalBilling(Delivery[] items) {
		double sum=0;
		for(Delivery item:items) {
			sum+=item.getDispatchCharge();
		}
		sum=Math.round((sum*100)/100.0);
		return sum;
	}
	public double findTotalBilling(Delivery[] items, String city) {
		double sum=0;
		for(Delivery item:items) {
			if(item instanceof LocalDelivery && ((LocalDelivery) item).getServiceCity().equalsIgnoreCase(city)) {
				sum+=item.getDispatchCharge();
			}
		}
		return sum;
	}
	public String[] findDeliveriesByCity(Delivery[] items, String city) throws NoDeliveryFoundException{
		List<String> list=new ArrayList<>();
		for(Delivery item:items) {
			if(item instanceof LocalDelivery && ((LocalDelivery) item).getServiceCity().equalsIgnoreCase(city)) {
				list.add(item.getDeliveryId());
			}
		}
		if(list.isEmpty())throw new NoDeliveryFoundException("No deliveries found for the given city!");
		
		
		else {
			String[] arr=new String[list.size()];
			for(int i=0;i<list.size();i++) {
				arr[i]=list.get(i);
			}
			return arr;
		}
	}
	public Map<String,Double> getCityWiseBilling(Delivery[] items){
		Map<String,Double> map=new HashMap<>();
		for(Delivery item:items) {
			if(item instanceof LocalDelivery) {
				LocalDelivery obj=(LocalDelivery) item;
				String key=obj.getServiceCity();
				Double value=map.getOrDefault(key, 0.0)+item.getDispatchCharge();
				map.put(key,(Math.round(value)*100)/100.0);
			}
		}
		return map;
	}
	public static void main(String[] args) {
	}
}
