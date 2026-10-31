package corp.Implementation;

import java.util.Arrays;
class MyException extends RuntimeException{
	public MyException(String str)
	{
		super(str);
	}
}
class ArrayList <T>{
	private int size,capacity;
	T arr[];
	public ArrayList() {
		capacity=2;
		size=0;
		arr=(T[])new Object[capacity];
	}
	public ArrayList(int cap) {
		capacity=cap;
		size=0;
		arr=(T[])new Object[capacity];
	}
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		for(int i=0;i<size;i++)
		{
			if(i!=0) 
				sb.append(", ");
			sb.append(arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}
	//resize
	public void resize() {
		capacity*=2;
		arr=Arrays.copyOf(arr, capacity);
	}
	
	//add
	public void add(T val)
	{
		if(size>=capacity) resize();
		
		arr[size]=val;
		size++;
	}
	public void addFirst(T val)
	{
		if(size>=capacity) resize();
		for(int i=size;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=val;
		size++;
	}
	//remove 
	public void removeLast()
	{
		if(size==0) throw new MyException("list is empty");
		size--;
	}
	public void removeFirst()
	{
		if(size==0) throw new MyException("list is empty");
		for(int i=0;i<size-1;i++)
			arr[i]=arr[i+1];
		size--;
	}
	//Normal operation
	public int size() {
		return size;
	}
	public int capacity() {
		return capacity;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void set(int ind,T val) {
		if(ind<0 || ind>=size)
			throw new MyException("index out of range");
		arr[ind]=val;
	}
	public T get(int ind) {
		if(ind<0 || ind>=size) throw new MyException("index out of range");
		return arr[ind];
	}
	public int indexOf(T val) {
		for(int i=0;i<size;i++)
		{
			if(arr[i]==val) return i;
		}
		return -1;
	}
	public boolean contains(T val) {
		return indexOf(val)!=-1;
	}
	public void clear()
	{
		size=0;
	}
	public void print()
	{
		for(T i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	//At()
	public void addAt(int ind,T val) {
		if(ind <0 || ind>size) throw new MyException("index out of range");
		if(size==capacity) resize();
		for(int i=size;i>ind;i--)
			arr[i]=arr[i-1];
		arr[ind]=val;
		size++;
	}
	public void removeAt(int ind) {
		if(ind<0 || ind>=size) throw new MyException("index out of range");
		if(ind==0) removeFirst();
		else if(ind==size-1) removeLast();
		else {
			for(int i=ind;i<size-1;i++)
				arr[i]=arr[i+1];
			size--;
		}
	}
	
	public void removeValue(T val)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==val) {
				removeAt(i);
				return;
			}
		}
		throw new MyException("value not exist");
	}
	public void removeAll()
	{
		clear();
	}
	public T[] toArray()
	{
		T[] newarr=(T[])new Object[size];
		for(int i=0;i<size;i++)
			newarr[i]=arr[i];
		return newarr;
	}
	public void reverse()
	{
		int s=0,e=size-1;
		while(s<e)
		{
			T temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
		}
	}
	public void sort()
	{
		Arrays.sort(arr,0,size);
	}
	
}
public class ArrayList_Implementation {
	void main() {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(15);
		list.add(25);
		list.addFirst(19);
		System.out.println(list);
	}
}


/*

*/



/*
 
 */