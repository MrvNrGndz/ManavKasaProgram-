package patikaOrnekler;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Double armut, elma, domates, muz, patlican;
		double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
		double tutar1, tutar2, tutar3, tutar4, tutar5, toplamTutar;
		Scanner enter = new Scanner(System.in);
		System.out.print("ka� kg armut ald�n�z? ");
		armut = enter.nextDouble();
		tutar1 = armut * armutFiyat;
		System.out.print("ka� kg elma ald�n�z? ");
		elma = enter.nextDouble();
		tutar2 = elma * elmaFiyat;
		System.out.print("ka� kg domates ald�n�z? ");
		domates = enter.nextDouble();
		tutar3 = domates * domatesFiyat;
		System.out.print("ka� kg muz ald�n�z? ");
		muz = enter.nextDouble();
		tutar4 = muz * muzFiyat;
		System.out.print("ka� kg patl�can ald�n�z? ");
		patlican = enter.nextDouble();
		tutar5 = patlican * patlicanFiyat;
		toplamTutar = tutar1 + tutar2 + tutar3 + tutar4 + tutar5;
		System.out.print("Toplam kasa tutar�: " + toplamTutar);

	}

}
