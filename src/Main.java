import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("rhalstjr1999");
        user.setName("행배");
        user.setPassword("1234");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");
    }
}