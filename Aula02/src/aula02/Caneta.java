package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //MÉTODO
    void status(){ // mosta o estado atual do objeto
        System.out.println("Modelo é " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
        
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    void tampada(){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
        
    }
    
    
    
}
