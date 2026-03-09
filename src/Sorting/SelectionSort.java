package Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={4,5,9,3,7,6,2};

        for(int i=0;i<arr.length-1;i++){
            int smallest = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest= j;
//                    for(int x=0;x<arr.length;x++){
//                        System.out.print(arr[x]+" ");
//                    }
                    System.out.println(j);
                }
//                swap
                int temp = arr[smallest];
                arr[smallest]=arr[j];
                arr[j]=temp;
            }
            System.out.println("------------------------");

        }

    }
}
