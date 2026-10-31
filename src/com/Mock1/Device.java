package com.Mock1;

import java.util.ArrayList;
import java.util.List;

public class Device implements Comparable{
	private int id;
	private String name;
	private double price;
	
	public Device(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Device other=(Device)o;
		if(this.price<other.price) {
			return -1;
		}else if(this.price>other.price) {
			return 1;
		}else {
			return other.name.compareTo(this.name);
		}
	}
	
	public static void main(String[] args) {
//		Device obj1=new Device(101,"Smart TV",50000);
//		Device obj2=new Device(103,"Fridge",30000);
//		Device obj3=new Device(104,"AC",80000);
//		Device obj4=new Device(105,"Washing Machiene",20000);
//		Device obj5=new Device(106,"Speakers",10000);
//		Device obj6=new Device(106,"apeakers",10000);
//		List<Device> list=new ArrayList<>();
//		list.add(obj1);
//		list.add(obj2);
//		list.add(obj3);
//		list.add(obj4);
//		list.add(obj5);
//		list.add(obj6);
//		list.sort(null);
//		System.out.println(list);
		
	}
}
