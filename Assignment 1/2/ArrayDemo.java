public class ArrayDemo {
    public static void main(String[] args) {
        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };
        int[] ar2 = { 2, 4, 1, 2, 6, 3, 6, 9 };

        System.out.println("The first  maximum is: " + ArrayOps.findMax(ar1));
        System.out.println("The second maximum is: " + ArrayOps.findMax(ar2));
    }
}

class ArrayOps { // the parameter x will contain the array reference
    public static int findMax(int[] x) // this method is called with.
    {
        int max = x[0];
        for (int index = 0; index < x.length; index++)
            if (x[index] > max)
                max = x[index];

        return max;
    }
}