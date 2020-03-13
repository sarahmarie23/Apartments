import java.util.*;
public class TestApartments {
    public static void main(String[] args) {
        Apartment apt1 = new Apartment(1, 1, 1, 1000.00);
        Apartment apt2 = new Apartment(2, 2, 2, 2000.00);
        Apartment apt3 = new Apartment(3, 3, 3, 3000.00);
        Apartment apt4 = new Apartment(4, 4, 4, 4000.00);
        Apartment apt5 = new Apartment(5, 5, 5, 5000.00);
        
        Apartment[] apartmentList = {apt1, apt2, apt3, apt4, apt5};
        
        Scanner enterData = new Scanner(System.in);
        System.out.println("What is your minimum number of bedrooms?");
        int bedrooms = enterData.nextInt();
        System.out.println("What is your minimum number of bathrooms?");
        int bathrooms = enterData.nextInt();
        System.out.println("What is your max rent?");
        double monthlyRent = enterData.nextDouble();
        
        processData(apartmentList, bedrooms, bathrooms, monthlyRent);
 
    }
    public static void processData(Apartment[] apartmentList, int bedrooms, int bathrooms, double monthlyRent) {
        int counter = countApartments(apartmentList, bedrooms, bathrooms, monthlyRent);  
        System.out.println("There are " + counter + " apartments that meet your search criteria.");
        for (Apartment aptSearch : apartmentList) {
            if (aptSearch.getBedrooms() >= bedrooms && aptSearch.getBathrooms() >= bathrooms && aptSearch.getMonthlyRent() <= monthlyRent ) {
                System.out.printf("Apartment " + aptSearch.getAptNumber() + " is available with " + aptSearch.getBedrooms() +
                " bedrooms and " + aptSearch.getBathrooms() + " bathrooms. It will cost you $%,.2f", aptSearch.getMonthlyRent());
                System.out.print(" per month.\n");
                counter ++;
            }
        }
    }
    public static int countApartments(Apartment[] apartmentList, int bedrooms, int bathrooms, double monthlyRent) {
        int counter = 0;
        for (Apartment aptSearch : apartmentList) {
            if (aptSearch.getBedrooms() >= bedrooms && aptSearch.getBathrooms() >= bathrooms && aptSearch.getMonthlyRent() <= monthlyRent ) {
                counter++;
            }
         }
        return counter;
    }
}
