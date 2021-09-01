import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        long n = readLong();
        out.println(Long.toBinaryString(n));
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
