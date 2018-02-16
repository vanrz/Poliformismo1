
package polimorfismo;

public class Principal {
    
    public static  void main (String[] args){
        //punto de entrada al programa
        Perro firulais, rocky;
        firulais=new Perro();
        rocky=new Perro();
        Canmisario rex;
        rex=new Canmisario();
        
        for(int i=1;i<10;i++){
            firulais.ladrar();
            
        }
        if(rex.detectedNarcoticos()==true){
            rex.ladrar(1);
            
        }
        else{
            rex.ladrar();
        }
        rocky.ladrar(0);
        firulais.ladrar(0);
        rocky.ladrar(0);
        firulais.ladrar(0, 0);
        
    }
    
}
