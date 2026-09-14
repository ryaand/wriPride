public class beep {
  public static void main(String[] args) {
    for (int i = 0, j = 5; i <= 5 && j >= 0 ; i++, j--) {
      System.out.println(" ".repeat(j) + "*".repeat(i) + "*".repeat(i) + " ".repeat(j));
    }
    for (int i = 0, j = 5; i <= 5 && j >= 0 ; i++, j--) {
      System.out.println(" ".repeat(i) + "*".repeat(j) + "*".repeat(j) + " ".repeat(i));
    }
  }
}
