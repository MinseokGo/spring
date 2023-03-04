import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//UserDao 추상 클래스
//public abstract class UserDao {
public class UserDao {
    //User 정보를 DB에 추가
    public void add(User user) throws ClassNotFoundException, SQLException {
        //DB 드라이버 로드 및 DB 연결
        Connection c = getConnection();

        //SQL문 생성
        PreparedStatement ps = c.prepareStatement(
                "insert into users(id, name, password) values(?,?,?)");
        ps.setString(1, user.getId());  //여기서 숫자는 바인딩 변수이므로 꼭 숫자값이어야 함
        ps.setString(2, user.getName());    //일종의 인덱스
        ps.setString(3, user.getPassword());

        //만들어진 Statement 실행
        ps.executeUpdate();

        //리소스 반납
        ps.close();
        c.close();
    }
    //user 정보를 id로 조회
    public User get(String id) throws ClassNotFoundException, SQLException {
        //DB 드라이버 로드 및 DB 연결
        Connection c = getConnection();

        //SQL문 생성
        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?");
        ps.setString(1, id);

        //만들어진 Statement 실행
        //DB에서 가져온 결과를 ResultSet에 저장
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        //리소스 반납
        rs.close();
        ps.close();
        c.close();

        //조회 결과 리턴
        return user;
    }
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/user", "minseok", "1234");

        return c;
    }
    //getConnection() 추상 메서드
    /*
    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
    public class NUserDao extends UserDao {
        public Connection getConnection() throws ClassNotFoundException, SQLException { //상속을 통해 확장된 getConnection() 메서드
            //N사 DB 커넥션 생성코드
        }
    }
    public class DUserDao extends UserDao {
        public Connection getConnection() throws ClassNotFoundException, SQLException {
            //D사 DB 커넥션 생성코드
        }
    }*/
}