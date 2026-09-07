public class kantinKampus {
  public static void main(String[] args) {
    // Tipe data primitif, variable, dan aritmatika
    int hargaNasiGoreng = 12000;
    byte jumlahPorsi = 2;
    int hargaTotal = hargaNasiGoreng * jumlahPorsi;
    System.out.println("Harga total: " + hargaTotal);

    // Operasi assignment (menambah minum es teh)
    int totalDgnTeh = hargaTotal;
    totalDgnTeh += 5000;
    System.err.println("Total Nasgor + Es Teh: Rp" + totalDgnTeh);

    // Casting (mengubah int menjadi double)
    double totalBayar = (double) totalDgnTeh;
    System.err.println("Total harga (double): " + totalBayar);
  }
}
