import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        int a, b;
        boolean loop = true;

        System.out.println("Hi!\n What do you want to do?");
        do {
            System.out.print("1-Multiply\n" +
                    "2-Add\n" +
                    "3-Subtract\n" +
                    "4-Division\n" +
                    "\n" +
                    "5-Exit\n" +
                    "-->");
            int af = scanner.nextInt();
            if(af==5){
                System.exit(0);
            }
            System.out.print("Choose arabic or roman numerals\n1-Arabic\n2-Roman\n-->");
            int numeral = scanner.nextInt();


            if (numeral == 1) {
                System.out.print("Enter two integer value\n-->");
                a = scanner.nextInt();
                System.out.print("-->");
                b = scanner.nextInt();
                switch (af) {
                    case 1:
                        System.out.println(function.Multiply(a, b));
                        break;
                    case 2:
                        System.out.println(function.Add(a, b));
                        break;
                    case 3:
                        System.out.println(function.Substract(a, b));
                        break;
                    case 4:
                        System.out.println(function.Division(a, b));
                        break;
                }
            }
            if (numeral == 2) {
                System.out.print("Enter two roman numerals\n-->");
                String first = scanner.next();
                System.out.print("-->");
                String second = scanner.next();

                int convFirst = function.ConvertToDecimal(first);
                int convSecond = function.ConvertToDecimal(second);
                switch (af) {
                    case 1:
                        System.out.println(function.ConvertToRoman(function.Multiply(convFirst, convSecond)));
                        break;
                    case 2:
                        System.out.println(function.ConvertToRoman(function.Add(convFirst, convSecond)));
                        break;
                    case 3:
                        System.out.println(function.ConvertToRoman(function.Substract(convFirst, convSecond)));
                        break;
                    case 4:
                        System.out.println(function.ConvertToRoman(function.Division(convFirst, convSecond)));
                        break;
                }
            }
            System.out.println("Choose operation");
        }while (loop == true);
    }
}
