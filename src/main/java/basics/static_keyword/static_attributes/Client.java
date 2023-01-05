package basics.static_keyword.static_attributes;

public class Client {
    private String name;
    static int clientsAmount = 0;

    public Client(String name) {
        this.name = name;

        clientsAmount++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
