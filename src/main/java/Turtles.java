/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static int factorialR(int num){
        return (num == 1) ? 1 : num * factorialR(num-1);
    }

    public static int factorial(int num){
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans*=i;
        }
        return ans;
    }


    public static int gcdR(int larger, int smaller) {
        return (smaller == 0) ? larger : gcdR(smaller, larger % smaller);
    }

    public static int gcd(int larger, int smaller) {
        for (int i = smaller; i > 1 ; i--) {
            if(larger % i == 0 && smaller % i == 0){
                return i;
            }
        }
        return 1;
    }
}
