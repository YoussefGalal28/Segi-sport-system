



package segisportsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainScs {

    static Scanner scanner = new Scanner(System.in);

    static List<User> userList = new ArrayList<>();
    static List<Facility> facilityList = new ArrayList<>();
    static List<Booking> bookingList = new ArrayList<>();
    static List<Package> packageList = new ArrayList<>();

    static {
        facilityList.add(new Facility("Badminton Court"));
        facilityList.add(new Facility("Swimming Court"));
        facilityList.add(new Facility("Running Court"));

        userList.add(new Outsider("12", "Outsider user 1", "out@email.com", 1234));

        packageList.add(new Package("Merdeka Promo", facilityList.get(0), 100, 2));

        bookingList.add(new Booking(packageList.get(0), userList.get(0), "20-2-2023"));
    }

    public static void main(String[] args) {

        boolean cont = true;
        while (cont) {
            try {
                menu();
                System.out.println("Enter your selection: ");
                int selection = Integer.parseInt(scanner.nextLine());

                switch (selection) {
                    case 1:
                        menu1();
                        break;
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4();
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                    case 7:
                        menu7();
                        break;
                    case 8:
                        menu8();
                        break;
                    case 0:
                        cont = false;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private static void menu() {
        System.out.println("1) Add Facilities");
        System.out.println("2) Show Facilities");
        System.out.println("3) Add Package");
        System.out.println("4) Show Package");
        System.out.println("5) Show Booking");
        System.out.println("6) Create Booking");
        System.out.println("7) Payment Report");
        System.out.println("8) User Report");

        System.out.println("0) Exit");


    }

    private static void menu1() {

        System.out.println("Enter the facility name: ");
        String name = scanner.nextLine();

        facilityList.add(new Facility(name));
        System.out.println("Added new facility");
    }


    private static void menu2() {
        for (Facility f : facilityList) {
            System.out.println(f);
        }
    }

    private static void menu3() {
        System.out.println("Enter package name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the facilities type: ");
        for (int i = 0; i < facilityList.size(); i++) {
            System.out.println(i + ") " + facilityList.get(i));
        }

        int type = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the available hour: ");
        int hour = Integer.parseInt(scanner.nextLine());

        packageList.add(new Package(name, facilityList.get(type), price, hour));
        System.out.println("Added new package");
    }

    private static void menu4() {
        for (Package p : packageList) {
            System.out.println(p);
        }
    }

    private static void menu5() {
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }

    private static void menu6() {
        for (int i = 0; i < packageList.size(); i++) {

            System.out.println(i + ")" + packageList.get(i));

        }
        System.out.println("Select the index of package to be book");
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter 1 to select existing user or 0 to create new user: ");
        int select = Integer.parseInt(scanner.nextLine());

        if (select == 1) {
            System.out.println("Select the user index ");
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(i + ")" + userList.get(i));
            }
        int userIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the date for booking(DD-MM-YYYY): ");
        String date = scanner.nextLine();
            bookingList.add(new Booking(packageList.get(index), userList.get(userIndex), date));
            System.out.println("Booked success");
            return;
        } else if (select == 0) {
            System.out.println("1) create staff");
            System.out.println("2) create student");
            System.out.println("3) create outsider");
            System.out.println("Enter your selection ");
            int selection = Integer.parseInt(scanner.nextLine());

            if (selection == 1) {
                System.out.println("User ID: ");
                String userId = scanner.nextLine();
                System.out.println("User Name: ");
                String username = scanner.nextLine();
                System.out.println("User email: ");
                String useremail = scanner.nextLine();
                System.out.println("User Contact: ");
                long contact = Long.parseLong(scanner.nextLine());
                userList.add(new Staff(userId, username, useremail, contact));
                System.out.println("Please enter the date for booking(DD-MM-YYYY): ");
                String date = scanner.nextLine();
                bookingList.add(new Booking(packageList.get(index), userList.get(userList.size() - 1), date));

            } else if (selection == 2) {
                System.out.println("User ID: ");
                String userId = scanner.nextLine();
                System.out.println("User Name: ");
                String username = scanner.nextLine();
                System.out.println("User email: ");
                String useremail = scanner.nextLine();
                System.out.println("User Contact: ");
                long contact = Long.parseLong(scanner.nextLine());
                userList.add(new Student(userId, username, useremail, contact));
                System.out.println("Please enter the date for booking(DD-MM-YYYY): ");
                String date = scanner.nextLine();
                bookingList.add(new Booking(packageList.get(index), userList.get(userList.size() - 1), date));

            } else if (selection == 3) {
                System.out.println("User ID: ");
                String userId = scanner.nextLine();
                System.out.println("User Name: ");
                String username = scanner.nextLine();
                System.out.println("User email: ");
                String useremail = scanner.nextLine();
                System.out.println("User Contact: ");
                long contact = Long.parseLong(scanner.nextLine());
                userList.add(new Outsider(userId, username, useremail, contact));
                System.out.println("Please enter the date for booking(DD-MM-YYYY): ");
                String date = scanner.nextLine();
                bookingList.add(new Booking(packageList.get(index), userList.get(userList.size() - 1), date));


            } else {
                System.out.println("invalid ");
                return;
            }


        } else {
            System.out.println("Invalid");
        }

    }

    private static void menu7() {
        double total = 0.0;
        for (Booking b : bookingList) {
            total += b.getaPackage().getPrice() - (b.getaPackage().getPrice() * (b.getUser().discount() / 100));
        }
        System.out.println("Total Payment Collected : RM" + total);
    }

    private static void menu8() {
        int staff = 0, student = 0, outsider = 0;
        for (User u : userList) {
            if (u instanceof Student) {
                student++;
            } else if (u instanceof Staff) {
                staff++;
            } else if (u instanceof Outsider) {
                outsider++;
            }
        }

        System.out.println("Total number of registered student : " + student);
        System.out.println("Total number of registered staff : " + staff);
        System.out.println("Total number of registered outsider : " + outsider);
    }
}

