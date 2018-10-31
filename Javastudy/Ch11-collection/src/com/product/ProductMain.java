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
			System.out.print("1.��ǰ�Է� | 2.��ǰ��Ϻ���| 3.����");

			try{
				menu = Integer.parseInt(br.readLine());
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� ���");
			}

			switch(menu) {
			case 1:
				input(br);
				break;
			case 2:
				output();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��Է��߽��ϴ�.");
				break;
			}
		}while(true);
	}

	public void input(BufferedReader br) throws IOException, NumberFormatException {
		Product p = new Product();
		System.out.print("��ǰ��: ");
		p.setName(br.readLine());
		System.out.print("��ǰ����: ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("��ǰ��ȣ: ");
		p.setNum(br.readLine());
		System.out.print("��ǰ����Ŀ: ");
		p.setMaker(br.readLine());
		System.out.print("��ǰ���: ");
		p.setStock(Integer.parseInt(br.readLine()));

		list.add(p);
	}

	public void output() {
		
		System.out.println("�� ��ǰ��: " + list.size());
		System.out.println("��ǰ��\t��ǰ����\t��ǰ��ȣ\t��ǰ����Ŀ\t��ǰ���");
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
			System.out.println("���ܰ� �߻��߽��ϴ�");
		} finally {
			if(br != null)
				try {br.close();}catch(IOException e){}
		}

	}
}
