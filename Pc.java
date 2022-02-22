package override;

import overiding.Laptop;

public class Pc extends Laptop {

		public void getSystemInfo() {
			System.out.println("This is mac");
		}		

		public static void main(String[] args) {
			Pc wind = new Pc();
			wind.getSystemInfo();
		}
	}


