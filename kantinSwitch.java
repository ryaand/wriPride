public class kantinSwitch {
  public static void main(String[] args) {
    int pesanan;
    pesanan = 2;

    switch (pesanan) {
      case 1:
        System.out.println("Risol mayo");
        break;
        case 2:
          System.out.println("Sosis solo");
          break;
        case 3:
          System.out.println("Donat meses");
          break;
        case 4:
          System.out.println("Roti bakar");
          break;
        default:
        System.out.println("Menu tidak tersedia");
    }
  }
}
