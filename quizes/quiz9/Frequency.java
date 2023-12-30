package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folder_path = "C:/Users/nanda/Desktop/jhansi/workshop/html";
		String extension = "txt";
		File folder = new File(folder_path);
		File[] files = folder.listFiles((dir,name) -> name.endsWith("."+extension));
		HashMap<String,Integer> map = new HashMap<>();
		if(files.length>0) {
			System.out.println("File with extension ."+extension+" in folder "+folder_path+" : ");
			for(File file:files) {
				BufferedReader br;
				try{
					br = new BufferedReader(new FileReader(file));
					String line;
					while((line=br.readLine()) != null) {
						String words[] = line.split(" ");
						for(String word:words) {
							word = word.toLowerCase();
							if(map.containsKey(word)) {
								map.put(word, map.get(word)+1);
							}
							else {
								map.put(word, 1);
							}
						}
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		else {
			System.out.println("No files found wiht extension ."+extension);
		}
		for(Map.Entry<String,Integer> arr : map.entrySet()) {
			System.out.println("Word: "+arr.getKey()+", Frequency: "+arr.getValue());
		}
	}

}
