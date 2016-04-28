package modDemo;

public class Main {
	public void runMod() {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 1) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.runMod();
	}
}
