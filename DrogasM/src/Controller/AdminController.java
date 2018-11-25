/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class AdminController {
    
    public static ArrayList<Admin> admin = new ArrayList<>();

    /**
     * @return the admin
     */
    public static ArrayList<Admin> getAdmin() {
        return admin;
    }

    /**
     * @param aAdmin the admin to set
     */
    public static void setAdmin(ArrayList<Admin> aAdmin) {
        admin = aAdmin;
    }
    
    
    
}
