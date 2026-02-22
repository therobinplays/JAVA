import java.util.Scanner;

public class Diagonal {
    public static void main(String args[]){

        int [][] a=new int [3][3];

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the no of rows:");
        int rows=input.nextInt();

        System.out.println("enter the no of columns:");
        int cols=input.nextInt();
        int sum=0;

        for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               System.out.print("a["+i+"]["+j+"]:");
               a[i][j]=input.nextInt();
            }
            
        }
        for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
            if(i==j){
                sum=sum+a[i][j];
            }
           }
    }
    System.out.println("the sum of diagonal" + sum);
}
}