package ex01_xxxxx;


//note: I add 1 dummy class and 1 dummy test-class because it is impossible to commit empty directories

public class Example {

    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Example ex1 = new Example();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
