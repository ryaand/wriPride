public class dayFour {
  public static void main(String[] args) {
    // int[] nilaiSiswa = {75, 88, 60, 92, 45};

    // nilaiSiswa.length =+ 1;




    
    int banyakNilai = 5;
    int[] nilaiSiswa = new int[banyakNilai];

    nilaiSiswa[0] = 75;
    nilaiSiswa[1] = 88;
    nilaiSiswa[2] = 60;
    nilaiSiswa[3] = 92;
    nilaiSiswa[4] = 45;
    // banyakNilai += 1;
    // nilaiSiswa[5] = 80;
    for (int i = 0; i < nilaiSiswa.length; i++) {
      System.out.println(nilaiSiswa[i]);
    }
  }
}
