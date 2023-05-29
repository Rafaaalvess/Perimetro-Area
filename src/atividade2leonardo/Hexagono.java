package atividade2leonardo;

public class Hexagono{
    
    public double lado;
    public double raio;

    public Hexagono(double lado, double raio){
        this.lado = lado;
        this.raio = raio;
    }

    public double hexagonoPerimetro(double lado){
        double perimetro = 6 * lado;
        return perimetro;
        
    }
    
        public double hexagonoArea(Double lado, double raio){
        double area = 3 * (6 * lado) * raio;
        return area;
    }
}
