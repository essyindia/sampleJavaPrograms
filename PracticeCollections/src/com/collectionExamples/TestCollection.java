package com.collectionExamples;

import java.util.*;

public class TestCollection<E> {
	public static void main(String[] args) {
		
		TestCollection objTc =new TestCollection();
		ArrayList objA = objTc.createArrayList();
		
//		public abstract int size();
//		public abstract boolean isEmpty();
//		public abstract boolean contains(java.lang.Object);
		
		System.out.println("Size :: "+objA.size());
		System.out.println("IsEmpty :: "+objA.isEmpty());
		System.out.println("Contains :: "+objA.contains(100));		

//		public abstract java.util.Iterator<E> iterator();
		
		Iterator itr = objA.iterator();
		objTc.processIterator(itr);

//		public abstract java.lang.Object[] toArray();
//		public abstract <T> T[] toArray(T[]);
		
		LinkedList objL = objTc.createLinkedList();
		Object[] obj1 = objL.toArray();
		System.out.print("\nUse of foreach where Iterator can't help :: ");
		for(Object obj : obj1){
			System.out.print(obj+ " ");
		}
				
//		public abstract boolean add(E);
		
		objA.add(obj1[0]);
		
		System.out.println();
		objTc.processIterator(objA.iterator());
//		public abstract boolean remove(java.lang.Object);
//		public abstract boolean containsAll(java.util.Collection<?>);
//		public abstract boolean addAll(java.util.Collection<? extends E>);
//		public abstract boolean removeAll(java.util.Collection<?>);
//		public boolean removeIf(java.util.function.Predicate<? super E>);
//		public abstract boolean retainAll(java.util.Collection<?>);
//		public abstract void clear();
//		public abstract boolean equals(java.lang.Object);
//		public abstract int hashCode();
//		public java.util.Spliterator<E> spliterator();
//		public java.util.stream.Stream<E> stream();
//		public java.util.stream.Stream<E> parallelStream();

	}
	
	private void processIterator(Iterator itr) {
		System.out.print("Values in Iterator :: ");
		while(itr.hasNext()){
			if(itr.hasNext())
				System.out.print(itr.next() + ",");
			else
				System.out.print(itr.next());
		}
		
	}
	public ArrayList<E> createArrayList(){
		ArrayList defaultArraylist = new ArrayList<E>();
		defaultArraylist.add( new Integer(100));
		defaultArraylist.add( "testStr1");		
		System.out.println("Default ArrayList :: " + defaultArraylist);
		
		return defaultArraylist;
	}
	public LinkedList<E> createLinkedList(){
		LinkedList defaultLinkedList = new LinkedList<E>();
		defaultLinkedList.add( new Integer(200));
		defaultLinkedList.add( "testStr2");

		return defaultLinkedList;
	}

}
