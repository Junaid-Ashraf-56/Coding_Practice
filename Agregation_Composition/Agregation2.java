package Agregation_Composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Player{
  private final String playerName;
  private final int age;
  private final String position;

  Player(String playerName,int age,String position){
   this.playerName = playerName;
   this.age = age;
   this.position = position;
  }
  public void playMatch(){
      System.out.println("Yes");
  }
  public void train(){
      System.out.println("no");
  }
  public String toString(){
      return playerName+ " "+age+" "+position;
  }
}
class Team{
    private final String teamName;
    private final List<Player>players;
    Team(String teamName,List<Player>players){
        this.teamName = teamName;
        this.players = players;
    }
    public void addPlayer(Player p){
        players.add(p);
    }
    public void display(){
        for (Player player:players){
            System.out.println(player + " "+teamName);
        }
    }
}
public class Agregation2 {
    public static void main(String[] args) {
        Player p1 = new Player("Junaid",19,"Batsman");
        Player p2 = new Player("Asad",21,"Batsman");
        Player p3 = new Player("Mohsin",21,"Batsman");
        p1.playMatch();
        p2.train();

        List<Player>players = new ArrayList<>(Arrays.asList(p1,p2));
        Team t1 = new Team("Pakistan",players);
        t1.addPlayer(p3);
        t1.display();
    }

}
