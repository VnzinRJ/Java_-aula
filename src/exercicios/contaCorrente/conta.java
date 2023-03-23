package exercicios.contaCorrente;

import java.net.PortUnreachableException;

public class conta
{
    private String numero;
    private String nome;
    private double saldo;
    
    public conta(String numero, String nome, double saldo) 
    {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
       public conta(String numero, String nome)
       {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0f;
       }
       public void setNome(String nome){
        this.nome = nome;
       }
       public void depositar(float valor){
        this.saldo += valor;
       }
       public void saque(float valor){
        if(this.saldo <= valor){
        this.saldo -= valor;
       }
    }
  @Override
    public String toString(){
        return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
    }
    public static void main(String[] args) {
        conta con = new conta("321", "la ele", 32.0f);
        System.out.println(con.toString());
        con.setNome("la ele");
        con.depositar(50);
        System.out.println(con.toString());
        con.saque(110);
        System.out.println(con.toString());
}
}

