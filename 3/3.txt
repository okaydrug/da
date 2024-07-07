/*
Вариант А
3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
*/

import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new Patient(1, "Торяшиев", "Жаргал", "Баирович", "ул. Цивилева, д.1", "+71234567890", "123456", "ВЗРЫВНОЙ ПОНОС");

        patients[1] = new Patient(2, "Иванов", "Иван", "Иванович", "ул. Цивилева, д.2", "+79876543210", "654321", "Кашель");

        Patient.func1(patients, "Кашель");
        Patient.func2(patients, 200000, 300000);
    }
}
class Patient {
    int id;
    String surname;
    String name;
    String surname1;
    String address;
    String telephone;
    String medic_book;
    String diagnose;

    public Patient(int id, String surname, String name, String surname1, String address, String telephone, String medic_book, String diagnose){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.surname1 = surname1;
        this.address = address;
        this.telephone = telephone;
        this.medic_book = medic_book;
        this.diagnose = diagnose;
    }
    public static void  func1(Patient[] patients, String diagnose){
        System.out.println("Диагноз пациента: " + diagnose);
        for(Patient patient : patients){
            if (patient.diagnose.equals(diagnose)){
                System.out.println("Пациент: " + patient.name + " " + patient.surname);
            }
        }
    }
    public static void func2(Patient[] patients, int StartRange, int endRange){
        System.out.println("Номер медицинской карты пациента находящится в интервале: " + StartRange + " " + endRange);
        for (Patient patient : patients) {
            int medic_book = Integer.parseInt(patient.medic_book);
            if (medic_book >= StartRange && medic_book <= endRange) {
                System.out.println(patient.name + " " + patient.surname);
            }
        }
    }
}

