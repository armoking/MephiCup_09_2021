import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        int x1 = readInt(), y1 = readInt();
        int x2 = readInt(), y2 = readInt();
        int l = readInt();
        for (int dx = 0; dx <= l; dx++) {
            int dy = (int)Math.sqrt(l * l - dx * dx);
            if (dx * dx + dy * dy != l * l) continue;
            for (int k1 : new int[]{-1, 1}) {
                for (int k2 : new int[]{-1, 1}) {
                    int nx1 = x1 + dx * k1;
                    int nx2 = x2 + dx * k1;
                    int ny1 = y1 + dy * k2;
                    int ny2 = y2 + dy * k2;
                    if (dx * k1 * (x1 - x2) + dy * k2 * (y1 - y2) == 0) {
                        out.println(nx1 + " " + ny1 + "\n" + nx2 + " " + ny2);
                        return;
                    }
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
