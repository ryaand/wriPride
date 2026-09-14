import java.util.Scanner;

public class perulangan4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pilihan = 0;
    String nama = "";

    do {
      System.out.println("Pilihan menu");
      System.out.println("1. Input nama");
      System.out.println("2. Print nama");
      System.out.println("3. Exit");
      System.out.print("\nPilih menu: ");
      pilihan = sc.nextInt();
      sc.nextLine();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan nama: ");
          nama = sc.nextLine();
          break;
        case 2:
          System.out.print(nama);
          break;
        case 3:
          System.exit(3);
          break;
        default:
          System.out.println("Tidak ada pilihan!");
          break;
      }
    } while (pilihan != 0);
  }
}
