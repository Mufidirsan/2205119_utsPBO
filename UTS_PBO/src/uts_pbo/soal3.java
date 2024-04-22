package uts_pbo;

import java.util.Scanner;

public class soal3 {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();

        int digitCount = sumDigits(number);
        System.out.println("Jumlah digit dalam " + number + " adalah " + digitCount);
    }
}
