import java.util.Scanner;

public class GraphInput {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int nodes[][] = new int[n][n];

    // taking input 
    int e = sc.nextInt();

    for(int i = 0; i < e; i++)
    {
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        nodes[v1][v2] = 1;
        nodes[v2][v1] = 1;
    }

    // printing array
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            System.out.print(nodes[i][j]+ " ");
        }
        System.out.println();
    }

    sc.close();

}
}