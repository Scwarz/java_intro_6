package random;

public class StudentSelector {
    public static void main(String[] args) {
        /**
         *
         *Below code is fetching a student name randomly when invoked
         *There is chance that one student could be selected multiple time in a row
         */

        String[] students = {
                "Adam",
                "Alina",
                "Anatolii",
                "Anton",
                "Assem",
                "Ayat",
                "Belal",
                "Carmela",
                "Cihan",
                "Dumitru",
                "Gurkan",
                "Hadi",
                "Hamza A",
                "Hamza I",
                "Jehad",
                "Lesia",
                "Louie",
                "Matthew",
                "Melek",
                "Meerim",
                "Okan",
                "Paul",
                "Sabir",
                "Sandina",
                "Yana",
                "Yazan",
                "Yhehia",
                "Yousef",
                "Zeliha",
                "Zhazira",
        };
        System.out.println("The lucky student is = " + students[(int) (Math.random() * students.length)].toUpperCase());
    }
}
