import java.util.Scanner;

public class perpustakaan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=== DAFTAR BUKU ===");
    String[] daftarBuku = { "Laskar Pelangi", "Bumi Manusia", "Fillosofi Teras", "One Piece" };
    boolean[] statusBuku = { true, false, true, true };
    String status = "";
    int jumlahBuku = 0;

    for (int i = 0; i < statusBuku.length; i++) {
      if (statusBuku[i] == true) {
        status = " - Bisa dipinjam";
        jumlahBuku++;
      } else {
        status = " - Sedang dipinjam orang lain";
      }
      System.out.println((i + 1) + ". " + daftarBuku[i] + status);
    }

    System.out.println("\nJumlah buku yang bisa dipinjam: " + jumlahBuku);

    System.out.print("\nMasukkan nomor buku yang mau dipinjam: ");
    int angkaInput = sc.nextInt();
    System.out.println("Buku yang dipiliuh: " + daftarBuku[angkaInput - 1]);
    if (statusBuku[angkaInput - 1] == true) {
      status = "Bisa dipinjam";
    } else {
      status = "Sedang dipinjam orang lain";
    }
    System.out.println("Status: " + status);
    sc.close();
  }
}
