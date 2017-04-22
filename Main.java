package klasy;

public class Main {


	    public static void main(String []args) {
	    	
	    	PunktMaterialny punktmaterialny1 = new PunktMaterialny();
	      	Walec walec1 = new Walec();
	    	Kula kula1 = new Kula();
	    	Pret pret1 = new Pret();
	    	
	    	
	    	punktmaterialny1.setMasa(10);
	    	walec1.setMasa(10);
	    	kula1.setMasa(10);
	    	pret1.setMasa(10);
	    	
	    	System.out.println(punktmaterialny1.getMasa());
	    	System.out.println(walec1.getMasa());
	    	System.out.println(kula1.getMasa());
	    	System.out.println(pret1.getMasa());
	    	
	    	PunktMaterialny punktmaterialny2 = new PunktMaterialny();
	    	Walec walec2 = new Walec();
	    	Kula kula2 = new Kula();
	    	Pret pret2 = new Pret();
	    	
	    	double tmppm2 = punktmaterialny2.getMasa();
	    	double tmpw2 = walec2.getMasa();
	    	double tmpk2 = kula2.getMasa();
	    	double tmpp2 = pret2.getMasa();
	    	
	    	System.out.println(tmppm2);
	    	System.out.println(tmpw2);
	    	System.out.println(tmpk2);
	    	System.out.println(tmpp2);
	    	
	    	System.out.println(punktmaterialny2.toString());
	    	System.out.println(walec2.toString());
	    	System.out.println(kula2.toString());
	    	System.out.println(pret2.toString());
	    	
	    	PunktMaterialny[] tablica = new PunktMaterialny[5];
	    	for(int i=0; i<5; i++){
	    		tablica[i] = new PunktMaterialny(i*20);
	    		System.out.println(tablica[i].toString());
	    	}
	    
	    	Walec[] tablica1 = new Walec[5];
	    	for(int i=0; i<5; i++){
	    		tablica1[i] = new Walec(i*20);
	    		System.out.println(tablica1[i].toString());
	    	}
	    	Kula[] tablica2 = new Kula[5];
	    	for(int i=0; i<5; i++){
	    		tablica2[i] = new Kula(i*20);
	    		System.out.println(tablica2[i].toString());
	    	}
	    	Pret[] tablica3 = new Pret[5];
	    	for(int i=0; i<5; i++){
	    		tablica3[i] = new Pret(i*20);
	    		System.out.println(tablica3[i].toString());
	    	}
	    }
	    
	    
}