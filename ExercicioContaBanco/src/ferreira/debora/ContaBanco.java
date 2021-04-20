package ferreira.debora;

public class ContaBanco {
    public int numeroConta;
    protected Tipos tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void resultados () {
        System.out.println(numeroConta);
        System.out.println(tipo);
        System.out.println(dono);
        System.out.println(saldo);
        System.out.println(status);
    }
    public void abrirConta(){
        status = true;
        if (tipo == Tipos.CONTA_CORRENTE){
            this.saldo = 50;
        } else if (tipo == Tipos.CONTA_POUPANCA) {
            this.saldo = 150;
        }
    }
    public void fecharConta(){
        if(status == true && saldo == 0) {
            System.out.println("Feechando Conta");
        } else {
            System.out.println("Nao e possivel fechar a conta");
        }
    }
    public void depositar(double valor){
        if (status == true) {
            this.saldo = saldo + valor;
            System.out.println("Depositando: " + valor);
        }
    }
    public void sacar(double valor){
        if (status == true && valor <= saldo){
            this.saldo = saldo - valor;
            System.out.println("Sacando: " + valor);
        } else {
            System.out.println("Não foi possivel sacar esse valor");
        }
    }
    public void pagarMensal(){
        if (tipo == Tipos.CONTA_CORRENTE) {
            this.saldo = saldo-12;
        } else if (tipo == Tipos.CONTA_POUPANCA){
            this.saldo = saldo-20;
        }
    }
}
