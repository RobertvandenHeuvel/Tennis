import java.util.Random;

public class Tennis {		
	public static void main (String... args){
		TennisRacket racket1 = new TennisRacket();
		TennisRacket racket2 = new TennisRacket();
		racket1.brand = "Wilson";
		racket1.headSize = 645;
		racket1.weight = 300;
		racket1.serveBoost = 160;
		racket1.describe();
		racket1.serve();
		
//		racket2.describe();
		racket2.serveBoost = 120;
		racket2.serve();
	}
}

class TennisRacket{
	boolean kapot = false;
	String brand;
	int headSize;
	int weight;
	int serveBoost;
	void describe() {
		System.out.println("Je racket is een " + brand + " van " + headSize + "cm^2 en "+ weight + " gram.");
	}
	TennisRacket serve() {
		TennisRacket kapotteRacket = new TennisRacket();
		TennisRacket heleRacket = new TennisRacket();
		kapotteRacket.kapot = true;
		Random random = new Random();
		int serveSpeed = serveBoost + random.nextInt(40);
		System.out.println("Je serveert " + serveSpeed + "km/u met dit racket.");
		if (serveSpeed > 180) {
			System.out.println("Je racket is kapot.");
			return kapotteRacket;
		}
		else {
			return heleRacket;
		}
	}
}