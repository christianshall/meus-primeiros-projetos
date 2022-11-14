public class Main {
    public static void main(String[]args) {

        Briga lutador1 = new Briga("Peido","vida nova ",24,1.80f,68.9f,1, 2, 1);

        Briga lutador2 = new Briga("Nariz","vila vitoria ",24,1.80f,68.9f,2,1, 3);

        Treta mma = new Treta();
        mma.marcarLuta(lutador1,lutador2);
        mma.lutar();


      //  Briga l[] = new Briga[6];
      //  l[0] = lutador1;

      //  l[1] = new Briga("Putscript ", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

      //  l[2] = new Briga("Snapshadow ", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

      //  l[3] = new Briga("Dead Code ", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);

      //  l[4] = new Briga("UFOCobol ", "Brasil", 37, 1.81f, 105.7f, 12, 2, 4);

      //  l[5] = new Briga("Derdaart ", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

     // Treta UEC01 = new Treta();
     // UEC01.marcarLuta(l)+(l1);
     //  UEC01.lutar();


    }
}
