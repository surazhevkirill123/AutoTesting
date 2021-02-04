package classes;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", "Иван", "Иванович", "01.01.1998", "38044555667712", "Психология", "1", "123");
        Student st2 = new Student("Петров", "Петр", "Петрович", "12.04.1997", "38044555667713", "Журналистика", "2", "321");
        Student st3 = new Student("Семенов", "Семен", "Семенович", "10.07.1996", "38044555667714", "Юридический", "3", "231");
        Student st4 = new Student("Галушко", "Константин", "Иванович", "04.09.1999", "38044555667715", "Психология", "2", "246");
        Student st5 = new Student("Пивоваров", "Сергей", "Петрович", "03.04.1998", "38044555667716", "Журналистика", "1", "133");
        Student st6 = new Student("Пупкин", "Василий", "Николаевич", "07.01.1998", "38044555667717", "Юридический", "1", "144");
        Student st7 = new Student("Антонов", "Анатолий", "Сергеевич", "03.12.1996", "38044555667718", "Психология", "1", "123");
        Student st8 = new Student("Жуков", "Евгений", "Анатольевич", "15.07.1997", "38044555667719", "Журналистика", "2", "321");
        Student st9 = new Student("Решетников", "Роман", "Семенович", "23.04.1998", "38044555667720", "Юридический", "3", "231");
        Student st10 = new Student("Блинов", "Федор", "Викторович", "05.01.1998", "38044555667721", "Психология", "3", "369");
        Student st11 = new Student("Сидорченко", "Виктор", "Андреевич", "12.05.1997", "38044555667722", "Журналистика", "2", "321");
        Student st12 = new Student("Ющенко", "Всеволод", "Богданович", "14.12.1996", "38044555667723", "Юридический", "3", "231");
        Student st13 = new Student("Порошенко", "Геннадий", "Николаевич", "13.09.1999", "38044555667724", "Психология", "1", "123");
        Student st14 = new Student("Соломатин", "Николай", "Петрович", "11.09.1998", "38044555667725", "Журналистика", "1", "133");

        StudentList newList = new StudentList();
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);
        newList.addStudent(st11);
        newList.addStudent(st12);
        newList.addStudent(st13);
        newList.addStudent(st14);
        newList.facultyPrint("Психология");                                     //список студентов заданного факультета
        newList.facultyCoursePrint("Психология", "1");
        newList.facultyCoursePrint("Психология");
        newList.facultyCoursePrint(1);                                          //списки студентов для каждого факультета и курса;
        newList.yearOfBirthPrint("1997");                                       //список студентов, родившихся после заданного года;
        newList.groupPrint("123");                                              //список учебной группы
    }
}
