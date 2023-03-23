package exercicios.pessoas;

public class pessoa {
    private String nome;
    private int idade;
    private float peso;
    private Double altura;
    public pessoa(String nome, int idade, float peso, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
    }
        public void envelhecer(int anos) {
                this.idade += anos;
                if (this.idade < 21)
                        crescer(0.05);
    }
        public void engordar(float peso) {
                this.peso += peso;
    }
        public void emagrecer(float peso) {
                this.peso -= peso;
    }
         public void crescer(double crescer) {
                this.altura += crescer;
    }

    public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" +
    altura + "]";
    }
    public static void main(String[] args) {
    pessoa pes = new pessoa("minha pessoa", 16, 43, 1.65);
    System.out.println(pes.toString());
    pes.envelhecer(1);
    System.out.println(pes.toString());
    pes.envelhecer(1);
    System.out.println(pes.toString());
    pes.envelhecer(1);
    System.out.println(pes.toString());
    pes.envelhecer(1);
    System.out.println(pes.toString());
    pes.envelhecer(1);
    }
    }
