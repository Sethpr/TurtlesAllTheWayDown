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
}
