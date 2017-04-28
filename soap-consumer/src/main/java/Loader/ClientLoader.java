/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import io.github.victorhsr.pos.soap.consumer.Client;
import io.github.victorhsr.pos.soap.consumer.ClientResources;
import io.github.victorhsr.pos.soap.consumer.Cliente;
import java.util.List;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class ClientLoader {

    private final ClientResources clientService = new Cliente().getClientResourcesPort();

    public List<Client> getAll() {
        return clientService.getClients();
    }

    public void createClient(Client client) {
        clientService.createClient(client);
    }

    public Client getClient(int id) {
        return clientService.getClient(id);
    }

    public void updateClient(Client client) {
        clientService.updateClient(client);
    }

    public void excludeClient(Client client) {
        clientService.excludeClient(client);
    }

}
