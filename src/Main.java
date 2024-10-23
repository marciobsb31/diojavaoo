public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        System.out.println("**** EXTRATO CONTA CORRENTE ****");
        cc.imprimirExtrato();
        System.out.println("**** EXTRATO CONTA POPANÇA ****");
        poupanca.imprimirExtrato();


    }
}