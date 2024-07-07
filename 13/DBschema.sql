USE db_name;
INSERT INTO Quadrilaterals (id, x1, y1, x2, y2, x3, y3, x4, y4)
VALUES (1, 0, 0, 2, 0, 2, 1, 0, 1);
INSERT INTO Trapezoids (x1, y1, x2, y2, x3, y3, x4, y4)
VALUES (1, 1, 3, 1, 4, 3, 0, 3);
CREATE TABLE Quadrilaterals (
                                id INT PRIMARY KEY AUTO_INCREMENT,
                                x1 INT,
                                y1 INT,
                                x2 INT,
                                y2 INT,
                                x3 INT,
                                y3 INT,
                                x4 INT,
                                y4 INT
);
CREATE TABLE Trapezoids (
                                id INT PRIMARY KEY,
                                x1 INT,
                                y1 INT,
                                x2 INT,
                                y2 INT,
                                x3 INT,
                                y3 INT,
                                x4 INT,
                                y4 INT
);