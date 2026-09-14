import java.util.Scanner;

public class perulangan3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean loop = true;
    String passDefault = "1234";

    while (loop) {
      System.out.print("Masukkan password: ");
      String passInput = sc.nextLine();
      
      if (passInput.equals(passDefault)) {
        System.out.println("Password benar!");
        loop = false;
      } else {
        System.out.println("Password salah!");
      }
    }

    sc.close();
  }
}
