package com.array;

public class BookMain2 {

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		int total = 0;
		
		bookArray[0] = new Book("IT", "Java", 5000, 5);
		bookArray[1] = new Book("IT", "Android", 7000, 3);
		bookArray[2] = new Book("예술", "BTS", 6000, 6);
		
		for(Book b : bookArray) {
			
			System.out.printf("%s\t" , b.getCategory());
			System.out.printf("%s\t" , b.getName());
			System.out.printf("%,d원\t" , b.getPrice());
			System.out.printf("%.1f%%\n" , b.getDiscount());
			
			total += b.getPrice();
			
		}
		
		System.out.println("===============================");
		System.out.printf("책 가격의 합: %,d원" , total);
	}

}
