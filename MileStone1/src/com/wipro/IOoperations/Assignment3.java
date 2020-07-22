package com.wipro.IOoperations;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Assignment3 {
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
	File fileIn = new File(args[0]);
	File fileOut = new File(args[1]);
	BufferedReader br = new BufferedReader(new FileReader(fileIn));
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
	Map<String, Integer> map = new TreeMap<String, Integer>();
	String Str;
	while ((Str = br.readLine()) != null) {
		Str = Str.trim();
		String[] words = Str.split(" ");
		for (String word:words) {
			if(!(map.containsKey(word))) {
				map.put(word, 1);
			}
			else {
				map.put(word, map.get(word) + 1);
			}
		}
	}
	Set<Entry<String, Integer>> set = map.entrySet(); 
	Iterator<Entry<String, Integer>> it = set.iterator();
	while (it.hasNext()) {
		Entry<String, Integer> me = it.next();
		bw.write(me.getKey() + " : " + me.getValue() + "\n");
	}
	br.close();
	bw.close();
}
}
