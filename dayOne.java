public class dayOne {
  public static void main(String[] args) {
    int hargaNasiGoreng = 12000;
    int jumlahPorsi = 2;
    int hargaEsTeh = 3500;
    double diskon = 0.1;

    int totalNasiGoreng = hargaNasiGoreng * jumlahPorsi;
    System.err.println("Total nasi goreng: " + totalNasiGoreng);

    int totalDgnTeh = totalNasiGoreng;
    totalDgnTeh += hargaEsTeh;
    System.err.println("Harga total dengan es teh: " + totalDgnTeh);

    double hargaDgnDiskon = totalDgnTeh;
    hargaDgnDiskon *= diskon;
    double totalHargaDenganDiskon = totalDgnTeh - hargaDgnDiskon;
    System.err.println("Harga dengan diskon 10%: " + totalHargaDenganDiskon);

    int hargaDgnDiskonInt = (int) totalHargaDenganDiskon;
    System.err.println("Harga dengan diskon 10% (int): " + hargaDgnDiskonInt);
  }
}