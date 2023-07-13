import java.util.*;

class BookingDetails {
    private int ownerIndex;
    private int clientIndex;
    private String bookDate;
    private String returnDate;

    public BookingDetails(int ownerIndex, int clientIndex, String bookDate, String returnDate) {
        this.ownerIndex = ownerIndex;
        this.clientIndex = clientIndex;
        this.bookDate = bookDate;
        this.returnDate = returnDate;
    }

    public int getOwnerIndex() {
        return ownerIndex;
    }

    public int getClientIndex() {
        return clientIndex;
    }

    public String getBookDate() {
        return bookDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
}

class VehicleBooking {
    ArrayList<String> OwnerName = new ArrayList<String>();
    ArrayList<String> Vehicle = new ArrayList<String>();
    ArrayList<Integer> OwnerExperience = new ArrayList<Integer>();
    ArrayList<String> OwnerGender = new ArrayList<String>();
    ArrayList<String> OwnerPassword = new ArrayList<String>();
    ArrayList<Integer> OwnerAge = new ArrayList<Integer>();
    ArrayList<Long> OwnerMobileNumber = new ArrayList<Long>();
    ArrayList<String> OwnerCity = new ArrayList<String>();
    ArrayList<String> Rating = new ArrayList<String>();
    ArrayList<Integer> VehFare = new ArrayList<Integer>();

    ArrayList<Integer> ClientAge = new ArrayList<Integer>();
    ArrayList<String> ClientName = new ArrayList<String>();
    ArrayList<String> ClientGender = new ArrayList<String>();
    ArrayList<String> ClientPassword = new ArrayList<String>();
    ArrayList<String> ClientConfirmPassword = new ArrayList<String>();
    ArrayList<Long> ClientMobileNumber = new ArrayList<Long>();
    ArrayList<Long> ClientDL = new ArrayList<Long>();

    ArrayList<BookingDetails> bookings = new ArrayList<>();

    void dataAdd() {
        OwnerName.add("Mohan Sir");
        OwnerName.add("Pramod Sir");
        OwnerName.add("Vikash Jha");
        OwnerName.add("Shivansh Raj");
        OwnerName.add("Ankur Singh");
        OwnerName.add("Vivek Kishor");
        OwnerName.add("Amit Loda");

        Vehicle.add("SUV Car");
        Vehicle.add("Hero Honda Bike");
        Vehicle.add("Maruti Suzuki Car");
        Vehicle.add("Honda Activa Scooty");
        Vehicle.add("Wagon R Car");
        Vehicle.add("Indica Car");
        Vehicle.add("Bajaj CT Car");

        VehFare.add(600);
        VehFare.add(250);
        VehFare.add(500);
        VehFare.add(300);
        VehFare.add(750);
        VehFare.add(615);
        VehFare.add(450);


        OwnerExperience.add(6);
        OwnerExperience.add(5);
        OwnerExperience.add(8);
        OwnerExperience.add(8);
        OwnerExperience.add(2);
        OwnerExperience.add(4);
        OwnerExperience.add(5);

        OwnerGender.add("M");
        OwnerGender.add("M");
        OwnerGender.add("M");
        OwnerGender.add("M");
        OwnerGender.add("M");
        OwnerGender.add("M");
        OwnerGender.add("M");

        OwnerPassword.add("Mohan123");
        OwnerPassword.add("Pramod123");
        OwnerPassword.add("Vikash123");
        OwnerPassword.add("Shivansh123");
        OwnerPassword.add("Ankur123");
        OwnerPassword.add("Vivek123");
        OwnerPassword.add("Amit123");

        OwnerAge.add(30);
        OwnerAge.add(33);
        OwnerAge.add(40);
        OwnerAge.add(45);
        OwnerAge.add(28);
        OwnerAge.add(29);
        OwnerAge.add(38);

        OwnerMobileNumber.add(965L);
        OwnerMobileNumber.add(123L);
        OwnerMobileNumber.add(123L);
        OwnerMobileNumber.add(123L);
        OwnerMobileNumber.add(123L);
        OwnerMobileNumber.add(123L);
        OwnerMobileNumber.add(123L);

        OwnerCity.add("Bengaluru");
        OwnerCity.add("Bengaluru");
        OwnerCity.add("Pune");
        OwnerCity.add("Nagpur");
        OwnerCity.add("Mumbai");
        OwnerCity.add("Delhi");
        OwnerCity.add("Chennai");

        Rating.add("*****");
        Rating.add("*****");
        Rating.add("***");
        Rating.add("****");
        Rating.add("**");
        Rating.add("***");
        Rating.add("****");
    }

