class SumSquaresInRange {

    static int Square(int N) {
        if (N == 0) {
            return 0;
        }
        else {
            return (N*N) + Square(N - 1);     //squares next number and then adds the previous number that was squared.
            
        }

    }




    public static void main(String[] args) {
        int argument = 4;
        System.out.println("Square addition is " + Square(argument));   // calls on Square
    }
}