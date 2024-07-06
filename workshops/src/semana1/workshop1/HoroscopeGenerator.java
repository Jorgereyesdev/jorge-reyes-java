package semana1.workshop1;

import java.util.Scanner;

public class HoroscopeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        String zodiacSign = "";

        switch (month) {
            case 1:
                if (day >= 1 && day <= 19) {
                    zodiacSign = "Capricorn";
                } else if (day >= 20 && day <= 31) {
                    zodiacSign = "Aquarius";
                }
                break;
            case 2:
                if (day >= 1 && day <= 18) {
                    zodiacSign = "Aquarius";
                } else if (day >= 19 && day <= 29) { // Consider leap year with 29 days in February
                    zodiacSign = "Pisces";
                }
                break;
            case 3:
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Pisces";
                } else if (day >= 21 && day <= 31) {
                    zodiacSign = "Aries";
                }
                break;
            case 4:
                if (day >= 1 && day <= 19) {
                    zodiacSign = "Aries";
                } else if (day >= 20 && day <= 30) {
                    zodiacSign = "Taurus";
                }
                break;
            case 5:
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Taurus";
                } else if (day >= 21 && day <= 31) {
                    zodiacSign = "Gemini";
                }
                break;
            case 6:
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Gemini";
                } else if (day >= 21 && day <= 30) {
                    zodiacSign = "Cancer";
                }
                break;
            case 7:
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Cancer";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Leo";
                }
                break;
            case 8:
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Leo";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Virgo";
                }
                break;
            case 9:
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Virgo";
                } else if (day >= 23 && day <= 30) {
                    zodiacSign = "Libra";
                }
                break;
            case 10:
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Libra";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Scorpio";
                }
                break;
            case 11:
                if (day >= 1 && day <= 21) {
                    zodiacSign = "Scorpio";
                } else if (day >= 22 && day <= 30) {
                    zodiacSign = "Sagittarius";
                }
                break;
            case 12:
                if (day >= 1 && day <= 21) {
                    zodiacSign = "Sagittarius";
                } else if (day >= 22 && day <= 31) {
                    zodiacSign = "Capricorn";
                }
                break;
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                scanner.close();
                return;
        }

        if (!zodiacSign.isEmpty()) {
            System.out.println("Your zodiac sign is: " + zodiacSign);
        } else {
            System.out.println("Invalid day for the given month.");
        }

        scanner.close();
    }

}
