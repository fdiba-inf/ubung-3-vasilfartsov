package exercise3;

public class NumberSearch {

  public static void main(String[] args) {

    int count = 0;
    for (int a = 100; a <= 1000; a++) {
      if (a % 5 == 0 && a % 6 == 0) {
        System.out.print(a);
        count++;
        if (count == 10) {
          System.out.println();
          count = 0;
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}