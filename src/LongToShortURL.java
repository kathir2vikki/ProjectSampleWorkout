public class LongToShortURL {
    static String allowedString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static String moduloInt(int n) {

        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuffer sb = new StringBuffer();

        while (n > 0) {
            sb.append(map[n % 62]);
            System.out.println("map index value " + n % 62);
            System.out.println("StringBuffer value " + sb.toString());
            n = n / 62;
            System.out.println("N value " + n);

            System.out.println("reverse the string buffer " + sb.toString());


        }
        return sb.reverse().toString();
    }

    static int intToShortenUrl(String tinUrl) {
        int id = 0;
     /*   for (int c = 0; c < tinUrl.length(); c++) {
            if ('a' <= tinUrl.charAt(c) && tinUrl.charAt(c) <= 'z' ) {
                id = id * 62 + tinUrl.charAt(c) - 'a';
                System.out.println("1st condition ==== id====" + id);
            }
            if ('A' <= tinUrl.charAt(c) && tinUrl.charAt(c) <= 'Z') {
                id = id * 62 + tinUrl.charAt(c) - 'A' + 26;
                System.out.println("2st condition ==== id====" + id);
            }
            if ('0' <= tinUrl.charAt(c) && tinUrl.charAt(c) <= '9' ) {
                id = id * 62 + tinUrl.charAt(c) - '0' + 52;
                System.out.println("3st condition ==== id====" + id);
            }*/
            int counter = 1;
            for (int c = 0; c < tinUrl.length(); c++) {

                id +=  allowedString.indexOf(tinUrl.charAt(c)) * Math.pow(62 ,tinUrl.length()-counter);
                counter++;
        }
        System.out.println("id====" + id);
        return id;
    }


    public static void main(String[] a) {
        String tinyURLS = moduloInt(12345);

        System.out.println("TinyUrl ====== " + tinyURLS);
        System.out.println("intto short url ===" +intToShortenUrl(tinyURLS));

    }
}
