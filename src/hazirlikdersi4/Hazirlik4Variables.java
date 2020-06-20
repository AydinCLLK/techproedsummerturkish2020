package hazirlikdersi4;

public class Hazirlik4Variables 
{
	//static int sayi; // Default Value değer atanmaması.
	static int maas=4500;   // static motudun içinde kullanacağımız herşey static olmalı
	static char tekharf='A'; // char lara değer verirken tek tırnak içine koymamız lazım
	static char sembol='$';  // burda tanımladığımız typelere değer atamak zorunda değiliz.
	
	public static void main(String[] args) 
	{
		System.out.println(maas);    // Variable değerini ekrana yazdırmak için tırnak olmaz.
									// herhangibir değer olmadığı için ekrana sıfır yazdı.
		
		System.out.println(tekharf); // char ların default values su space (boşluk) olduğu için göremiyoruz
		System.out.println(sembol);
		
		int sayi=12;
		
		System.out.println(sayi);
		
	//	int sayi1=13;  // static void mainde yazıldığı zaman kesinlikle değer atamak lazım.
	//	int sayi2=14;
	//	int sayi3=15;
	//	int sayi4=16;
		
		int sayi1=13, sayi2=14, sayi3=15, sayi4=16;
		
		System.out.println(sayi1 + sayi2 + sayi3 + sayi4);
		System.out.println(sayi1*sayi2*sayi3*sayi4);
		System.out.println((sayi1+sayi2)*(sayi3+sayi4));
		
		
	}
	
	//Data
    //Variable
    //Variable olusturma
    //Variable a deger verme
    //Default Value
    //Variable'a deger verirken kisa yol
    //Variable kullanmanin sebebi
    //Variable'i main method icinde veya disinda olusturmanin farki

}
