/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AOUGASSA VIGNO
 */

    public class Point{
float abscisse;
    float ordonnee;
    //constructeur par defaut
    public Point(){
        abscisse=0;
        ordonnee=0;
    }
    //constructeur d'initialisation
    public Point(float a, float b){
        this.abscisse=a;
        this.ordonnee=b;  
    }
    //accesseurs
    public float getAbscisse(){
        return this.abscisse;
    }
    public float getOrdonnee(){
        return this.ordonnee;
    }
    //modifieur
    public void setAbscisse(float a){
        this.abscisse=a;
    }
    public void setOrdonnee(float b){
        this.ordonnee=b;
    }
    //methodes
    public float  Distance(Point X, Point Y){
               return Math.sqrt(X*X+Y*Y);
        
    }
    public static void main(String[] args) {

        Point p = new Point(2, 3);
        p.Distance(2, 3);
