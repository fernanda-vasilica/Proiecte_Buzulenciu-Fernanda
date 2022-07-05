import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
   public static void  main(String[] args ) {
     	  /* String caleFisier ="C:\\Users\\SONY\\Desktop\\fisier.txt";
     	   String caleFisierRaspunsuri = "C:\\Users\\SONY\\Desktop\\raspunsuri.txt";
           String caleFisierRasCorecte = "C:\\Users\\SONY\\Desktop\\raspunsuriCorecte.txt ";
           
           ManagerFisier  mf =new ManagerFisier(caleFisier, caleFisierRaspunsuri, caleFisierRasCorecte);
           String[] raspunsuri = new String[10];
          
           raspunsuri = mf.citesteRaspunsuri();
           
           for (int i = 0; i < raspunsuri.length; i++) {
			 System.out.println(raspunsuri[i]);
			 
           }
           
          /* ArrayList<String> raspCorecte = new ArrayList<String>();
           raspCorecte.add("hggth");
           raspCorecte.add("grrfd");
           
         mf.scriereRaspunsuri(raspCorecte);*/
           
          String rasp = "*ddsfsdfdsabc" ;
          System.out.println(rasp);
	     //rasp = rasp.replace('*', ' ');
	    // System.out.println(rasp);
	     
	     rasp = rasp.substring(0);
	     System.out.println(rasp);
   
   }
}
