public class uangSakuBertingkat {
  public static void main(String[] args) {
    int uangSaku = 20000;
    
    if (uangSaku >= 15000) {
      System.out.println("Makan ayam geprek + es teh");
    } else if (uangSaku >= 5000) {
      System.out.println("Makan gorengan + kopi saset");
    } else {
      System.out.println("Makan promag + air putih");
    }
  }
}
