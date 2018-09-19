public class ArrayDemo {    //the date is September 19th s018
    public static void main(String[] args) {
        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };
        int biggest = ArrayOps.findMax(ar1); // call findMax() with a reference to the array
        System.out.println("The maximum is: " + biggest);
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