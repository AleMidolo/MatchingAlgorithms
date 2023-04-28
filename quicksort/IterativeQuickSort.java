package algorithms.quicksort;

public class IterativeQuickSort {

    void quicksortIterativeArray(int arr[], int l, int h) {
        int[] stack = new int[h - l + 1];
        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while (top >= 0) {

            h = stack[top--];
            l = stack[top--];

            int p = partition(arr, l, h);

            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }

    void quicksortIterativeStack(int[] a) {
        Stack<Pair> stack = new Stack<>();
        int start = 0;
        int end = a.length - 1;
        stack.push(new Pair(start, end));

        while (!stack.empty()) {

            start = stack.peek().getX();
            end = stack.peek().getY();
            stack.pop();

            int pivot = partition(a, start, end);
            
            if (pivot - 1 > start) {
                stack.push(new Pair(start, pivot - 1));
            }

            if (pivot + 1 < end) {
                stack.push(new Pair(pivot + 1, end));
            }
        }
    }

    int partitionIterativeQS(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
