import java.util.Scanner;
class idk {
    public static void main(String[] args) {
 menu();
    }
    public static void f2c() {

        Scanner myObj = new Scanner(System.in);
            int tempF;

            System.out.println("Enter temperature(°F): ");
            tempF = Integer.parseInt(myObj.nextLine());

            int tempC = (int) ((tempF - 32) * 0.5556);

            System.out.print("Temperature(°C) is: ");
            System.out.println(tempC);
        System.out.println();
        System.out.println("#################################");
        System.out.println();
             menu();
        }
    public static void c2f() {

        Scanner myObj = new Scanner(System.in);
        int tempC;

        System.out.println("Enter temperature(°C): ");
        tempC = Integer.parseInt(myObj.nextLine());

        int tempF = (int) ((tempC * 1.8) + 32);

        System.out.print("Temperature(°F) is: ");
        System.out.println(tempF);
        System.out.println();
        System.out.println("#################################");
        System.out.println();
menu();
    }
    public static void menu(){
        //String userInput = String.valueOf(System.in);
        System.out.println();
        System.out.println("#################################");
        System.out.println();
        System.out.println("f: Fahrenheit to Celsius");
        System.out.println("c: Celsius to Fahrenheit");
        System.out.println("q: Quit");
        System.out.println();
        System.out.println("#################################");
        System.out.println();

        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();
        System.out.println();
        System.out.println("#################################");
        System.out.println();
        //String menu = myObj.nextLine();

        if (userInput.equals("f") || userInput.equals("F")) {
            f2c();
        } else if (userInput.equals("c") || userInput.equals("C")){
            c2f();
        } else if (userInput.equals("q") || userInput.equals("Q")){
            System.exit(0);
        } else {
            System.out.println("invalid character");
            menu();
        }


            }
    }

