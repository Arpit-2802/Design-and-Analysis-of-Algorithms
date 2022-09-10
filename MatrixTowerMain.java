import java.util.*;
public class MatrixTowerMain {
    public static void main(String[] args) {
        MatrixTower m=new MatrixTower();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=m.checkMatrix(n);
        if(ans==true)
           System.out.println("It is rising tower Matrix");
        else  
           System.out.println("It is not a rising tower Matrix");
    }
}
