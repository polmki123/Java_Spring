package arraylist;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int total = 0;
        for( int i = 0, num = 1; i < arr.length; i++, num++){
            arr[i] = num;
        }
        for (int i = 0; i <arr.length; i++){
            total += arr[i];
        }

        System.out.println(total);

        double[] dArr = new double[5];
        dArr[0] = 1.1;

        System.arraycopy(arr, 0, arr2, 1, 3);
    }
}
