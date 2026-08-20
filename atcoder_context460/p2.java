import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        // Set up fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // Read N and M values
        String line1 = br.readLine();
        if (line1 == null) return;
        st = new StringTokenizer(line1);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());  
        // Read array A elements
        long[] A = new long[N];
        String line2 = br.readLine();
        if (line2 != null) {
            st = new StringTokenizer(line2);
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(st.nextToken());
            }
        }
        // Read array B elements
        long[] B = new long[M];
        String line3 = br.readLine();
        if (line3 != null) {
            st = new StringTokenizer(line3);
            for (int i = 0; i < M; i++) {
                B[i] = Long.parseLong(st.nextToken());
            }
        }   
        // Sort both arrays in ascending order
        Arrays.sort(A);
        Arrays.sort(B);
        int shari = 0;
        int neta = 0;
        int sushi_count = 0;
        
        // Two-pointer greedy matching approach
        while (shari < N && neta < M) {
            if (B[neta] <= 2 * A[shari]) {
                sushi_count++;
                shari++;
                neta++;
            } else {
                shari++;
            }
        }
        
        System.out.println(sushi_count);
    }
}
