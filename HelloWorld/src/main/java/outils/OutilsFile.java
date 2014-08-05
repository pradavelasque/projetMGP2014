package outils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OutilsFile {
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	   
	    //version java 8
	    /*Files.walk(Paths.get("/home/you/Desktop")).forEach(filePath -> {
	        if (Files.isRegularFile(filePath)) {
	            System.out.println(filePath);
	        }
	    });
	    */
	}
	
	public static List<String> getNamesMusic(String nameDirectory){
		
		List<String> names = new ArrayList<String>();
		
		
		
		try {
			Files.walk(Paths.get(nameDirectory)).forEach(filePath -> {
			    if (Files.isRegularFile(filePath)) {
			        System.out.println(filePath);
			        String value = filePath.getFileName().toString();
			        
			        if (value.endsWith(".mp3")) {
			        	 names.add(filePath.getFileName().toString());
					}
			        
			       
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("methode getNamesMusic..." + names);
		return names;
		
	}
	
	public static File[]  listFolder(String name){
		
		final File folder1 = new File(name);
		return folder1.listFiles();
		
	}

}
