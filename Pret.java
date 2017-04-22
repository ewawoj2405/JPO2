package klasy;

public class Pret {

	private double masa;
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public Pret(){
		masa = 50;
	}
	public Pret(double wartosc){
		setMasa(wartosc);
	}
	public double obliczGlownyMomentBezwladnosci(){
		return 0;
	}
	public double obliczMomentBezwladnosciSteiner(double promien){
		double rezultat;
		rezultat = getMasa()*promien*promien/12;
		return rezultat;
	}
	public String toString(){
		String tmp;
		tmp = "Prêt o masie: "+ this.getMasa()+". Moment Bezw³adnoœci prêta wynosi: "
				+this.obliczGlownyMomentBezwladnosci()+". Moment bezw³adnoœci prêta wzgledem nowej osi: "
				+this.obliczMomentBezwladnosciSteiner(10);
		return tmp;
	}
}

