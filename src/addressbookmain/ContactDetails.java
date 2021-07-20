package addressbookmain;

public class ContactDetails {
    public static void main(String[] args){
        System.out.println("Welcome To Address Book System");
        Contact person = new Contact();

        person.setFirstName("Rohit");
        person.setLastName("Patro");
        person.setAddress("Bijipur");
        person.setCity("Berhampur");
        person.setState("Odisha");
        person.setZip(760001);
        person.setPhoneNumber("8249632998");
        person.setEmail("rohitpatro6@gmail.com");

        System.out.println(person);
    }
}

