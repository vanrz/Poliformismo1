/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiantes
 */
public class Perro {
    void ladrar(){
        System.out.println("Gua Gua");
        
    }
    void ladrar(int rabia){//sobrecarga de metodo
        System.out.println("Grr ayy Grr ayy");
        
    }
    void ladrar(int rabia, int miedo){//sobrecarga de metodo
        System.out.println("Grr ayy Grr ayy");
        
    }
}
