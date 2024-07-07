import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataModifier {
    public static void updateCoordinates(int id, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Quadrilaterals SET x1 = ?, y1 = ?, x2 = ?, y2 = ?, x3 = ?, y3 = ?, x4 = ?, y4 = ? WHERE id = ?")) {
            preparedStatement.setInt(1, x1);
            preparedStatement.setInt(2, y1);
            preparedStatement.setInt(3, x2);
            preparedStatement.setInt(4, y2);
            preparedStatement.setInt(5, x3);
            preparedStatement.setInt(6, y3);
            preparedStatement.setInt(7, x4);
            preparedStatement.setInt(8, y4);
            preparedStatement.setInt(9, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Координаты успешно обновлены!");
            } else {
                System.out.println("Не удалось обновить координаты.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateCoordinates1(int id, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Trapezoids SET x1 = ?, y1 = ?, x2 = ?, y2 = ?, x3 = ?, y3 = ?, x4 = ?, y4 = ? WHERE id = ?")) {
            preparedStatement.setInt(1, x1);
            preparedStatement.setInt(2, y1);
            preparedStatement.setInt(3, x2);
            preparedStatement.setInt(4, y2);
            preparedStatement.setInt(5, x3);
            preparedStatement.setInt(6, y3);
            preparedStatement.setInt(7, x4);
            preparedStatement.setInt(8, y4);
            preparedStatement.setInt(9, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Координаты успешно обновлены!");
            } else {
                System.out.println("Не удалось обновить координаты.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}