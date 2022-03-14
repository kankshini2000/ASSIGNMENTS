import java.util.Scanner;
class newerror  {
    public static void solve() throws UnsupportedOperationException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("enter numerator:");
            int num = scanner.nextInt();
            System.out.println("enter denominator");
            int dem = scanner.nextInt();
            if (dem == 0) {
                throw new UnsupportedOperationException("Invalid operation for Division by Zero");
            }
            int result = num / dem;
            System.out.println("Division of nos is: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
public class assign4q2 {
	public static void main(String[] args) {
		newerror.solve();
	}
}
