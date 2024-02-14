import java.util.*;;
public class mon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int si=0;si<n;si++){
        for(int ei=0;ei<n-1;ei++){
          for(int k=0;k<si;k++){
            System.out.println(arr[k]+"");
          }  
          System.out.println();
        }
    }
    }
}
