package dsaWithJava.functions.Strings;

public class StringBuildr {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println("Time Complexity : 0(N2)");
        System.out.println(series);

        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println("Time Complexity : 0(N)");
        System.out.println(builder);

    }




}
