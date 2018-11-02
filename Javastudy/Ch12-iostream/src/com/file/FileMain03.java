package com.file;

import java.io.File;

public class FileMain03 {

	public static void main(String[] args) {
		String path = "D:\\javawork\\javasample";
		String path2 = "D:\\javawork\\javasample2";
		File f1 = new File(path); //디렉토리 생성
		System.out.println(f1.mkdir());
		
		File f2 = new File(path2); //이름변경
		System.out.println(f1.renameTo(f2));
		
		if(f2.delete()) {
			System.out.println(f2.getName() + "삭제성공");
		} else {
			System.out.println("디렉토리가 없습니다.");
		}
	}

}
