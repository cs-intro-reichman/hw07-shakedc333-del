public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }


    private static boolean isSorted(int[] a, int i) {
    // Base case: no more pairs to compare
    if (i >= a.length - 1) {
        return true;
    }

    // Check current pair and recurse on the rest
    return (a[i] <= a[i + 1]) && isSorted(a, i + 1);
}

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2};
        System.out.println(isSorted(b)); // false
    }
}
