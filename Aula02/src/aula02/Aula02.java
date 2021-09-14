package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // instanciando um objeto
        
        //aqui mexo nos atributos
        c1.cor = "azul"; 
        c1.ponta = 0.5f;
        
        // mexo nos atributos
        c1.tampada();
        c1.rabiscar();
        
        //objeto 2
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        
        c2.destampar();
        c2.rabiscar();
        
        //obj 3
        Caneta c3 = new Caneta();
        c3.modelo = "Faber";
        c2.cor = "Amarela";
        c3.carga = 10;
        
        c3.destampar();
        c3.rabiscar();
        c3.status();
        
        
                
    }
    
}
