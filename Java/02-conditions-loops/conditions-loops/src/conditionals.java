public class conditionals {
    public static void main(String[] args) {
        // if else
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // multiple if-else

        if (salary > 10000) {
            salary += 20000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
    }
}