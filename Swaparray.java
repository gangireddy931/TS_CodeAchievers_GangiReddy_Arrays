package Work;

public class Swaparray 
{
     public static void main(String []args)
     {
        int [] arr={0,1,2,3,4,5,6,7};
         Swaparray.displayArray(arr);
         for(int i=1;i<arr.length;i++)
         {
         while(arr[i]%2!=0)
         {
        int tmp = arr[i - 1];
        arr[i - 1] = arr[i];
        arr[i] = tmp;
        }
        }
        Swaparray.displayArray(arr);
                     }
   static void displayArray(int[]arr)
   {
       System.out.print("Array elements are: ");
       for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i]+" "); }
       System.out.println();
       }
}