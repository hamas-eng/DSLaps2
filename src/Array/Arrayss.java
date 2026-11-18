package Array;

import java.util.Scanner;

public class Arrayss {
    Scanner scan=new Scanner(System.in);


    public void traversal(int[]a){
        for(int i=0;i<a.length;i++)
            System.out.println("index["+i+"]="+a[i]);

        }
   public void reverse_traversal(int[]a){
            for(int i=a.length-1;i>=0;i--){
                System.out.println("index["+i+"]="+a[i]);
            }
        }
      public void input(int []a) {
          for (int i = 0; i < a.length; i++) {
              a[i] = scan.nextInt();
          }
      }

          public void update(int[]a , int index , int new_value){
        if(index <0 || index >=a.length){
            System.out.println("index is not found");
        }else {
            a[index] = new_value;
        }

      }
     public void delet(int[]a, int index){
         if(index <0 || index >=a.length){
             System.out.println("element not deleted");
         }else {
             a[index] = 0;
         }


     }
public  int liner_serch(int[] a,int svalue) {

for(int i=0; i<a.length ;i++){
    if(svalue==a[i])
        return i;
}
return -1;
}



}
