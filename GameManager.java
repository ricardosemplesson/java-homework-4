package Users;

public class GameManager implements GameService {
  public void add(Game game) {
    System.out.println(
        "Game added :"
            + game.getName()
            + "\t"
            + "\t"
            + game.getPrize()
            + "\t"
            + "\t"
            + game.getNumber());
  }

  public void update(Game game) {
    System.out.println("Game updated :" + game.getName());
  }

  public void remove(Game game) {
    System.out.println("Game removed :" + game.getName());
  }
}
