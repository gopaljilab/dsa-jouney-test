package gopaljilab.dsa.string;

public class CountSeniors {
    public static int countSeniors(String[] details) {
        int noSeniorCitizen = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                noSeniorCitizen++;
            }
        }
        return noSeniorCitizen;
    }

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int noOfCitizen = countSeniors(details);
        System.out.println(noOfCitizen);
    }
}
