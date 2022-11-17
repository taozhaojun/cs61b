/** Class that prints the Collatz sequence starting from a given number.
 *  @author zhaojun
 */
public class Collatz {
    public static int nextNumber(int n) {
        if (n  % 2==0) {
            return n/2;
        } else if (n  % 2==1 && n !=1) {
            return 3 * n + 1;
        }else
        	return 1;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