    void admin() throws Exception {
        Scanner sc = new Scanner(System.in);
        byte choice;
        boolean flag = true;

        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  ____________________________");
            System.out.println("\t\t |                            |");
            System.out.println("\t\t |    Welcome Back Admin.     |");
            System.out.println("\t\t |____________________________|");
            System.out.print("\n\n1. Owner list \t2. Clients List \t3. Clients with Booking \t4.Home  \n\nEnter Your Choice:\n");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i <= OwnerName.size() - 1; i++) {
                        System.out.println("Name: \t " + OwnerName.get(i));
                    }
                    byte menuChoice;
                    System.out.println("\n\n1. Main menu\t 2. Previous menu");
                    menuChoice = sc.nextByte();
                    if (menuChoice == 1) {
                        flag = false;
                    } else {
                        break;
                    }
                    break;

                case 2:
                    if (ClientName.isEmpty()) {
                        System.out.println("No Registered Clients yet.");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= ClientName.size() - 1; i++) {
                            System.out.println(i + ". " + ClientName.get(i));
                        }

                        System.out.println("\n\n1. Main menu\t 2. Previous menu");
                        menuChoice = sc.nextByte();
                        if (menuChoice == 1) {
                            flag = false;
                        } else {
                            break;
                        }
                    }
                    break;

