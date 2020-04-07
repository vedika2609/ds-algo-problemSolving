package dsalgo.algos.problemsolving;

class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 1918;
        String feb = "13";

        if (year <= 1917) {
            if (year % 4 == 0)
                feb = "12";
        } else if (year == 1918)
            feb = "26";
        else {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
                feb = "12";
        }

        String programmerDay = feb + ".09." + year;
        System.out.println(programmerDay);
    }
}