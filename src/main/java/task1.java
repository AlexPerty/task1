import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Perty on 08-Nov-18.
 */
public class task1 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    System.out.println("Arithmetic mean - " + arithMean(a, b, c));
    if ( a <= 0 || b <=0 || c <= 0 ) {
      System.out.println("incorrect value for geometric mean");
    }
    else
      System.out.println("Geometric mean - " + geomMean(a, b, c));
  }

  private static double arithMean (int a, int b, int c){
    return (a + b + c) / 3.0;
  }

  private static double geomMean (int a, int b, int c){
    double sum = a * b * c;
    return Math.cbrt(sum);
  }
}
