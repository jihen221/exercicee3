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
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface CompteInterface extends java.rmi.Remote
{
 void debiter(double montant)
 throws java.rmi.RemoteException;
 void crediter(double montant)
 throws java.rmi.RemoteException;
 double lire_solde()
 throws java.rmi.RemoteException;
}; 
