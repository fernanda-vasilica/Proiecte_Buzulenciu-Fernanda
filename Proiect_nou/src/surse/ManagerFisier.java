package surse;
import java.io.*;
import java.util.ArrayList;
//Citire si scriere in fisier
public class ManagerFisier {
  private static final int ArrayList = 0;
  String caleFisierIntrebari;
  String caleFisierRaspunsuri;
  String caleFisierRasCorecte;
  
	//Functionalitate pt citirea intrebarilor din fisier
	// Functionalitate pt scrierea raspunsurilor 
	
	//La constructor se vor da 2 Stringuri 
	//1.Cale fisier cu intrebari
	//2.Cale fisier pt scrierea raspunsurilor
	
	//Metoda pt citire()
	//-> retuneaza 2 ArrayList'uri 
	//--> primul contine intrebari
	//--> al doilea contine variantele de raspuns
	
	//Metoda pt scrierea raspunsurilor corecte
	//->primeste lista cu raspunsuri
	//-> o scrie in fisier pt raspunsuri 
	
	
	public ManagerFisier(String a , String b, String c) {
	this.caleFisierIntrebari = a;
	this.caleFisierRaspunsuri = b ;
	this.caleFisierRasCorecte = c;
	}
	
public String [] citesteIntrebarile() {
	 //Stocare cale fisier de citire
	String [] listaIntrebari = new String[10];
	   
	   
	   // Instantiere clasa fisier
	   File fisierCitire = new File(this.caleFisierIntrebari);
	   
	   //Tratarea exceptiilor cu try catch
	   try {
		   //Instantiere exceptiilor de fisier
		   FileReader fr = new FileReader(fisierCitire);
		   
		   //Instantiere stream de citire fisier
		   BufferedReader br = new BufferedReader(fr);
		   
		   //citire fisier
		   try {
			String st;
			int idx = 0 ;
			   while((st = br.readLine()) != null) {
				   listaIntrebari[idx] = st;
				   idx++;
			   }
				  
		} catch (	IOException e) {
			// TODO Auto-generated catch block
			System.out.println("A fost o exceptie" + e.toString());
		}
		   
	   }catch (FileNotFoundException ex) {
		   System.out.println("Am prins exceptia" + ex.toString());
	   }
	   return listaIntrebari;
}
	   public String [] citesteRaspunsuri() {
			 //Stocare cale fisier de citire
			String [] listaRaspunsuri = new String[100];
			   
			   
			   // Instantiere clasa fisier
			   File fisierCitireRaspunsuri = new File(this.caleFisierRaspunsuri);
			   
			   //Tratarea exceptiilor cu try catch
			   try {
				   //Instantiere exceptiilor de fisier
				   FileReader fr = new FileReader(fisierCitireRaspunsuri);
				   
				   //Instantiere stream de citire fisier
				   BufferedReader br = new BufferedReader(fr);
				   
				   //citire fisier
				   try {
					String st;
					int idx = 0 ;
					int i ;
					String answer;
					   while((st = br.readLine()) != null) {
						   i = 0;
						  while(i<5) { // i trebuie sa fie = nr raspunsuri
							  String [] answers = st.split(",");
							  answer = answers[i]; 
							  listaRaspunsuri[idx] = answer; 
							  idx++;
							  i++;
						  }
			 
						   
					   }
						  
				} catch (	IOException e) {
					// TODO Auto-generated catch block
					System.out.println("A fost o exceptie" + e.toString());
				}
				   
			   }catch (FileNotFoundException ex) {
				   System.out.println("Am prins exceptia" + ex.toString());
			   }
			   return listaRaspunsuri;
	      }
	   
	   
	 public ArrayList<String> scriereRaspunsuri( ArrayList<String> raspCorecte) { 
			   //ArrayList<String> raspCorecte = new ArrayList<String>();
	      
	           
	         File f = new File(caleFisierRasCorecte);
	         FileWriter fw ;
	    try {
	    	fw = new FileWriter(f);
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	
	    	for(String numeVariabila : raspCorecte) {
	    		bw.write(numeVariabila + "\n");
	    		
	    	}
	    	bw.close();
	    	
	    	System.out.println("Am scris cu succes.");
	    	
	    } catch (IOException e) {
	           System.out.println("Fisierul nu a fost gasit ");
	   }  
	    return raspCorecte;
			  }

	 
}
