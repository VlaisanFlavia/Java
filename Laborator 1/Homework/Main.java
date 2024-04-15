public class Main {
    public static void main(String[] args) {
//        if(args.length != 3){
//            System.out.println("Usage: java Lab1 <a> <b> <k> ");
//        }

        int a, b, k;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        if (a >= b){
            System.out.println("a must be less than b");
            return;
        }

        long startTime = System.nanoTime();
        StringBuilder result = new StringBuilder();

        for (int number = a; number <= b; number++){
            if (isKReductible(number,k )){
                result.append(number).append(" ");
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("K-reductible numbers in the interval [" + a + ", " + b + "]:");
        System.out.println(result.toString());
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

    private static boolean isKReductible(int number, int k){

        while (number > 9){
            int sum = 0;
            int aux = number;

            while(aux > 0) {
                int digit = aux % 10;
                sum += digit * digit;
                aux = aux/10;
            }
            number = sum;
        }
        return number == k;
    }
}