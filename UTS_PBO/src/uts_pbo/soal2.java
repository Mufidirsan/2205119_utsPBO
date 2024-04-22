package uts_pbo;

import java.util.Scanner;

public class soal2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int countPositif = 0;
        int countNegatif = 0;
        double total = 0.0;
        double rataRata = 0.0;

        System.out.print("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        int input = scanner.nextInt();

        while (input != 0) {
            if (input > 0) {
                countPositif++;
            } else if (input < 0) {
                countNegatif++;
            }

            total += input;
            input = scanner.nextInt();
        }

        rataRata = total / (countPositif + countNegatif);

        System.out.println("Jumlah bilangan positif adalah " + countPositif);
        System.out.println("Jumlah bilangan negatif adalah " + countNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata - rata " + String.format("%.2f",rataRata));
    }
}

