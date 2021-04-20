package ferreira.debora;

public class GerenciadoDeConta {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.tipo = Tipos.CONTA_POUPANCA;
        conta.setDono("Rock Lee");
        conta.numeroConta = 1001;

        conta.abrirConta();
        conta.pagarMensal();
        conta.depositar(100);
        conta.sacar(200);

        conta.fecharConta();
        conta.resultados();

    }

}
