package flyweight;

/**
 * Created by jolly on 2017/4/23.
 */
public class Teacher extends UserInfo {

    private String tNo;

   public Teacher(String tNo) {
       super();
       this.tNo = tNo;
   }

    public Teacher(String username, String password, long id, String tNo) {
        super(username, password, id);
        this.tNo = tNo;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }
}
