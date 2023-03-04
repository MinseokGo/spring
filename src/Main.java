import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //JDBC API를 통해 데이터를 저장하고 조회하는 객체 생성
        UserDao dao = new UserDao();

        //DB에 새로운 유저 정보 등록
        User user = new User();
        user.setId("해");
        user.setName("행배");
        user.setPassword("1234");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");

        //DB에 등록한 유저의 정보 조회
        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}