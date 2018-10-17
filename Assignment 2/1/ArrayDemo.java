class ArrayDemo {
    public static void main(String[] args) {

        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };

        ArrayOps operate = new ArrayOps(); // create an ArrayOps object
        int biggest = operate.FindMax(ar1); // call the findMax () method with the array
        System.out.println("The maximum is: " + biggest);
        int lowest = operate.FindLowest(ar1);
        System.out.println("The lowest is: " + lowest);
        int summery = operate.SumArray(ar1);
        System.out.println("The sum is: " + summery);
        
        System.out.print("Backwards is: ");
        operate.PrintBackwards(ar1);
        
        System.out.print("Odd elements are: ");
        operate.PrintOddElements(ar1);

        System.out.print("Even elements are: ");
        operate.PrintEvenElements(ar1);

        System.out.print("All elements set to zero is: ");
        operate.ZeroOut(ar1);



    }
}

class ArrayOps {

    int FindMax(int[] x) {
        int max = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] > max) {
                max = x[index];
            }
        }

        return max;
    }

    int FindLowest(int[] x) {
        int low = x[0];// you can do the rest from here just < instead of > from findMax comparisons.

        for (int index = 0; index < x.length; index++)
            if (x[index] < low)
                low = x[index];

        return low;
    }

    void Print(int[] x) {

        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }

        System.out.println();
    }

    int SumArray(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];    //sum is value of int in array + all other values
        }

        return sum;
    }

    void PrintBackwards(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    void PrintOddElements(int[] x) {
        for (int i = 1; i < x.length; i += 2) {     //starting at zero print every other element
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    void PrintEvenElements(int[] x) {
        for (int i = 0; i < x.length; i += 2) { //starting at 1 print every other element
            System.out.print(x[i] + " ");


        }
        System.out.println();
    }

    void ZeroOut(int[] x) { //for each value of ar1 set to 0
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}