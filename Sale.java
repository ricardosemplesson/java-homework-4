package Users;

public class Sale {
  private String saledate;
  private int userid;
  private String gamename;
  private String campaignname;

  public Sale() {}

  public Sale(int userid, String gamename, String campaignname, String saledate) {
    super();
    this.saledate = saledate;
    this.userid = userid;
    this.gamename = gamename;
    this.campaignname = campaignname;
  }

  public String getSaleDate() {
    return saledate;
  }

  public void setSaleDate(String saledate) {
    this.saledate = saledate;
  }

  public int getUserId() {
    return userid;
  }

  public void setUserId(int userid) {
    this.userid = userid;
  }

  public String getGameName() {
    return gamename;
  }

  public void setGameName(String gamename) {
    this.gamename = gamename;
  }

  public String getCampaignName() {
    return campaignname;
  }

  public void setCampaignName(String campaignname) {
    this.campaignname = campaignname;
  }
}
