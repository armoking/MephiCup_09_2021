import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    int find(int [][] a, int i, int n, int mask) {
        int result = 0;
        for (int j = 0; j < n; j++) {
            if (((mask >> j) & 1) == 0) {
                mask ^= 1 << j;
                result = Math.max(result, find(a, i + 1, n, mask) + a[i][j]);
                mask ^= 1 << j;
            }
        }
        return result;
    }

    void solve() throws IOException {
        int n = readInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = readInt();
            }
        }

        out.println(find(a, 0, n, 0));
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
