public class BMI {
    public static String calculateBMI(double weight, double height) {

    double bmi = weight / (height * height);

        if (bmi < 18.5) {
            return "Untergewicht";
        }
        else if (bmi <= 25) {
            return "Normalgewicht";
        }
        else if (bmi <= 30) {
            return "Übergewicht";
        }
        else {
            return "Schweres Übergewicht";
        }
    }
}
