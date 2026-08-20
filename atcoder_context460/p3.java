import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        // Fast I/O configuration
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tInput = br.readLine();
        if (tInput == null || tInput.trim().isEmpty()) {
            return;
        }
        int T = Integer.parseInt(tInput.trim());
        StringBuilder sb = new StringBuilder();
        while (T > 0) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue;
            // Read coordinate and radius values
            long X1 = Long.parseLong(st.nextToken());
            long Y1 = Long.parseLong(st.nextToken());
            long R1 = Long.parseLong(st.nextToken());
            long X2 = Long.parseLong(st.nextToken());
            long Y2 = Long.parseLong(st.nextToken());
            long R2 = Long.parseLong(st.nextToken());
            

            // Calculate squared distance and radius boundaries
            long d_sq = (X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2);
            long min_r_sq = (R1 - R2) * (R1 - R2);
            long max_r_sq = (R1 + R2) * (R1 + R2);
            
            // Check intersection condition
            if (d_sq >= min_r_sq && d_sq <= max_r_sq) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
            
            T--;
        }
        
        // Fast output printing
        System.out.print(sb);
    }
}
