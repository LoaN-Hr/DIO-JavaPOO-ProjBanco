package Banco.ContasBancarias;

public class Interacao {
    public static void main(String[] args) {
        Cliente loan = new Cliente();
        loan.setNome("loan");

        Conta cc = new ContaCorrente(loan);
        cc.depositar(400);
        
        Conta cp = new ContaPoupanca(loan);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
