package com.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductMain {

	ArrayList<Product> list;

	public ProductMain() {
		list = new ArrayList<>();
	}

	public void callMenu(BufferedReader br) throws IOException{
		int menu = 0;
		do {
			System.out.print("1.상품입력 | 2.상품목록보기| 3.종료");

			try{
				menu = Integer.parseInt(br.readLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");
			}

			switch(menu) {
			case 1:
				input(br);
				break;
			case 2:
				output();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
		}while(true);
	}

	public void input(BufferedReader br) throws IOException, NumberFormatException {
		Product p = new Product();
		System.out.print("상품명: ");
		p.setName(br.readLine());
		System.out.print("상품가격: ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("상품번호: ");
		p.setNum(br.readLine());
		System.out.print("상품메이커: ");
		p.setMaker(br.readLine());
		System.out.print("상품재고: ");
		p.setStock(Integer.parseInt(br.readLine()));

		list.add(p);
	}

	public void output() {
		
		System.out.println("총 상품수: " + list.size());
		System.out.println("상품명\t상품가격\t상품번호\t상품메이커\t상품재고");
		System.out.println("=======================================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}


	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ProductMain pm = new ProductMain();
		try {
			pm.callMenu(br);
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다");
		} finally {
			if(br != null)
				try {br.close();}catch(IOException e){}
		}

	}
}
