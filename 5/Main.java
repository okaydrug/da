/*
Создать класс Программа Передач с внутренним классом, с помощью
объектов которого можно хранить информацию о названии телеканалов
и программ.
*/

public class Main {
    public static void main(String[] args) {
        prog_guide prog1 = new prog_guide("Первый канал");
        prog_guide.television prog1_1 = prog1.new television("Новости");
        prog1_1.show_info();

        prog_guide prog2 = new prog_guide("СТС");
        prog_guide.television prog2_2 = prog2.new television("Фильмы");
        prog2_2.show_info();
    }
}
class prog_guide {
    private String name_channel;
    prog_guide(String name_channel) {
        this.name_channel = name_channel;
    }
    class television {
        private String name_program;
        television(String name_program) {
            this.name_program = name_program;
        }
        void show_info(){
            System.out.println("Телеканал: " + name_channel);
            System.out.println("Программа: " + name_program);
        }
    }
}



