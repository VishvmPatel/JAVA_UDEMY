class HondaCity {
    static long price = 10_00_000; // Assuming price is in rupees (e.g., 10 lakhs)
    int a, b;

    // Static method to calculate on-road price based on city
    static double OnRoadPrice(String city) {
        switch (city) {
            case "Delhi":
                return price + price * 0.1; // Adding 10% tax for Delhi
            case "Mumbai":
                return price + price * 0.09; // Adding 9% tax for Mumbai
            case "Bangalore":
                return price + price * 0.12; // Adding 12% tax for Bangalore
            case "Chennai":
                return price + price * 0.08; // Adding 8% tax for Chennai
            default:
                System.out.println("City not available. Returning base price.");
                return price; // Return base price if city is not found
        }
    }
}
public class StaticMembersAndMethodsExample{
    public static void main(String[] args) {
        // Testing the OnRoadPrice method for different cities
        String city1 = "Delhi";
        String city2 = "Mumbai";
        String city3 = "Chennai";
        String city4 = "Pune";

        System.out.println("On-road price in " + city1 + ": " + HondaCity.OnRoadPrice(city1));
        System.out.println("On-road price in " + city2 + ": " + HondaCity.OnRoadPrice(city2));
        System.out.println("On-road price in " + city3 + ": " + HondaCity.OnRoadPrice(city3));
        System.out.println("On-road price in " + city4 + ": " + HondaCity.OnRoadPrice(city4));
    }
}
