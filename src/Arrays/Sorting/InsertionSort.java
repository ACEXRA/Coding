package Arrays.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,7,4,8,3,1,6,9,5};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

