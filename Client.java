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

import java.io.*;
import java.rmi.*;
class Client
{
public static void main (String [] argv) throws IOException
{
 if(argv.length != 2){
 System.out.println("Usage : java Client <nombre> <operation>");
 System.exit(1);
 }
// operation = 1: credit, 2: dedit
 System.setSecurityManager(new RMISecurityManager());

 double valeur = Double.parseDouble(argv[0]);
 int operation = Integer.parseInt(argv[1]);

 try {
 CompteInterface cpt= (CompteInterface) Naming.lookup
("rmi://machine_serveur.cnam.fr:1099/gestionCourant"); 
         if (operation==1) cpt.crediter(20000);
 if (operation ==2) cpt.debiter(50000);
 System.out.println ("Votre solde courant = " +
cpt.lire_solde() + " euros");


 }catch (Exception e) {
 System.out.println("Erreur d'acces a un objet distant");
 System.out.println(e.toString());
 }
 }
} 
