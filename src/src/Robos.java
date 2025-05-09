public class Robos {

    private  int identificacaoRobo;
    private  String estadoRobo;  // "desligado", "ligado", "andando", "parado"
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;


    public Robos(int identificacaoRobo, int limitePo) {
        this.identificacaoRobo = identificacaoRobo;
        this.estadoRobo = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        estadoRobo = "ligado";
        System.out.println("Robô " + identificacaoRobo + " ligado.");
    }
    public void desligar() {
        estadoRobo = "ligado";
        System.out.println("Robô " + identificacaoRobo + " ligado.");
    }

    public void andar(int x, int y) {
        if (!estadoRobo.equals("ligado") && !estadoRobo.equals("andando") && !estadoRobo.equals("parado")) {
            System.out.println("Robô " + identificacaoRobo + " está desligado. Ligue-o antes de andar.");
            return;
        }
        posicaoX += x;
        posicaoY += y;
        estadoRobo = "andando";
        System.out.println("Robô " + identificacaoRobo + " andou para a posição (" + posicaoX + ", " + posicaoY + ").");
    }

    public void aspirar(int quantidadePo) {
        if (!estadoRobo.equals("ligado") && !estadoRobo.equals("andando") && !estadoRobo.equals("parado")) {
            System.out.println("Robô " + identificacaoRobo + " está desligado. Ligue-o antes de aspirar.");
            return;
        }

        if (quantidadePo + quantidadePo >= limitePo) {
            quantidadePo = limitePo;
            desligar();
            System.out.println("Robô " + identificacaoRobo + " atingiu o limite de pó e foi desligado.");
        } else {
            quantidadePo += quantidadePo;
            System.out.println("Robô " + identificacaoRobo + " aspirou " + quantidadePo + " unidades de pó.");
        }
    }

    public void parar() {
        if (!estadoRobo.equals("ligado") && !estadoRobo.equals("andando")) {
            System.out.println("Robô " + identificacaoRobo + " está desligado. Ligue-o antes de parar.");
            return;
        }
        estadoRobo = "parado";
        System.out.println("Robô " + identificacaoRobo + " está parado.");
    }

    @Override
    public String toString() {
        return "Robô #" + identificacaoRobo +
                " | Status: " + estadoRobo +
                " | Posição: (" + posicaoX + ", " + posicaoY + ")" +
                " | Pó: " + quantidadePo + "/" + limitePo;
    }
}




