import java.util.HashMap;
class day3prg4 {
    static void removeDups(int[] a, int n)
    {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (mp.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {23,43,54,23,78};
        int n = arr.length;
        removeDups(arr, n);
    }
}