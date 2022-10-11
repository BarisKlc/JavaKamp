package javaKampOdev1;

public class EnBuyukSayiHangisi {

	public static void main(String[] args) {
		
		int sayi1 = 54;
		int sayi2 = 3;
		int sayi3 = 41;
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println(sayi1 + " en büyüktür");
		}else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println(sayi2 + " en büyüktür");
		}else if (sayi3>sayi1 && sayi3>sayi2) {
			System.out.println(sayi3 + " en büyüktür");
		}

	}

}
