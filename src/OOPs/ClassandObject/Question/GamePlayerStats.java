package OOPs.ClassandObject.Question;

class Player{
     int playerId;
     int score;
     int level;
     int health;
    int maxHealth;
     Player(int playerId){
          this.playerId = playerId;
          this.score= 0 ;
          this.level = 1;
          this.maxHealth = 100;
          this.health = maxHealth;

     }
     void increaseScore(int points){
         score = score + points;
         System.out.println(score);
     }
     void takeDamage(int damage){
          health = health - damage;
         System.out.println(health);
     }
    void heal(int healPoints) {
         health = health + healPoints;
        System.out.println(health);
    }

    void levelUp() {
         level++;
        System.out.println(level);
    }
     boolean isAlive(){
             return health > 0;
         }
    }


public class GamePlayerStats {
    public static void main(String[] args) {
        Player p1 = new Player(1);

        p1.increaseScore(50);
        p1.takeDamage(30);
        p1.heal(20);
        p1.levelUp();

        System.out.println("Is Alive: " + p1.isAlive());
    }

}
