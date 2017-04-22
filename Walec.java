package klasy;

public class Walec {
	
	private double masa;
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	
	public Walec(){
		masa = 50;
	}
	
	public Walec(double wartosc){
		setMasa(wartosc);
	}
	public double obliczGlownyMomentBezwladnosci(){
		return 0;
	}
	public double obliczMomentBezwladnosciSteiner(double promien){
		double rezultat;
		rezultat = getMasa()*promien*promien/2;
		return rezultat;
	}
	public String toString(){
		String tmp;
		tmp = "Walec o masie: "+ this.getMasa()+". Moment Bezw³adnoœci walca wynosi: "
				+this.obliczGlownyMomentBezwladnosci()+". Moment bezw³adnoœci walca wzgledem nowej osi: "
				+this.obliczMomentBezwladnosciSteiner(10);
		return tmp;
	}
}

