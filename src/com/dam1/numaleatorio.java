package com.dam1;


import javax.swing.*;
import java.util.Random;

public class numaleatorio {

 Random aleatorio = new Random();

 public void amosarNumAleatorio(){

  int [] numeros = new int[6];
  for (int posicion=0;posicion<numeros.length;posicion++){
   int num = aleatorio.nextInt(51);

   numeros[posicion]=num;
   JOptionPane.showMessageDialog(null, numeros[posicion]);
  }
 }
 }








