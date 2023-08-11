package dsaWithJava.functions.Strings;

public class StringComparison {
    public static void main(String[] args) {

        String name = "Taher";
        String a = "Taher";

        System.out.println(name);
        System.out.println(name == a);

        String name1 = new String("Taher");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name.charAt(0));


    }


}
