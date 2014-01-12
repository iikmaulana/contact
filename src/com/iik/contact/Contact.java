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
public class Contact {
    String nomer;
    private String nama;
    public Contact(String nama,String nomer){
        this.nama = nama;
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    public void setContact(String nama,String nomer){
        this.nama = nama;
        this.nomer = nomer;
    }
    public void printContact(){
        System.out.println("nama : " + this.nama + 
                "\nNomer : " + this.nomer);
    }
    
 }