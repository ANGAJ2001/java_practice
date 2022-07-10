public class insertionsort {
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,2,1};
        for(int i = 1;i<arr.length;i++)// unsorted part
        {
            int current = arr[i];// current element in unsorted part
            int j = i-1;// last position of sorted part
            while(j>=0 && current<arr[j]) // as long as j greater than zero and current element is less than element at jth postition
            {
                arr[j+1] = arr[j]; // we allocate place for current element by replacing jth element at j+1 position
                j--;
            }
            // we finally place current element at j
            arr[j+1] = current;
        }
        printArray(arr);
    }
    
}
