import java.util.Scanner;

public class totalDiagonalLine {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
         int arr [][]= {
                 {3, -1, -2},
                 {1, 6, -1},
                 {2, 1, 0}
    };
         int total=0;
         for (int i=0;i<arr.length;i++){
             for (int j=0;j<arr.length;j++){
                 total+=arr[i][j];

             }
         }
        System.out.println("tong duong cheo chinh:"+total);

    }
}
