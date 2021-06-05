public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Emre",15,198,90,100);
        Fighter f2 = new Fighter("Hakan",20,200,120,0);
        Match match = new Match(f1, f2, 80,140);
        match.run();
    }
}
