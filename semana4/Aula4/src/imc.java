public class imc {
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws NumberFormatException{
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws NumberFormatException{
        this.altura = altura;
    }

    public double calcularIMC() throws ArithmeticException {
        return this.peso/Math.pow(this.altura,2);
    }
}
