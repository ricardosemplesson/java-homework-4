package Users;

public class CampaignManager implements CampaignService {
  public void add(Campaign campaign) {
    System.out.println(
        "Campaign name : "
            + campaign.getCampaignName()
            + "\ncampaign id :"
            + campaign.getId()
            + "\ndiscount rate :"
            + campaign.getDiscountrate());
  }

  public void update(Campaign campaign) {
    System.out.println("Campaign updated" + campaign.getCampaignName());
  }

  public void remove(Campaign campaign) {
    System.out.println("Campaign removed" + campaign.getCampaignName());
  }
}
