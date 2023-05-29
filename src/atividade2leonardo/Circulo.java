package atividade2leonardo;

public class Circulo {
    
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double circuloArea(Double raio){
        double area = 3.14 * (raio *raio);
        return area;
    }
    public double circuloPerimetro(double raio){
        double perimetro =  2 * 3.14 * raio;
        return perimetro;
    }
}
