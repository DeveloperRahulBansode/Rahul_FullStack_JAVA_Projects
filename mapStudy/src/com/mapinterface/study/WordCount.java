package com.mapinterface.study;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) {

		String msg = "my name is Bond ,James Bond;" + "my grand Father name ;is also jems," + "we are bond family";
		
	}

	public static Map<String, Integer> getWordCount(String msg) {
		StringTokenizer tokens = new StringTokenizer(msg, "[,:;]");
		Map<String, Integer> wordCount = new HashMap<>();

		while (tokens.hasMoreElements()) {

			String temp = tokens.nextToken();
			if (wordCount.putIfAbsent(temp.toLowerCase(), 1) != null) {
				wordCount.compute(temp, (k, v) -> v + 1);

			}
			wordCount.forEach((k, v) -> System.out.println("Key:" + k + " " + "value:" + v));
		}

		return wordCount;

	}

}
