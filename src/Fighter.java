public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    void hit(Fighter target){
        System.out.println(this.name+" "+this.damage+" hasar verdi.");
        if (target.isDodge()){
            System.out.println(target.name+" gelen hasarı savurdu !");
        }
        else if (target.health-this.damage<0){
            target.health=0;
        } else{
            target.health-=this.damage;
        }
    }

    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber<=this.dodge;
    }
}