                case 3:
                    if (bookings.isEmpty()) {
                        System.out.println("\nNo Booking yet.");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= bookings.size() - 1; i++) {
                            BookingDetails booking = bookings.get(i);
                            System.out.println(i + ". " + ClientName.get(booking.getClientIndex()));
                        }
                        Thread.sleep(5000);
                        flag = false;
                    }
                    break;
                
                case 4:
                    flag = false;
                    break;              
                    
                default:
                    System.out.println("Wrong choice");
                    Thread.sleep(1000);
                    flag = true;
            }
        }
    }

    void Client() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t | Welcome to Client Page! |");
            System.out.println("\t\t |_________________________|");
            System.out.println(" ");
            System.out.println("1.Login \t 2.Registration\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (ClientMobileNumber.isEmpty()) {
                        System.out.println("We request you to first register yourself  and then login!");
                        Thread.sleep(1000);
                        break;
                    } else {
                        ClientLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    ClientRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("\nYou have entered wrong choice. Enter your choice again....!!!");
                    flag = true;
                    Thread.sleep(1000);
                    break;
            }
        }
    }

    void Owner() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t | Welcome to Owner Page! |");
            System.out.println("\t\t |_________________________|");
            System.out.println(" ");

            System.out.println("1. Login \t 2.Registration");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (OwnerMobileNumber.isEmpty()) {
                        System.out.println("Register first...!");
                        flag = false;
                        Thread.sleep(1500);
                        break;
                    } else {
                        OwnerLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    OwnerRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("Entered Wrong choice..");
                    flag = true;
            }
        }
    }

    void ClientLogin() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        long mobileNumber;
        byte choice;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t  _________________________");
        System.out.println("\t\t |                         |");
        System.out.println("\t\t |         Login           |");
        System.out.println("\t\t |_________________________|");

        System.out.println("Enter your Username (mobilenumber)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();

        boolean flag1 = false;
        int j;
        for (j = 0; j <= ClientMobileNumber.size() - 1; j++) {
            if (ClientMobileNumber.get(j).equals(mobileNumber) && ClientPassword.get(j).equals(password)) {
                flag1 = true;
                break;
            }
        }
        if (flag1 == true) {
            Thread.sleep(1000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t |   Start your Booking    |");
            System.out.println("\t\t |_________________________|");
            System.out.println("\n Welcome " + ClientName.get(j) + ", choose a vehicle to book");
            System.out.println();
            for (int i = 0; i <= Vehicle.size() - 1; i++) {
                System.out.println((i + 1) + ". " + Vehicle.get(i));
            }
            choice = sc.nextByte();
            int ownerIndex = choice - 1;

            while (flag) {
                Thread.sleep(1000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\t\t  _________________________");
                System.out.println("\t\t |                         |");
                System.out.println("\t\t |      Your Booking       |");
                System.out.println("\t\t |_________________________|");

                if (ownerIndex >= 0 && ownerIndex <= Vehicle.size()) {
                    System.out.println("\n\nName:  \t " + OwnerName.get(ownerIndex) + "\nVehicle: "
                            + Vehicle.get(ownerIndex)+"\nFare:  \t"
                            + VehFare.get(ownerIndex)+" Rs/day" + "\nAge: \t " + OwnerAge.get(ownerIndex) + "\nMobile:  "
                            + OwnerMobileNumber.get(ownerIndex) + "\nCity: \t " + OwnerCity.get(ownerIndex)
                            + "\nRating:   "+"\nUsage:  \t"
                            + OwnerExperience.get(ownerIndex)+" Years" + Rating.get(ownerIndex));
                    System.out.println();
                    
                    System.out.println("Enter period of booking");
                    System.out.println("Renting date : DD MM YY");
                    int dd = sc.nextInt();
                    int mm = sc.nextInt();
                    int yy = sc.nextInt();
                    String bookDate = dd + "/" + mm + "/" + yy;

                    System.out.println("Returning date : DD MM YY");
                    dd = sc.nextInt();
                    mm = sc.nextInt();
                    yy = sc.nextInt();
                    String returnDate = dd + "/" + mm + "/" + yy;

                    bookings.add(new BookingDetails(ownerIndex, j, bookDate, returnDate));
                    System.out.println("Booking Successful...!!!");
                    Thread.sleep(2000);
                    flag = false;
                } else {
                    System.out.println("Invalid choice");
                    flag = true;
                    Thread.sleep(2000);
                }
            }
        } else {
            System.out.println("Wrong password or username");
            Thread.sleep(1000);
            flag = true;
        }
    }

    void OwnerLogin() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        long mobileNumber;
        byte choice;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t  _________________________");
        System.out.println("\t\t |                         |");
        System.out.println("\t\t |         Login           |");
        System.out.println("\t\t |_________________________|");

        System.out.println("Enter your Username (mobilenumber)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();

        boolean flag1 = false;
        int j;
        for (j = 0; j <= OwnerMobileNumber.size() - 1; j++) {
            if (OwnerMobileNumber.get(j).equals(mobileNumber) && OwnerPassword.get(j).equals(password)) {
                flag1 = true;
                break;
            }
        }
        if (flag1 == true) {
            Thread.sleep(1000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t |      Welcome            |");
            System.out.println("\t\t |_________________________|");
            System.out.println("\n Welcome " + OwnerName.get(j) + ", choose an option from the menu");
            System.out.println();
            while (flag) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\t\t  _________________________");
                System.out.println("\t\t |                         |");
                System.out.println("\t\t |         Menu            |");
                System.out.println("\t\t |_________________________|");
                System.out.println("\n1. My Booking \t 2. Previous Menu");

                choice = sc.nextByte();
                switch (choice) {
                    case 1:
                        boolean flag3 = true;
                        while (flag3) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            System.out.println("\t\t  _________________________");
                            System.out.println("\t\t |                         |");
                            System.out.println("\t\t |       My Booking        |");
                            System.out.println("\t\t |_________________________|");
                            if (bookings.isEmpty()) {
                                System.out.println("\nNo Bookings yet.");
                                Thread.sleep(3000);
                                flag3 = false;
                                flag = true;
                                break;
                            } else {
                                for (int i = 0; i <= bookings.size() - 1; i++) {
                                    BookingDetails booking = bookings.get(i);
                                    if (booking.getOwnerIndex() == j) {
                                        System.out.println("\n\nBooking " + (i + 1) + "\nName:  \t "
                                                + ClientName.get(booking.getClientIndex()) + "\nVehicle: "
                                                + Vehicle.get(booking.getOwnerIndex()) + "\nAge: \t "
                                                + ClientAge.get(booking.getClientIndex()) + "\nMobile:  "
                                                + ClientMobileNumber.get(booking.getClientIndex()) + "\nCity: \t "
                                                + OwnerCity.get(booking.getOwnerIndex()) + "\nBooking Date:  "
                                                + booking.getBookDate() + "\nReturn Date:   "
                                                + booking.getReturnDate());
                                    }
                                }
                                System.out.println("\n\n1. Previous Menu");
                                choice = sc.nextByte();
                                if (choice == 1) {
                                    flag3 = false;
                                    flag = true;
                                } else {
                                    flag3 = true;
                                }
                            }
                        }
                        break;

                    case 2:
                       
                        flag = false;
                        break;

                    default:
                        System.out.println("Wrong choice");
                        Thread.sleep(1000);
                        flag = true;
                }
            }
        } else {
            System.out.println("Wrong password or username");
            Thread.sleep(1000);
            flag = true;
        }
    }

    void ClientRegistration() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _____________________________");
            System.out.println("\t\t |                             |");
            System.out.println("\t\t |    Client Registration      |");
            System.out.println("\t\t |_____________________________|");
            System.out.println("\n\nEnter your name");
            String name = sc.next();
            System.out.println("Enter your gender");
            String gender = sc.next();
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age < 18) {
                System.out.println("You are not eligible to register as a client.");
                Thread.sleep(2000);
                return;
            }
            System.out.println("Enter your mobile number");
            long mobileNumber = sc.nextLong();
            System.out.println("Enter your driving license number");
            long dl = sc.nextLong();
            System.out.println("Enter your password");
            String password = sc.next();
            System.out.println("Confirm your password");
            String confirmPassword = sc.next();
    
            ClientName.add(name);
            ClientGender.add(gender);
            ClientAge.add(age);
            ClientMobileNumber.add(mobileNumber);
            ClientDL.add(dl);
            ClientPassword.add(password);
            ClientConfirmPassword.add(confirmPassword);
    
            System.out.println("Registration Successful...!!!");
            Thread.sleep(2000);
    
            System.out.println("Do you want to register another client? (yes/no)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                flag = false;
            }
        }
    }    

    void OwnerRegistration() throws Exception {
        Scanner sc = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t  ____________________________");
        System.out.println("\t\t |                            |");
        System.out.println("\t\t |    Owner Registration      |");
        System.out.println("\t\t |____________________________|");
        System.out.println("\n\nEnter your name");
        String name = sc.next();
        System.out.println("Enter your gender");
        String gender = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your mobile number");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter vehicle");
        String veh = sc.next();
        System.out.println("Enter fare in Rs/day");
        int fare = sc.nextInt();
        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Enter experience");
        int exp = sc.nextInt();
        System.out.println("Enter your password");
        String password = sc.next();
        String rat = sc.next();

        OwnerName.add(name);
        OwnerGender.add(gender);
        OwnerAge.add(age);
        OwnerMobileNumber.add(mobileNumber);
        OwnerCity.add(city);
        OwnerPassword.add(password);
        Vehicle.add(veh);
        VehFare.add(fare);
        OwnerExperience.add(exp);
        Rating.add(rat);


        System.out.println("Registration Successful...!!!");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws Exception {
        VehicleBooking vb = new VehicleBooking();
        vb.dataAdd();
        Scanner sc = new Scanner(System.in);
        byte choice;
        boolean flag = true;

        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t |   Vehicle Booking App   |");
            System.out.println("\t\t |_________________________|");
            System.out.print("\n\n1. Admin \t2. Client \t3. Owner \n\nEnter Your Choice.");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("\t\t  _________________________");
                    System.out.println("\t\t |                         |");
                    System.out.println("\t\t |   Admin Login           |");
                    System.out.println("\t\t |_________________________|");
                    System.out.println("\nEnter your Password");
                    String adminPassword = sc.next();
                    if (adminPassword.equals("admin")) {
                        vb.admin();
                        flag = true;
                    } else {
                        System.out.println("Wrong password");
                        Thread.sleep(1000);
                        flag = true;
                    }
                    break;

                case 2:
                    vb.Client();
                    flag = true;
                    break;

                case 3:
                    vb.Owner();
                    flag = true;
                    break;

                default:
                    System.out.println("Wrong choice");
                    Thread.sleep(1000);
                    flag = true;
            }
        }
    }
}