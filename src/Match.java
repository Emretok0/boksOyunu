import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {

        if (isCheck()) {
            Random random = new Random();
            int x = random.nextInt(2);
            while (f1.health > 0 && f2.health > 0) {
                if (x == 0) {
                    f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                } else {
                    f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                }
                infoHealth();
                System.out.println("----------------------------------------");
            }
        } else {
            System.out.println("Sporcu sikletleri uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return (f1.weight > minWeight && f1.weight < maxWeight) && (f2.weight > minWeight && f2.weight < maxWeight);
    }

    void infoHealth() {
        System.out.println("\n"+f1.name + " Health: " + f1.health);
        System.out.println(f2.name + " Health: " + f2.health);
    }

     boolean isWin() {
         if (f1.health==0){
             System.out.println("Kazanan: "+f2.name);
             return true;
         }
         if (f2.health==0){
             System.out.println("Kazanan: "+f1.name);
             return true;
         }
         return false;
    }
}
