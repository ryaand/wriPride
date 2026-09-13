import java.util.Scanner;

public class dayTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int menu, nilai;

    System.out.println("Menu\n");
    System.out.println("1. Cek Kelulusan");
    System.out.println("2. Cek Predikat Nilai\n");
    System.out.print("Pilih menu: ");
    menu = sc.nextInt();

    switch (menu) {
      case 1:
        System.out.print("Masukkan nilai Anda (0-100): ");
        nilai = sc.nextInt();
        System.out.println("\nNilai Anda: " + nilai);
        if (nilai >= 60) {
          System.out.println("Selamat, Anda dinyatakan lulus!\n");
        } else {
          System.out.println("Maaf, Anda dinyatakan tidak lulus\n");
        }
        break;
      case 2:
        System.out.print("Masukkan nilai Anda (0-100): ");
        nilai = sc.nextInt();
        System.out.println("\nNilai Anda: " + nilai);
        if (nilai >= 85) {
          System.out.println("Predikat nilai Anda: A\n");
        } else if (nilai >= 75) {
          System.out.println("Predikat nilai Anda: B\n");
        } else if (nilai >= 65) {
          System.out.println("Predikat nilai Anda: C\n");
        } else {
          System.out.println("Predikat nilai Anda: D\n");
        }
        break;
      default:
        System.out.println("Menu tidak tersedia, mohon masukkan menu yang sesuai!");
    }
    sc.close();
  }
}
