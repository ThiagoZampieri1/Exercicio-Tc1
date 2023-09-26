package Lista;

import java.util.Scanner; 

public class Main {

  public static int lampadas(int ia, int ib, int fa, int fb) {
  
  boolean a = (ia == 1);
  boolean b = (ib == 1);
  boolean finalA = (fa == 1);
  boolean finalB = (fb == 1);
  
  if (a == finalA && b == finalB) {
    return 0;
  }

  if (a != finalA && b != finalB) {
    return 1;
  }

  return a != finalA ? 1 : 2;
}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    scanner.close();
    int ia = numero / 1000;
    int ib = (numero % 1000) / 100;
    int fa = (numero % 100) / 10;
    int fb = numero % 10;
    int n = lampadas(ia, ib, fa, fb);

    System.out.println(n);
  }
}