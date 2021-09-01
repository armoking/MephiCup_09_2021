import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    void solve() throws IOException {
        int n = readInt();
        char[][] arr = new char[n][];
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = readString().toCharArray();
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'I') {
                    x = i;
                    y = j;
                }
            }
        }

        int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        int[][] mask = new int[n][n];
        int dir = 0;

        while (true) {
            if (((mask[x][y] >> dir) & 1) == 1) {
                out.println("LOOP");
                return;
            }
            mask[x][y] |= 1 << dir;
            int nx = x + directions[dir][0];
            int ny = y + directions[dir][1];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                String result = "";
                if (nx < 0) {
                    result = "OUT MINUS_Y";
                } else if (nx >= n) {
                    result = "OUT PLUS_Y";
                } else if (ny >= n) {
                    result = "OUT PLUS_X";
                } else {
                    result = "OUT MINUS_X";
                }
                out.println(result);
                return;
            } else if (arr[nx][ny] == 'X') {
                dir = (dir + 1) & 3;
            }
            x = nx;
            y = ny;
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
