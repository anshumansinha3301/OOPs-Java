public class MathClassDemo {
    public static void main(String[] args) {
        System.out.println("Math.abs(-25) = " + Math.abs(-25));
        System.out.println("Math.pow(2,3) = " + Math.pow(2,3));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        System.out.println("Math.max(10,20) = " + Math.max(10,20));
        System.out.println("Math.floor(5.2) = " + Math.floor(5.2));
        System.out.println("Math.round(5.5) = " + Math.round(5.5));
        System.out.println("Math.random() * 5 = " + (Math.random() * 5));

        // Trigonometric functions (angles should be in radians)
        System.out.println("Math.sin(Math.PI/3) = " + Math.sin(Math.PI/3));      // sin(60°)
        System.out.println("Math.cos(Math.PI/3) = " + Math.cos(Math.PI/3));      // cos(60°)
        System.out.println("Math.tan(Math.PI/3) = " + Math.tan(Math.PI/3));      // tan(60°)
        System.out.println("Math.asin(0.5) = " + Math.asin(0.5));                // arc sine, returns radians
        System.out.println("Math.acos(0.5) = " + Math.acos(0.5));                // arc cosine, radians
        System.out.println("Math.atan(1.0) = " + Math.atan(1.0));                // arc tangent, radians
        System.out.println("Math.atan2(1.0,1.0) = " + Math.atan2(1.0,1.0));      // atan2(y,x)

        // Exponential functions
        System.out.println("Math.exp(1) = " + Math.exp(1));                      // e^1
        System.out.println("Math.exp(2) = " + Math.exp(2));                      // e^2

        // Logarithmic functions
        System.out.println("Math.log(10) = " + Math.log(10));                    // Natural log (base e)
        System.out.println("Math.log10(10) = " + Math.log10(10));                // Log base 10
        System.out.println("Math.log1p(9) = " + Math.log1p(9));                  // log(1+9) base e
    }
}
