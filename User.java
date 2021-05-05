package Users;

public class User {
  private String firstname;
  private String lastname;
  private String birthdaydate;
  private int id;

  public User() {
    
  }

  public User(String firstname, String lastname, String birthdaydate, int id) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthdaydate = birthdaydate;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstname;
  }

  public void setFirstName(String firstname) {
    this.firstname = firstname;
  }

  public String getLastName() {
    return lastname;
  }

  public void setLastName(String lastname) {
    this.lastname = lastname;
  }

  public String getBirthdayDate() {
    return birthdaydate;
  }

  public void setBirthdayDate(String birthdaydate) {
    this.birthdaydate = birthdaydate;
  }
}
