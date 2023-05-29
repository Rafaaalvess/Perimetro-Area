
package atividade2leonardo;
import java.util.Scanner;
public class Atividade2Leonardo {

    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String Metodo;
            System.out.println("Quer calcular Circulo, Poligono ou Hexagono");
            String Forma = ler.next();
            
            
            switch(Forma){
                
                
                case "Circulo":
                    System.out.println("Digite o raio do circulo");
                    double raioCirculo = ler.nextDouble();
                    Circulo circulo = new Circulo(raioCirculo);                    
                    System.out.println("Deseja calcular Area ou Perimetro");
                    Metodo = ler.next();
                    switch(Metodo){
                        case "Perimetro":
                            System.out.println("O perimetro do circulo e: " + circulo.circuloPerimetro(raioCirculo));
                            break;
                        case "Area":
                            System.out.println("A area do circulo e: " + circulo.circuloArea(raioCirculo));
                            break;
                    }
                    
                    
                case "Hexagono":
                    System.out.println("Digite o raio do hexagono");
                    double raioHexagono = ler.nextDouble();
                    System.out.println("Digite o tamanho do lado do hexagono");
                    double ladoHexagono = ler.nextDouble();                   
                    Hexagono hexagono = new Hexagono(ladoHexagono, raioHexagono);                    
                    System.out.println("Deseja calcular Area ou Perimetro");
                    Metodo = ler.next();     
                    switch(Metodo){
                        case "Perimetro":
                            System.out.println("O perimetro do hexagono e: " + hexagono.hexagonoPerimetro(ladoHexagono));
                            break;
                        case "Area":
                            System.out.println("A area do hexagono e: " + hexagono.hexagonoArea(ladoHexagono, raioHexagono));
                            break;
                    }          
                    
                    
                    
                case "Poligono":
                    System.out.println("Digite o raio do poligono");
                    double raioPoligono = ler.nextDouble();        
                    System.out.println("Quantos lados tem?");
                    int ladoPoligono = ler.nextInt();
                    double ladosPoligono[] = new double[ladoPoligono];
                    System.out.println("Fale qual o tamanho de cada lado");
                    for(int i = 0; i<ladoPoligono ;i++){
                        ladosPoligono[i] = ler.nextDouble();
                    }
                    System.out.println("Deseja calcular Area ou Perimetro");
                    Metodo = ler.next();     
                    Poligono poligono = new Poligono(ladoPoligono,raioPoligono, ladosPoligono);
                    switch(Metodo){
                        case "Perimetro":
                            System.out.println("O perimetro do Poligono e: " + poligono.poligonoPerimetro());
                            break;
                        case "Area":
                            System.out.println("A area do poligono e: " + poligono.poligonoArea());
                            break;
                    }
            }
    }
    
}
