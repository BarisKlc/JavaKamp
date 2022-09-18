package javaKampOdev1;

public class Arrays {

	public static void main(String[] args) {
		//Diziler
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Barış";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		//Sık kullanılan yöntem
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
		}
		
	}

}
