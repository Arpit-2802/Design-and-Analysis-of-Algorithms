import java.util.*;
public class MatrixTowerMain {
    public static void main(String[] args) {
        //MatrixTower m=new MatrixTower();
        System.out.println("ENTER THE NUMBER OF TOWERS");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList< ArrayList< Integer > > towers = new ArrayList< ArrayList< Integer > >(n);
        System.out.println("Enter 1 to Input User Matrix and 2 for random Matrix");
        int choice=sc.nextInt();
        if(choice==1)
           towers=MatrixTower.userInputMatrix(n);
        else if(choice==2)
           towers=MatrixTower.RandomInputMatrix(n);
        
           for(int i = 10; i > -1; i--) {  // Initialize i as the top floor
            for(int j = 0; j < towers.size(); j++) {    // Check all the towers for the floor
                try {
                    System.out.print(towers.get(j).get(i)); // If it exists, print it
                }
                catch(Exception e) {
                    System.out.print(" ");      // Else print a black
                }
                finally {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }


        boolean ans=MatrixTower.checkMatrix(towers);
        if(ans==true)
           System.out.println("It is a rising Tower Matrix");
        else
           System.out.println("It is not a rising Tower Matrix");
        
    }
}
