import java.sql.*;
public class Main {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private static final String USERNAME = "hr";
    private static final String PASSWORD = "dbpword";
    public static void main(String[] args){

        GsonParser parser = new GsonParser();
        System.out.println("ВВЕДИТЕ ПОЛНОЕ ИМЯ ФАЙЛА");
        Root root = parser.parse();
        System.out.println("Root"+ root.toString());

        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("УСТАНОВЛЕНО СОЕДИНЕНИЕ С БД");
            }

            for(Library item: root.getLibrary() ){

                PreparedStatement statement = connection.prepareStatement("INSERT INTO libraries(name_library, address, email, phone) VALUES ((?), (?), (?), (?))");
                statement.setString(1, item.getName());
                statement.setString(2, item.getAddress());
                statement.setString(3, item.getEmail());
                statement.setString(4, item.getPhone());
                statement.executeUpdate();

                for(Book item2: item.getBooks() ){

                    PreparedStatement statement2 = connection.prepareStatement("INSERT INTO books(name_book, cnt_book) VALUES ((?), (?))");
                    statement2.setString(1, item2.getName());
                    statement2.setLong(2, item2.getCnt());
                    statement2.executeUpdate();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("ИНФОРМАЦИЯ О КНИГАХ И БИБЛИОТЕКАХ УСПЕШНО СОХРАНЕНА В БД");
    }
}