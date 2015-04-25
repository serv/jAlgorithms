package main.sort;

public class Sort {
    public static boolean isSorted(int[] a) {
        if (a.length < 2) {
            return true;
        }
        
        for(int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
    
    public static int[] insertion(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {   
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
