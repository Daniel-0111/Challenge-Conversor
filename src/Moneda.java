public class Moneda {

    private String name;
    private double Valor;


    public String getName() {
        return name;
    }

    public double getValor() {
        return Valor;
    }


    @Override
    public String toString() {
        return "moneda=" + name + ", Valor=" + Valor ;
    }

}
