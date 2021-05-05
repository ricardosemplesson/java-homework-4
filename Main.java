package Users;

import Users.Campaign;
import Users.CampaignManager;
import Users.GameManager;
import Users.UserManager;

public class Main {

  public static void main(String[] args) {
  System.out.println("****GAME STORE HOŞGELDİNİZ****"+"\n");
  
  
    GameManager game1 = new GameManager();
    CampaignManager campaign1 = new CampaignManager();
    UserManager user1 = new UserManager();
    SaleManager sale1 = new SaleManager();
    User user = new User("Johnny", "Deep", "15/04/1995", 6);
    user1.add(user);

    System.out.println("---------------" + "\n");
    Game game = new Game("Gta 5", 20, 3);

    game1.add(game);

    System.out.println("---------------" + "\n");
    Campaign campaign = new Campaign("Autumn Campaign", 4, "%50");
    campaign1.add(campaign);
    System.out.println("---------------" + "\n");
    Sale sale = new Sale(6, "Gta 5", "Autumun Campaign", "25/06/2021");
    sale1.add(sale);
  }
}
