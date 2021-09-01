import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        int n = Integer.parseInt(in.readLine());
        while (n-- > 0) {
            String s = in.readLine();
            String[] data = s.split("&");
            if (data.length == 3) {
                String probablyNumber = data[2];
                try {
                    BigInteger number = new BigInteger(probablyNumber);
                    if (number.compareTo(BigInteger.ZERO) >= 0 && String.valueOf(number).equals(probablyNumber)) {
                        out.print(data[0] + ": " + data[1] + " [" + data[2] + "]\n");
                        continue;
                    }
                } catch (Exception ignored) {
                }
            }
            out.print("BAD\n");
        }
    }

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tokenizer;
    final String delimiter = " ";

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    String readString() throws IOException {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine(), delimiter);
        }
        if (tokenizer.hasMoreTokens()) {
            return tokenizer.nextToken();
        } else {
            return null;
        }
    }

    Main() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
}
