class Sorting {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) { 
            for (int j = 1; j < (n - i); j++) { 
                if (arr[j - 1] > arr[j]) { 
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
        System.out.print("Bubble Sorted Array: ");
        printArray(arr);
    }
    static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.print("Selection Sorted Array: ");
        printArray(arr);
    }

    static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.print("Insertion Sorted Array: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = { 5,4,2,8,9,1,3,7,6 };
        System.out.print("Orignal Array: ");
        printArray(arr);
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}