class SumOfPrimeSquare {
    public static void main(String[] args) {
        int sum = 0;

        sum += square(2);
        sum += square(3);
        sum += square(5);
        sum += square(7);
        sum += square(11);
        sum += square(13);

        System.out.println(sum);
    }

    static int square(int x) {
        return x * x;
    }
}
