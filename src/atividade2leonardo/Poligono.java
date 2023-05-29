package atividade2leonardo;

public class Poligono{


    public int lados;
    public double[] lado; 
    public double raio;

    public Poligono(int lados, double raio, double[] lado){
        this.lados = lados;
        this.lado = lado;
        this.raio = raio;
    }

    public  double poligonoPerimetro(){
        double perimetro = 0;
        for(int i = 0; i < lados; i++){
            perimetro += lado[i] ;
        }
        return perimetro;
            
  }
      public double poligonoArea(){
        double perimetro = poligonoPerimetro();
        double area = (perimetro * raio) / 2;
        return area;
      }
      
}
