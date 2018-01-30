package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Scanner;

public class BufferReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream fis=null;
		BufferedReader br=null;
		try{
			fis=new FileInputStream("C:/Users/sekhar.babu.thammulu/Desktop/ee-misc.log");
			/*br=new BufferedReader(new InputStreamReader(fis));
			String line=br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=br.readLine();
			}*/
			 Scanner scanner = new Scanner(fis);
			 while(scanner.hasNextLine()){
		            System.out.println(scanner.nextLine());
		        }
		      
		        scanner.close();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
