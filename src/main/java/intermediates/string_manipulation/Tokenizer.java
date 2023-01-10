package intermediates.string_manipulation;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String data = "1;Myke;8";

        StringTokenizer st = new StringTokenizer(data, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
