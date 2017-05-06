    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.business;

import io.github.victorhsr.pos.agency.entities.Client;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@Stateless
public class ClientManager {

    @PersistenceContext(unitName = "agency_PU")
    private EntityManager em;

    public List<Client> getAll() {
        return em.createNativeQuery("SELECT * FROM Client", Client.class).getResultList();
    }

    public void persistClient(Client client) {
        em.merge(client);
    }

    public Client getClient(int id) {
        return em.find(Client.class, id);
    }

    public void updateClient(Client client) {
        em.merge(client);
    }

    public void excludeClient(Client client) {
        em.remove(em.merge(client));
    }
}
