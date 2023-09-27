package Lista;

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
}