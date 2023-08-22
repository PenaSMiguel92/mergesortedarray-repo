import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] array2 = new int[] { 1 };
        int[] array3 = new int[] { 0 };
        int[] array4 = new int[] { 3, 4, 5, 5, 0, 0 };

        sol.merge(array1, 3, new int[] { 2, 5, 6 }, 3);
        sol.merge(array2, 1, new int[] {}, 0);
        sol.merge(array3, 0, new int[] { 1 }, 1);
        sol.merge(array4, 4, new int[] { 2, 4 }, 2);
        
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
