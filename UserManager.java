package Users;

public class UserManager {

  public void add(User user) {
    System.out.println(
        "User added :"
            + user.getFirstName()
            + "\t"
            + user.getLastName()
            + "\t"
            + user.getBirthdayDate()
            + "\t"
            + "\t"
            + user.getId());
  }

  public void update(User user) {
    System.out.println("User updated :" + user.getFirstName());
  }

  public void remove(User user) {
    System.out.println("User removed :" + user.getFirstName());
  }
}
