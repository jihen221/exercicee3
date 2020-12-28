  
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
import java.rmi.server.*;
public class gestion  extends java.net.UnknownHostException implements CompteInterface
{
 private double solde;
 public gestion (double s) throws java.rmi.RemoteException
 {
 super();
 solde=s;
 }

 public void crediter(double montant)
 throws java.rmi.RemoteException
 {
 solde=solde+montant;
 }
 public void debiter(double montant)
 throws java.rmi.RemoteException
 {
 solde=solde-montant;
 }
 public double lire_solde()
 throws java.rmi.RemoteException
 {
 return solde;
 }
} 
