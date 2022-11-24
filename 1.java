import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int current_day = 25;
        int current_month = 11;
        int current_year = 2022;
        int day = 0;
        int month = 0;
        int year = 0;
        int year_old = 0;
        int month_old = 0;
        int day_old = 0;
        int day_old_ost = 0;
        /*Проверяем, что введённые данные- челые числа */
        System.out.println("Введите день вашего рождения");
        if (scanner.hasNextInt()){
            day = scanner.nextInt();
            day_old = current_day - day;
            if ((day > 31) || (day < 1)) {
                System.out.println("Введены некорректные данные дня");
                System.exit(0);
            }
            System.out.println("Введите месяц вашего рождения");

            if (scanner.hasNextInt()){
                month = scanner.nextInt();
                month_old = current_month - month;
                if ((month > 12) || (month < 1)) {
                    System.out.println("Введены некорректные данные месяца");
                    System.exit(0);
                }
                System.out.println("Введите год вашего рождения");

                if (scanner.hasNextInt()){
                    year = scanner.nextInt();
                    if (year > 2022) {
                        System.out.println("Введены некорректные данные года");
                        System.exit(0);
                    }
                    year_old = current_year - year;
                }
                else {
                    System.out.println("Введите целые числа в качестве значений!");
                    scanner.next();
                }

            }
            else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }
        /*Преобразуем это всё чтобы избежать отрицательных месяцов и тд */

        day_old = day_old + (year_old * 365) + (month_old * 30);
        day_old_ost = day_old % 365;
        year_old = (day_old - day_old_ost) / 365;
        day_old =  day_old_ost % 30;
        month_old = (day_old_ost - day_old) / 30;
        System.out.println(year_old + " лет, " + month_old + " месяцев, " + day_old + " дней.");

        scanner.close();
    }
}
