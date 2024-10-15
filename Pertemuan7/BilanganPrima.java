package Pertemuan7;

public class BilanganPrima {
    public static void main(String[] args) {
        // Menggunakan perulangan for untuk bilangan prima
        System.out.println("Bilangan prima dari 0 hingga 20 (menggunakan for):");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Menggunakan perulangan while untuk bilangan bukan prima
        System.out.println("Bilangan bukan prima dari 0 hingga 20 (menggunakan while):");
        int j = 0;
        while (j <= 20) {
            if (!isPrime(j)) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        // Menggunakan perulangan do-while untuk bilangan prima
        System.out.println("Bilangan prima dari 0 hingga 20 (menggunakan do-while):");
        int k = 0;
        do {
            if (isPrime(k)) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 20);
        System.out.println();
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}