import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class createfile{

	// public static void WriteToFile(File f){

	 // try{
	 // 	  f.write("Hello world");
	 // 	  f.close();
	 // 	  System.out.println("Succefully wrote to the file");
	 // }catch(IOException e){
	 // 	System.out.println("An Error occurred to write  file");
  //       e.printStackTrace();
	 // }	
    
	// }

   public static File  create(String name){
  
   	try{
   File file =new File("C:\\Users\\Emma\\Desktop\\Test\\"+name+".txt");//specify the filename
      if(file.createNewFile()){	
       System.out.println("File Created :" + file.getName());   
   	    }else{
   	    	System.out.println("File already exists.");
   	    }

   	   }catch(IOException e){
   	   	System.out.println("An Error occurred.");
   	   	e.printStackTrace();
   	   }

   	   return file;
   }

   public static  void GetInfoFile(File file){

   	System.out.println("File name: "   + file.getName());
    System.out.println("Absolute path" + file.getAbsolutePath());
    System.out.println("Writeable: "   + file.canWrite());
    System.out.println("Readable: "    + file.canRead());
    System.out.println("File size "    + file.length());
   }

   public static void main(String[] args) {
   	Scanner scan = new Scanner(System.in);

  String fileName;

  System.out.println("Nombre del Archivo :");
  fileName =scan.nextLine();
   
  String op;

  for (int i=0;i<10 ;i ++ ) {
  GetInfoFile(create(fileName+i));
  	
  }
  






   }
}