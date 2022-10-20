import java.math.*;
public class App {
    public static void main(String[] args) throws Exception {
        double input = 1;
        
        
        while( firstEq(input) > secondEq(input) ){
            input++;
        }
        
        String out = String.format("Input: %f, Radix: %f, Standard: %f", input, 
        firstEq(input), secondEq(input));
        System.out.println(out);
    }

    /**
     * radix
     * @param in
     * @return
     */
    public static double firstEq(double in){
        double b = 10;
        double k = 500000000;

        return Math.log10(k) * (in + b);
    }

    public static double secondEq(double in){
        
        return in * (Math.log(in)/Math.log(2.0));
    }

}
