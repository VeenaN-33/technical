import java.util.*;
public class tues {
    public static void main(String[] args) {
        
    

 int[] []arr2 = new int[4][6];
 arr2[1][1]=78;
 arr2[1][2]=12;//2d array
 arr2[1][3]=10;
 arr2[2][1]=30;
 arr2[2][2]=34;
 arr2[2][3]=11;
 arr2[3][1]=21;
 arr2[3][2]=10;
 arr2[3][3]=32;

 System.out.println(arr2[1][3]);
 System.out.println(arr2[2][3]);
 System.out.println(arr2.length);
 System.out.println(arr2[0].length);
 for(int i=0;i<=arr2.length;i++)
 for(int j=0;j<=arr2.length;j++){
System.out.println(arr2[i][j]);
 }
}


}