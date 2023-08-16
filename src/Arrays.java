public class Arrays {

    public static void armin(int[] array) {
       // int[] a = {14, 26, 7, 38, 34, 56};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
    }

    public static void armax() {
        int[] a = {14, 26, 7, 38, 34, 56};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
    }

    public static int indmin() {
        int[] index = {140, 26, 38, 34, 56};
        int min1 = index[0];
        int m1 = 0;
        for (int i = 1; i < index.length; i++) {
            if (index[i] < min1) {
                min1 = index[i];
                m1 = i;
            }
        }
        return min1;
    }

    public static void indmax() {
        int[] index = {14, 26, 73, 38, 34, 56};
        int max1 = index[0];
        int m2 = 0;
        for (int i = 1; i < index.length; i++) {
            if (index[i] > max1) {
                max1 = index[i];
                m2 = i;
            }
        }
    }

    public static void sum() {
        int[] sumas = {14, 26, 73, 38, 34, 56};
        int s = 0;
        for (int i = 0; i < sumas.length; i++) {
            if (sumas[i] % 2 != 0) {
                s += sumas[i];
            }
        }
    }
}

