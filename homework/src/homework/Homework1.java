package homework;

import java.util.Random;

public class Homework1 {

	public static void main(String[] args) {
		int kolonSayisi = 8;
		int[] loto = new int[6];
		Random random = new Random();

		for (int i = 0; i < kolonSayisi; i++) {
			System.out.print(i + 1 + ". Kolon = ");
			for (int j = 0; j < loto.length; j++) {
				int sayi = 1 + random.nextInt(49);
				for (int x = 0; x < j; x++) {
					if (loto[x] == sayi) {
						sayi = 1 + random.nextInt(49);
					}
				}
				loto[j] = sayi;
				
			}
			
				
			int tutucu;
			
			for(int k = 0; k < loto.length;k++) {
				for(int b=k+1; b<loto.length;b++) {
					if(loto[k]<loto[b]) {
						tutucu=loto[k];
						loto[k]=loto[b];
						loto[b]=tutucu;
					}
					
				}System.out.print(loto[k]+" ");
			}
			System.out.println();
		}
	}

}
