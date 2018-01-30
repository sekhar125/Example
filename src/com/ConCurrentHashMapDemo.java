package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMap<String,String> map=new ConcurrentHashMap<String,String>();
		map.put("1","add");
		map.put("2","add");
		map.put("3","add");
		Set<Entry<String, String>> entires = map.entrySet();
		for(Entry<String,String> ent:entires){
		System.out.println(ent.getKey()+" ==> "+ent.getValue());
		}

        
	}

}
