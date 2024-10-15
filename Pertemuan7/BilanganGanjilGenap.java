package Pertemuan7;

class BilanganGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil dari 0 hingga 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan genap dari 0 hingga 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}