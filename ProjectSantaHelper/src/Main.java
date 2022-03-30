import java.util.*;

public class Main {


    public static void main(String[] args) {

        GiftsRegister giftsRegister = new GiftsRegister();

        Scanner sc = new Scanner(System.in);

        String input = "";

        while (!input.equals("4")) {

            printMenu();

            input = sc.nextLine();

            switch (input) {
                case "1":
                    addChildEntry(sc, giftsRegister);
                    break;
                case "2":
                    addGiftsEntry(sc, giftsRegister);
                    break;
                case "3":
                    assignGifts(sc, giftsRegister);
                    break;
                case "4":
                    break;
                default:
                    System.out.println();
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Unknown input");
                    System.out.println("Please choose from menu and put only [1], [2], [3], [4], [5]");
                    System.out.println("------------------------------------------------------------");
                    System.out.println();
                    break;
            }
        }
    }
    private static void addChildEntry(Scanner sc, GiftsRegister giftsRegister) {
        System.out.print("Enter kids name: ");
        String kidsName = sc.nextLine();
        System.out.print("Enter kids surname: ");
        String kidsSurname = sc.nextLine();
        giftsRegister.addChildEntry(kidsName, kidsSurname);
    }

    private static void addGiftsEntry(Scanner sc, GiftsRegister giftsRegister) {
        System.out.print("Enter gift: ");
        String giftName = sc.nextLine();
        giftsRegister.addGiftsEntry(giftName);
    }

    private static void assignGifts(Scanner sc, GiftsRegister giftsRegister) {
        System.out.println("CHOOSE:");
        System.out.println("-------------------------");
        System.out.println("[1] Assign gift manually");
        System.out.println("[2] Assign gifts random");
        System.out.println("[3] Assign ALL gifts");
        System.out.println("-------------------------");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            System.out.print("Enter kids name: ");
            String kidsName = sc.nextLine();
            System.out.print("Enter kids surname: ");
            String kidsSurname = sc.nextLine();
            System.out.print("Enter gift for kid: ");
            String giftName = sc.nextLine();
            HashMap<String, String> manualRegister = new HashMap<>();
            manualRegister.put((kidsName + " " + kidsSurname), giftName);
            System.out.println();

            System.out.println("*Manually assigned list*, amount of pairs: "+manualRegister.size());

            System.out.println("_____________________________________");
            System.out.printf("|%15s  |%15s  |\n", "Children list", "Gifts list");
            for (Map.Entry<String, String> entry : manualRegister.entrySet()) {
                System.out.println("------------------------------------");
                System.out.printf("| %14s  |  %14s |\n", entry.getKey(), entry.getValue());
                System.out.println("-------------------------------------");
            }
            manualRegister.clear();
            System.out.println("*Manual assigned list* was remove");

        } else if (choice.equals("2")) {
            System.out.print("Enter kids name: ");
            String kidsName = sc.nextLine();
            System.out.print("Enter kids surname: ");
            String kidsSurname = sc.nextLine();
            ArrayList<String> gifts = new ArrayList<>();
            gifts.add("Lego kit");
            gifts.add("Bike");
            gifts.add("Dog");
            gifts.add("Cat");
            gifts.add("Doll");
            gifts.add("Cookies");
            gifts.add("Car");
            gifts.add("Kite");
            int randomIndex = (int) (Math.random() * gifts.size());
            String randomElement = gifts.get(randomIndex);
            HashMap<String, String> randomGiftRegister = new HashMap<>();
            randomGiftRegister.put((kidsName + "  " + kidsSurname), randomElement);
            System.out.println();
            System.out.println("*Random assigned list*, amount of pairs: "+randomGiftRegister.size());

            System.out.println("_____________________________________");
            System.out.printf("|%15s  |%15s  |\n", "Children list", "Gifts list");
            for (Map.Entry<String, String> entry : randomGiftRegister.entrySet()) {
                System.out.println("------------------------------------");
                System.out.printf("| %14s  |  %14s |\n", entry.getKey(), entry.getValue());
                System.out.println("-------------------------------------");
            }
            randomGiftRegister.clear();
            System.out.println("*Random assigned list* was remove");

        } else if (choice.equals("3")) {
            HashMap<String, String> hmGiftsRegister = new HashMap<>();
            hmGiftsRegister.put("Jon Bon", "Boots");
            hmGiftsRegister.put("Joana Bu", "Bag");
            hmGiftsRegister.put("Kora Lu", "Money");
            HashMap<String, String> allGiftsRegister = new HashMap<>();
            hmGiftsRegister.put("Dora Kit", "Boat");
            hmGiftsRegister.put("Lora Dua", "Ball");
            allGiftsRegister.putAll(hmGiftsRegister);
            System.out.println();
            System.out.println("*All assigned list*, amount of pairs: "+allGiftsRegister.size());
            System.out.println("_____________________________________");
            System.out.printf("|%15s  |%15s  |\n", "Children list", "Gifts list");
            for (Map.Entry<String, String> entry : allGiftsRegister.entrySet()) {
                System.out.println("------------------------------------");
                System.out.printf("| %14s  |  %14s |\n", entry.getKey(), entry.getValue());
                System.out.println("-------------------------------------");
            }
            allGiftsRegister.clear();
            System.out.println("*All assigned list* was remove");

        } else {
            System.out.println("__________________________________________________");
            System.out.println("Unknown choice");
            System.out.println("Please choose from menu and put only [1], [2], [3] ");
            System.out.println("---------------------------------------------------");
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("           *MENU*           ");
        System.out.println("****************************");
        System.out.println("[1] ADD NEW CHILD");
        System.out.println("[2] ADD NEW GIFT");
        System.out.println("[3] ASSIGN GIFTS AND PRINT INFORMATION");
        System.out.println("[4] EXIT");
        System.out.println("*****************************");
        System.out.println();
    }
}