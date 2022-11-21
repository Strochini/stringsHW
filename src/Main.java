public class Main {
    public static void main(String[] args) {

        // Task 1, 2, 3

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = (lastName + " " + firstName + " " + middleName);
        String fullNameE = fullName.replace("ё", "е");
        System.out.println("\"ФИО сотрудника - " + fullNameE + "\"\n");

        String upperFullName = fullNameE.toUpperCase();
        System.out.println("\"Данные ФИО сотрудника для заполнения отчета - " + upperFullName + "\"\n");
    }
}