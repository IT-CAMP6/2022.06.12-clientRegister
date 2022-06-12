package pl.camp.it.client.register.database;

import org.springframework.stereotype.Component;
import pl.camp.it.client.register.model.Client;

import java.util.ArrayList;
import java.util.List;

@Component
public class DB {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public List<Client> getClients() {
        return this.clients;
    }
}
