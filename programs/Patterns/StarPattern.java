package dsaWithJava.functions.Patterns;

public class StarPattern {
    public static void main(String[] args) {

        pattern1(5);

    }


    
    static void pattern1(int n){
        for (int row = 1; row < n; row++) {
            // now for each row we will have columns
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
