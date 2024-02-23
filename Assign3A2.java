public class Assign3A2 {
    public static void main(String[] args) {
        String currentMonth = "March";

        System.out.println("The current month is: " + currentMonth);

        switch (currentMonth)
         {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(currentMonth+ " has 31 days.");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(currentMonth+ " has 30 days.");
                break;
            case "February":
                System.out.println(currentMonth+ " has 28 or 29 days.");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }
    }
}
