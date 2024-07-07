/*
Четырехугольники. В БД хранятся координаты вершин выпуклых четырехугольников на плоскости.
• Вывести координаты вершин параллелограммов.
• Вывести координаты вершин трапеций.
*/

public class Main {
    public static void main(String[] args) {
        DataModifier.updateCoordinates(1, 0, 0, 2, 0, 2, 1, 0, 1);
        DataModifier.updateCoordinates1(1, 1, 1, 1, 1, 4, 1, 3, 3);
        QueryExecutor.getParallelogramsCoordinates(); // Рабочая комбинация x1 = x4, x2 = x3, y1 = y2, y3 = y4
        QueryExecutor.getTrapezoidsCoordinates(); //Рабочая комбинация (x1 = x2 и x3 <> x4) или (x1 <> x2 и x3 = x4)
    }
}
