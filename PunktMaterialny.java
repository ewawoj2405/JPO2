package klasy;

public class PunktMaterialny {
	
	private double masa;
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public PunktMaterialny(){
		masa = 50;
	}
	
	public PunktMaterialny(double wartosc){
		setMasa(wartosc);
	}
	public double obliczGlownyMomentBezwladnosci(){
		return 0;
	}
	public double obliczMomentBezwladnosciSteiner(double promien){
		double rezultat;
		rezultat = getMasa()*promien*promien;
		return rezultat;
	}
	public String toString(){
		String tmp;
		tmp = "Punkt Materialny o masie: "+ this.getMasa()+". Moment Bezw³adnoœci punktu wynosi: "
				+this.obliczGlownyMomentBezwladnosci()+". Moment bezw³adnoœci punktu wzgledem nowej osi: "
				+this.obliczMomentBezwladnosciSteiner(10);
		return tmp;
	}
}
