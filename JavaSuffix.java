public class JavaSuffix {

    public static boolean hasSuffix(String str, String suffix) {
        if (str == null || suffix == null) {
            return false;
        }

        int strLength = str.length();
        int suffixLength = suffix.length();

        if (suffixLength > strLength) {
            return false;
        }

        String strSuffix = str.substring(strLength - suffixLength);

        return strSuffix.equals(suffix);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String suffix1 = "lo";
        System.out.println("String \"" + str1 + "\" ends with suffix \"" + suffix1 + "\": " + hasSuffix(str1, suffix1)); // true

        String str2 = "Hello";
        String suffix2 = "alp";
        System.out.println("String \"" + str2 + "\" ends with suffix \"" + suffix2 + "\": " + hasSuffix(str2, suffix2)); // false
    }
}
