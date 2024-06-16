package Java_Self_Learning;

public class numberNotEligibleException extends Exception {

    public numberNotEligibleException(String number) {
        System.out.println("Number not Eligibe : " + number);
    }

    public numberNotEligibleException() {
        //TODO Auto-generated constructor stub
    }

}
