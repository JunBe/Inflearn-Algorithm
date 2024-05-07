package section1;

public class Test {
    public static void main(String[] args) {
//        String str1 = "Fu";
//        String hexString = Integer.toHexString(System.identityHashCode(str1));
//        System.out.println(hexString);
//        str1 = "ck";
//        hexString = Integer.toHexString(System.identityHashCode(str1));
//        System.out.println(hexString);
//
//        String str = "i am     student";
//        String[] string=str.split(" ");
//        for (String s : string) {
//            System.out.print(s+"와");
//        }
        String str = "\"Hello, \"My\" World\"";
        String newStr = str.replaceAll("^\"", "");
        System.out.println(newStr);

    }
}
