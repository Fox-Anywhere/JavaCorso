public class Main {
    public static void main(String[] args) {
        
        boolean x = 3 < 10  && 3 % 2 == 0;
        boolean y = 3 > 10 || 16 % 2 == 0;

        System.out.println(x);  //AND
        System.out.println(y);  //OR
        System.out.println(!x); //NOT
    }
}
