import java.util.Scanner;
class idk {
    public static void main(String[] args) {

        boolean run = true;
        while (run = true) {
            Scanner myObj = new Scanner(System.in);
            int tempF;

            // Enter username and press Enter
            System.out.println("Enter temperature(°F)");
            tempF = Integer.parseInt(myObj.nextLine());

            int tempC = (int) ((tempF - 32) * 0.5556);

            System.out.print("Temperature(°C) is: ");
            System.out.println(tempC);

        }
    }
}
