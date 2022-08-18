
public class Motor {

    int id;
    //Atributos
    Motor eletrico;
    int tensaoVolt;
    double velocidadeKMh;

    int tensaoAplicada;
    double temperatura;

    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
                ", eletrico=" + eletrico +
                ", tensaoVolt=" + tensaoVolt +
                ", velocidadeKMh=" + velocidadeKMh +
                ", tensaoAplicada=" + tensaoAplicada +
                ", temperatura=" + temperatura +
                '}';
    }

    public Motor(int id) {
        this.id = id;

    }

    //Metodos da classe
    public void setTemperatura() {
        System.out.print("Temperatura é " + this.temperatura);
    }

    public void alterarVelocidade(int vlc) {
        this.velocidadeKMh = this.velocidadeKMh + vlc;

    }   // arquivo pricipal main

    public void main(String[] args) {
        Motor motor1 = new Motor(1);
        motor1.velocidadeKMh = 10.0;
        motor1.tensaoAplicada = 70;
        motor1.temperatura = 45.0;

        System.out.println(motor1.toString());

    }

}