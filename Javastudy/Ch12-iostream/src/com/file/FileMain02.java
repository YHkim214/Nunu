package com.file;

import java.io.*;

public class FileMain02 {

	public static void main(String[] args) {
		
		//절대경로
//		String path = "D:\\javawork\\sample.txt";
		String path = "D:"+File.separator+"javawork"+File.separator+"sample.txt";
		String path2 = "D:"+File.separator+"javawork"+File.separator+"example.txt";
		//상대경로 루트경로를 프로젝트 디렉토리로 본다.
//		String path = "sample.txt";
		
		File f1 = new File(path);
		System.out.println("===파일생성===");
		try {//제공된 경로를 기반으로 파일생성. 성공여부 반환.
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===파일정보===");
		System.out.println("절대경로:" + f1.getAbsolutePath());
		System.out.println("상대경로:" + f1.getPath());
		System.out.println("디렉토리명:" + f1.getParent());
		System.out.println("파일명: " + f1.getName());
		
		System.out.println("===파일명 변경===");
		
		File f2 = new File(path2);
		System.out.println(f1.renameTo(f2));
		System.out.println("===파일삭제===");
		if(f2.delete()) {//삭제시도후 삭제여부 반환
			System.out.println(f2.getName() + "삭제");
		} else {
			System.out.println("파일이 존재하지 않습니다");
		}
	}

}