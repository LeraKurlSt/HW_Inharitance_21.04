public class Main {
    //Реализуйте класс Student (Студент), который будет наследоваться от класса User.
    // Этот класс должен иметь следующие свойства: name (имя, наследуется от User), surname (фамилия, наследуется от User),
    // year (год поступления в вуз). Класс должен иметь метод getFullName() (наследуется от User),
    // с помощью которого можно вывести одновременно имя и фамилию студента. Также класс должен иметь метод getCourse(),
    // который будет выводить текущий курс студента (от 1 до 5). Курс вычисляется так: нужно от текущего года отнять год поступления в вуз.
    // Текущий год получите самостоятельно.
    public static void main(String[] args) {
        Student student1;
        Student student2;
        try {
            student1 = new Student("Roman", "Kurlygin", 2020);
            System.out.println("Student " + student1.fullName() + " is on " + student1.Semester() + " Semester");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        try {
            student2 = new Student("Valeriia", "Kurlygina", 2019);
            System.out.println("Student " + student2.fullName() + " is on " + student2.Semester() + " Semester");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
