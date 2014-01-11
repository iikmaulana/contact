/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iik.contact;

/**
 *
 * @author maulana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Contact contact = new Contact();
        for (a=1; a<21; a++){
            contact.setContact("akio" + a, "23890128391" + a);
            contact.printContact();
        }
//        contact.setNama("iik");
//        contact.setNomer("083084038430");
//        contact.printContact();
//        contact.setContact("Tuwuh", "0192839201");
//        contact.printContact();
//        contact.setContact("akao", "02934839080");
//        contact.printContact();
//        
//        
//        Contact contact2 = new Contact();
//        contact2.setNama("maulana");
//        contact2.setNomer("09823849032");
//        System.out.println(contact2.getNama() + ":" + contact2.getNomer());
//        Contact contact3 = new Contact();
//        contact3.setNama("Ubay");
//        contact3.setNomer("20239249482");
//        contact3.printContact();
//        Contact contact4 = new Contact();
//        contact4.setNama("Oni");
//        contact4.setNomer("30239489023");
//        System.out.println(contact4.getNama() + ":" + contact4.getNomer());
//        Contact contact5 = new Contact();
//        contact5.setNama("Alik");
//        contact5.setNomer("029349203920");
//        contact5.printContact();
//        Contact contact6 = new Contact();
        
        // TODO code application logic here
    }
    
}
