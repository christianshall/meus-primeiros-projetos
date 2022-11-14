import java.util.Random;

public class Treta {
    // atributos
    private Briga desafiado;
    private Briga desafiante;
    private int rounds;
    private boolean aprovada;


    //métodos públicos
    public void marcarLuta(Briga lutador1, Briga lutador2) {
        // Lutador A tem a mesma categoria que B? e lutador A é diferente que lutador B
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();


            Random aleatory = new Random();
            int vencedor = aleatory.nextInt(3);// 0 1 2
            System.out.println("========= RESULTADO DA LUTA ==========");
            switch (vencedor) {
                case 0: // empate]
                    System.out.println("empatou !!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:  // desafiado vence
                    System.out.println("Vitoria do " +  this.desafiado.getName());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // desafiante vence
                    System.out.println(" Vitoria do " + this.desafiante.getName());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;


            }
            System.out.println("=======================================");


        } else {
            System.out.println("A luta nao pode acontecer !");
        }
    }
}

