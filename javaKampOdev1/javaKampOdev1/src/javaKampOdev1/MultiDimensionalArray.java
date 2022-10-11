package javaKampOdev1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Edirne";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Rize";
		sehirler[2][1] = "Trabzon";
		sehirler[2][2] = "Artvin";

		for (int i = 0; i < 3; i++) {
			System.out.println("--------------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
