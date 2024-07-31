package com.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Properties;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("dbConfig.properties");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		System.out.println("file craeted");
		
		FileOutputStream fos=new FileOutputStream(file);
		
		Properties p=new Properties();
		
		p.setProperty("spring.datasource.url", "jdbc:h2:mem:testdb");
		
		p.store(fos, "File created");
		
		
		FileInputStream fis=new FileInputStream(file);
		
		p.load(fis);
		
		Collection<Object> val=	p.values();
		
		System.out.println(val);
	}

}
