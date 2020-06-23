package abstraction;
abstract class Instrument {
	abstract void play ();
}
class Piano extends Instrument {
	void play () {
		System.out.println("piano is playing tan tan tan");
	}
}
class Guitar extends Instrument {
	void play () {
		System.out.println("guitar is playing  tin tin tin");
	}
}
class Flute extends Instrument {
	void play() {
		System.out.println("fulte is playing took took took");
	}
}
public class TestInstrument {

	public static void main(String[] args) {
		Instrument [] inst = new Instrument[10]; // same as normal arrays
		for (int i = 0;i < 3;i++) {
			inst[i] = new Piano();
			inst[i].play();
		}
		for (int i = 3;i < 6;i++) {
			inst[i] = new Flute();
			inst[i].play();
		}
		for (int i = 6;i < 10;i++) {
			inst[i] = new Guitar();
			inst[i].play();
		}
		for (int i = 0;i < 10;i++) {
			if (inst[i] instanceof Piano) {
				System.out.println(i + " Piano object");
			}
			else if (inst[i] instanceof Guitar) {
				System.out.println(i + " Guitar object");
			}
			else {
				System.out.println(i + " Flute object");
			}
		}
		
	}

}
