public class Main {

    public static int compute(int number){

        int sum = 0;
        int result;

        do {

            while (number != 0) {

                sum += number % 10;
                number = number / 10;
            }

            number = sum;
            result = sum;
            sum = 0;
        } while (result > 9);

        return number;
    }

    public static void main (String[] args) {

        //1.Display on the screen the message "Hello World!". Run the application.
        System.out.println("Hello World");

        //2. Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go",
        // "Rust", "JavaScript", "PHP", "Swift", "Java"}
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        for (int i = 0; i < languages.length; i++)
            System.out.print(languages[i] + " ");

        //3.Generate a random integer n: int n = (int) (Math.random() * 1_000_000)
        System.out.print("\n");
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);

        //4.Compute the result obtained after performing the following calculations:

        // multiply n by 3
        n *= 3;

       //add the binary number 10101 to the result
        n += Integer.parseInt("10101",2);

        //add the hexadecimal number FF to the result
        n += Integer.parseInt("FF",16);

        //multiply the result by 6
        n *= 6;

        //5.Compute the sum of the digits in the result obtained in the previous step. This is the new result.
        // While the new result has more than one digit, continue to sum the digits of the result. (cifra de control)
        n = compute(n);

        System.out.println(n);

        //6.Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result]

        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);

    }
}