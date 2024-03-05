/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasgalvin;

/**
 *
 * @author LENOVO LEGION
 */
public class Anjing extends Hewan{

    public Anjing(){
        System.out.println("Saya anjing guguk");
    }
    
    @Override
    public void kondisihewan(){
        System.out.println("Sedikit sakit");
    }
    
    @Override
    public void suara(){
        System.out.println("Guk Guk");
    }
    
    @Override
    public void caraberjalan(){
        System.out.println("berjalan");
    }
    
}
