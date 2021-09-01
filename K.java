import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        int n = readInt();
        int x1 = readInt(), y1 = readInt();
        int x2 = readInt(), y2 = readInt();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (Math.abs(x - x1) + Math.abs(y - y1) == Math.abs(x - x2) + Math.abs(y - y2)) {
                    out.print(x + " " + y + "\n");
                }
            }
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
