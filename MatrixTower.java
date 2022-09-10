import java.util.*;
class MatrixTower{
    public boolean checkMatrix(int n)
    {
        boolean flag=true;
        int arr[][]=new int[n][n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix");
        Random rand = new Random();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=rand.nextInt(100);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j][i] > arr[j+1][i])
                {
                    continue;
                }
                else
                {
                    flag=false;
                }
            }
        }
        return flag;
    }
}