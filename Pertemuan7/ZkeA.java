package Pertemuan7;

class ZkeA {
    public static void main(String[] args) {
        // Menggunakan perulangan for
        System.out.println("Huruf dari Z hingga A (menggunakan for):");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Menggunakan perulangan while
        System.out.println("Huruf dari Z hingga A (menggunakan while):");
        char c1 = 'Z';
        while (c1 >= 'A') {
            System.out.print(c1 + " ");
            c1--;
        }
        System.out.println();

        // Menggunakan perulangan do-while
        System.out.println("Huruf dari Z hingga A (menggunakan do-while):");
        char c2 = 'Z';
        do {
            System.out.print(c2 + " ");
            c2--;
        } while (c2 >= 'A');
        System.out.println();
    }
}