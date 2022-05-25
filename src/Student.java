import java.time.LocalDate;

public class Student extends User{
    private int year;

    public int Semester(){
        return LocalDate.now().getYear() - year;
    }

    public Student (String name, String surname, int year) throws Exception{
        this.name = name;
        this.surname = surname;
        this.year = year;
        if ((LocalDate.now().getYear() - year > 5) || (year > LocalDate.now().getYear())){
            throw new Exception("Invalid year");
        }
    }
}
