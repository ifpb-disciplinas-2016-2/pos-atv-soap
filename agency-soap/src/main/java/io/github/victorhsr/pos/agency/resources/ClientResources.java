/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.resources;

import io.github.victorhsr.pos.agency.business.ClientManager;
import io.github.victorhsr.pos.agency.entities.Client;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@WebService(serviceName = "cliente")
@Stateless
public class ClientResources {

    @EJB
    private ClientManager clientManager;

    @WebResult(name = "clients")
    public List<Client> getClients() {
        return clientManager.getAll();
    }

    @Oneway
    public void createClient(@WebParam(name = "client") Client client) {
        clientManager.persistClient(client);
    }

    @WebResult(name = "client")
    public Client getClient(@WebParam(name = "clientId") int id) {
        return clientManager.getClient(id);
    }

    @Oneway
    public void updateClient(@WebParam(name = "client") Client client) {
        clientManager.updateClient(client);
    }

    @Oneway
    public void excludeClient(@WebParam(name = "client") Client client) {
        clientManager.excludeClient(client);
    }

}
