/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import io.github.victorhsr.pos.soap.consumer.Client;
import io.github.victorhsr.pos.soap.consumer.HotelBooking;
import io.github.victorhsr.pos.soap.consumer.Package;
import io.github.victorhsr.pos.soap.consumer.PackageResources;
import io.github.victorhsr.pos.soap.consumer.Pacote;
import io.github.victorhsr.pos.soap.consumer.Ticket;
import java.util.List;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class PackageLoader {

    private final PackageResources packageResourcesPort = new Pacote().getPackageResourcesPort();

    public List<Package> getAll() {
        return packageResourcesPort.getPackages();
    }

    public void createPackage(Package myPackage) {
        packageResourcesPort.createPackage(myPackage);
    }

    public Package getPackage(int id) {
        return packageResourcesPort.getPackage(id);
    }

    public void updatePackage(Package myPackage) {
        packageResourcesPort.updatePackage(myPackage);
    }

    public void excludePackage(Package myPackage) {
        packageResourcesPort.excludePackage(myPackage);
    }

}
