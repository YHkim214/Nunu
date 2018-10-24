package com.score;

import java.io.IOException;

public class ScoreMain {
	public static void main(String[] args) {
		try {
			Score.entry();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
