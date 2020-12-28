/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp;

/**
 *
 * @author ASUS
 */
import java.rmi.*;
import java.rmi.server.*;
public class Serveur {
public static void main(String[] args)
{
 try {
 System.out.println("Serveur : Construction de l’implémentation");
 gestion cpt= new gestion(15.50);
 System.out.println("Objet gestion enregistré dans RMIregistry");
 Naming.rebind("rmi://machine.cnam.fr:1099/CompteCourant",
cpt);

 System.out.println("Attente des invocations des clients ");
 }
 catch (Exception e) {
 System.out.println("Erreur de liaison de l'objet gestion");
 System.out.println(e.toString());
 }
} // fin du main
} // fin de la classe 
