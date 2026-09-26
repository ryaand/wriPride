import java.util.Scanner;

public class array2d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[][] bebas = new String[3][3];

    for (int i = 0; i < bebas.length; i++) {
      System.out.println("Data anak ke-" + (i + 1));
      for (int j = 0; j < bebas[i].length; j++) {
        if (j == 0) {
          System.out.print("Masukkan nama: ");
          String nama = sc.nextLine();
          bebas[i][0] = nama;
        } else if (j == 1) {
          System.out.print("Masukkan prodi: ");
          String prodi = sc.nextLine();
          bebas[i][1] = prodi;
        } else {
          System.out.print("Masukkan hobi: ");
          String hobi = sc.nextLine();
          bebas[i][2] = hobi;
        }
      }
      System.out.println("");
    }

    for (int i = 0; i < bebas.length; i++) {
      for (int j = 0; j < bebas[0].length; j++) {
        if (j == 0) {
          System.out.print("Nama: " + bebas[i][0] + " --- ");
        } else if (j == 1) {
          System.out.print("Prodi: " + bebas[i][1] + " ---");
        } else {
          System.err.print("Hobi: " + bebas[i][2]);
        }
      }
      System.out.println("");
    }

    sc.close();
  }
}
