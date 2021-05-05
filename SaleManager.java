package Users;

public class SaleManager  {
  public void add(Sale sale) {
    System.out.println(
        sale.getUserId()
            + " numaralı müşteri"
            + "\n"
            + sale.getGameName()
            + " adlı oyunu "
            + "\n"
            + sale.getCampaignName()            
            + " kampanyası ile "
            + "\n"
            + sale.getSaleDate()
            + " tarihinde satın aldı !!!");
  }

  public void update(Sale sale) {
    System.out.println("Satis guncellendi");
  }

  public void remove(Sale sale) {
    System.out.println("Satis silindi");
  }
}
