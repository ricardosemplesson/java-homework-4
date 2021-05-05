package Users;

public class Campaign {
  private String campaignname;
  private int id;
  private String discountrate;

  public Campaign() {
    
  }

  public Campaign(String campaignname, int id, String discountrate) {
    super();
    this.campaignname = campaignname;
    this.id = id;
    this.discountrate = discountrate;
  }

  public String getCampaignName() {
    return campaignname;
  }

  public void setCampaignName(String campaignname) {
    this.campaignname = campaignname;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDiscountrate() {
    return discountrate;
  }

  public void setDiscountrate(String discountrate) {
    this.discountrate = discountrate;
  }
}
