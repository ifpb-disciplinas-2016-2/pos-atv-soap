/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.resources;

import io.github.victorhsr.pos.agency.entities.Package;
import io.github.victorhsr.pos.agency.business.PackageManager;
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
@WebService(serviceName = "pacote")
@Stateless
public class PackageResources {

    @EJB
    private PackageManager packageManager;

    @WebResult(name = "packages")
    public List<Package> getPackages() {
        return packageManager.getAll();
    }

    @Oneway
    public void createPackage(@WebParam(name = "package") Package myPackage) {
        System.out.println("criando"+myPackage);
        packageManager.persistPackage(myPackage);
    }

    @WebResult(name = "package")
    public Package getPackage(@WebParam(name = "packageId") int id) {
        return packageManager.getPackage(id);
    }

    @Oneway
    public void updatePackage(@WebParam(name = "package") Package myPackage) {
        packageManager.atualizarPacote(myPackage);
    }

    @Oneway
    public void excludePackage(@WebParam(name = "package") Package myPackage) {
        packageManager.excludePackage(myPackage);
    }

}
