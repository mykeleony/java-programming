package basics.static_keyword.static_attributes;

public class ClientTest {
    public static void main(String[] args) {
        Client last = null;

        for(int i = 0; i < 15; i++)
            last = new Client("Client number " + (i + 1));

        System.out.println("Last client: " + last + "\nTotal clients: " + Client.clientsAmount);
    }
}
