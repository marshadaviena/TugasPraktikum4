/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Bangunruang {
    double s, p, l, t;
    
    public Bangunruang (double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
}
    public Bangunruang (double s){
        this.s = s;
    }
    public double VolumeKubus(){
        return s * s * s;
    }
    public double VolumeBalok(){
        return p * l * t;
    }
    public double LuasPermukaanKubus(){
        return 6 * s;
    }
    public double LuasPermukaanBalok(){
        return 2*(p * t) + (1 * t);
    }
}
