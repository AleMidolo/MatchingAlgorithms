package algorithms.bubbleSort;

public class RecursiveBubbleSort {
    public static void recursiveBubblesort(int[] a,int n) {
        boolean sorted=true;
      //we are assuming that array is sorted
         
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                 
                sorted=false;
              //now array is not sorted
            }
          //if there are no swaps then we can
          //say that array is sorted.
             
        }
        if(sorted==false)
        {
            //recursively calling until it was sorted.
            bubbleSort(a,n);
        }
    }
}
