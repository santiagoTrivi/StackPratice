/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackpractice;

/**
 *
 * @author Carvajal-Triviño
 */
class Nodo{
    String nombre;
    String apellido;
    int id;
    Nodo next;
    
    Nodo(String nombre, String apellido, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
}
public class StackPractice {
    Nodo top;
    int size;
    StackPractice(){
        this.top = null;
    }
    public void push(String dato1 , String dato2 , int dato3){
        Nodo newnodo = new Nodo(dato1, dato2, dato3);
        newnodo.next = top;
        this.top = newnodo;
    }
    public void peek(){
        System.out.println(top.nombre + " " +  top.apellido + " " + top.id + " ");

    }

    public void pop(){
        System.out.println(top.nombre + " " +  top.apellido + " " + top.id + " ");
        Nodo temp = top;
        this.top = top.next;
        temp.next = null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
