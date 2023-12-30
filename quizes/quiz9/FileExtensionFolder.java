/*Write a Java program to get files with  specific extension from a specified folder.*/
package quiz;

import java.io.File;

public class FileExtensionFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folder_path = "C:/Users/nanda/Desktop/jhansi/internship/work/diabetic_data.csv";
		String extension = "csv";
		File folder = new File(folder_path);
		File[] files = folder.listFiles((dir,name) -> name.endsWith("."+extension));
		if(files.length>0) {
			System.out.println("File with extension ."+extension+" in folder "+folder_path+" : ");
			for(File file:files) {
				System.out.println(file.getName());
			}
		}
		else {
			System.out.println("No files found wiht extension ."+extension);
		}
	}

}
