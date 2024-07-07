import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryExecutor {
    public static void getParallelogramsCoordinates() {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Quadrilaterals WHERE x1 = x4 AND x2 = x3 AND y1 = y2 AND y3 = y4")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Координаты параллелограмма:");
                System.out.println("Точка 1: (" + resultSet.getInt("x1") + ", " + resultSet.getInt("y1") + ")");
                System.out.println("Точка 2: (" + resultSet.getInt("x2") + ", " + resultSet.getInt("y2") + ")");
                System.out.println("Точка 3: (" + resultSet.getInt("x3") + ", " + resultSet.getInt("y3") + ")");
                System.out.println("Точка 4: (" + resultSet.getInt("x4") + ", " + resultSet.getInt("y4") + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void getTrapezoidsCoordinates() {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Trapezoids WHERE (x1 = x2 AND x3 <> x4) OR (x1 <> x2 AND x3 = x4)")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Координаты трапеции:");
                System.out.println("Точка 1: (" + resultSet.getInt("x1") + ", " + resultSet.getInt("y1") + ")");
                System.out.println("Точка 2: (" + resultSet.getInt("x2") + ", " + resultSet.getInt("y2") + ")");
                System.out.println("Точка 3: (" + resultSet.getInt("x3") + ", " + resultSet.getInt("y3") + ")");
                System.out.println("Точка 4: (" + resultSet.getInt("x4") + ", " + resultSet.getInt("y4") + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}