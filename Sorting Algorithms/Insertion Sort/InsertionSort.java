/*https://cdn.programiz.com/sites/tutorial2program/files/Insertion-sort-2_2.png */

public class InsertionSort{
    public static void sort(int[] a) {
        for(int i=1;i<a.length;i++){
            int key = a[i]; //we are picking up a key element starting from index 1 to n
            int j=i-1;

            //comapre key value with left part of the array until the key is greater
            while(j>=0 && key<a[j]){    
                a[j+1] = a[j];      //moving left part elements to 1 position right
                j--;
            }
            a[j+1]=key; // putting the key in the right position
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

BEST CASE       --      O(n)
AVERAGE CAE     --      O(n^2)
WORST CASE      --      O(n^2)

*/