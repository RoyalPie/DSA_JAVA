// dynamic arr
//class Array {
//    private int[] arr;
//    private int count;
//
//    public Array(int size){
//        arr = new int[size];
//    }
//
//    public void insert(){
//
//    }
//
//}
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.print("Initialize ");
        display(arr);

        for (int i = 0; i< arr.length; i++){
            arr[i] = i;
        }
        System.out.print("Adding ");
        display(arr);

        int index = 3;
        arr[index] = 455;
        System.out.print("Changed ");
        display(arr);

        int value = 455;
        for (int i = 0; i< arr.length; i++){
            if(arr[i]==value) {
                System.out.println("The value " + value + " is found at " + i);
                break;
            }

        }
    }

    private static void display(int[] intArray){
        System.out.print("Array : [");
        for(int i = 0; i< intArray.length; i++)
        {
            if(i>0) System.out.print(",");
            System.out.print(" "+intArray[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
}