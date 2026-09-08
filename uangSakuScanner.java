import java.util.Scanner;

public class uangSakuScanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nominal uang saku: ");
    int uangSaku = sc.nextInt();
    
    if (uangSaku >= 15000) {
      System.out.println("Makan ayam geprek + es teh");
    } else if (uangSaku >= 5000) {
      System.out.println("Makan gorengan + kopi saset");
    } else {
      System.out.println("Makan promag + air putih");
    }
    sc.close();
  }
}
