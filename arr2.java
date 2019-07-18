package Tasks09;

public class Problem2 {
    public static void main(String[] args) {
        int big=0,total=0,row=0;
        int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {1,9,6} };
        for(int i=0;i<arr.length;i++)
        {
            total=0;
            for(int j=0;j<arr[i].length;j++)
            {
                total=total+arr[i][j];

            }
            if(total>big) {
                big = total;
                row=i;
            }

        }
        System.out.println(row+". row "+big);
    }
}
