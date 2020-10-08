public class SelectionSort{

    public static void sort(int a[]){
        /* We are going to find minimum element in the unsorted array and 
        place it in the order one-by-one*/ 
        for(int i=0;i<a.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<a.length;j++){
                
                if(a[j]<a[minIndex]){
                    minIndex = j;   //updating the min value
                }

            }
            /* Swapping min value with ith position*/
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

    }

    //DRIVER CODE
    public static void main(String args[]){
        int a[] = {2,9,1,3,12,6,4,10}; //passing sample array
        sort(a); //calling sort function
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}

/*
    TIME COMPLEXITY ANALYSIS
==================================

BEST CASE       --      O(n^2)
AVERAGE CAE     --      O(n^2)
WORST CASE      --      O(n^2)

*/