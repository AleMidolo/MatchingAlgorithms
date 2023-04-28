package algorithms.bubbleSort;

public class IterativeBubbleSort {
    void iterativeBubbleSort(int list[], int length) {
        int length = list.length;
        for(int index=0; index < length; index++) {  
            for(int j=1; j < length-index; j++) {  
                if(list[j-1] > list[j]){
                   int swap = list[j-1];  
                   list[j-1] = list[j];  
                   list[j] = swap;  
               } 
           } 
       }
    }

    void iterativeBubbleSort2(int list[], int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < list[j + 1]; j++) {
                int swap = list[j];
                list[j] = list[j + 1];
                list[j + 1] = swap;
            }
        }
    }
}
