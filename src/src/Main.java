//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robos robo1 = new Robos(1, 10);
        Robos robo2 = new Robos(2, 5);

        System.out.println(robo1);
        System.out.println(robo2);

        // Operações com robô 1
        robo1.ligar();
        robo1.andar(2, 3);
        System.out.println(robo1);
        robo1.aspirar(4);
        System.out.println(robo1);
        robo1.parar();
        System.out.println(robo1);
        robo1.desligar();
        System.out.println(robo1);

        System.out.println("\n----------------------\n");

        // Operações com robô 2
        robo2.ligar();
        robo2.andar(1, 1);
        System.out.println(robo2);
        robo2.aspirar(3);
        System.out.println(robo2);
        robo2.aspirar(3); // Vai atingir o limite
        System.out.println(robo2);
    }
}