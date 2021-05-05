package Users;

public class Game {

  private String gamename;
  private int prize;
  private int number;

  public Game() {
    
  }

  public Game(String gamename, int prize, int number) {
    super();
    this.gamename = gamename;
    this.prize = prize;
    this.number = number;
  }

  public String getName() {
    return gamename;
  }

  public void setName(String gamename) {
    this.gamename = gamename;
  }

  public int getPrize() {
    return prize;
  }

  public void setPrize(int prize) {
    this.prize = prize;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
