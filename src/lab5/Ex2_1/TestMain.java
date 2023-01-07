package Ex2_1;

public class TestMain {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        //Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'k');
        if (ahTeck.getGender() != 'm' || ahTeck.getGender() != 'f'){
            System.out.println("nhap lai gioi tinh theo m hoac f");
        }else {
            System.out.println(ahTeck);
            ahTeck.setEmail("paulTan@nowhere.com");
            System.out.println("name is: " + ahTeck.getName());
            System.out.println("eamil is: " + ahTeck.getEmail());
            System.out.println("gender is: " + ahTeck.getGender());
        }
    }
}
