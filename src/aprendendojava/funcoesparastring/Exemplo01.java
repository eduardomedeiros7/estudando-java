package aprendendojava.funcoesparastring;

public class Exemplo01 {
    public static void main(String[] args) {

        String origin = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = origin.toLowerCase();
        String s02 = origin.toUpperCase();
        String s03 = origin.trim();
        String s04 = origin.substring(2);
        String s05 = origin.substring(2, 9);
        String s06 = origin.replace('a','x');
        String s07 = origin.replace("abc","xy");
        int i = origin.indexOf("bc");
        int j = origin.lastIndexOf("bc");

        System.out.println("Origin: " + origin);
        System.out.println("toLowerCase: - " + s01+ " - ");
        System.out.println("toUpperCase: - " + s02+ " - ");
        System.out.println("Trim: - " + s03+ " - ");
        System.out.println("substring(2): - " + s04 + "-");
        System.out.println("substring(2,9): - " + s05 + "-");
        System.out.println("replace('a','x'): - " + s06 + "-");
        System.out.println("replace('abc','xy'): - " + s07 + "-");
        System.out.println("index of 'bc':  " + i);
        System.out.println("Last index of 'bc':  " + j);


    }
}
