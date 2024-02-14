import java.util.ArrayList;
import java.util.Scanner;//array list

public class wed {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(87);
        list.add(90);
        System.out.println(list);
    }
        public static void RemoveEven(ArrayList<Integer>list){
    for(int i=list.size()-1;i>=0;i--){
        if(list.get(i)%2==0){
            list.remove(i);
        }
    
} 
    


}
}