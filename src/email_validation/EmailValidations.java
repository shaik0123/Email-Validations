package email_validation;

import java.util.regex.Pattern;

public class EmailValidations {
    public void firstEmail(String value){
        if(Pattern.matches("^([a-z0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value + " Email is Valid");
        }
        else {
            System.out.println(value + " Email is Invalid");
        }
    }
    public void secondEmail(String value){
        if(Pattern.matches("^([a-z-0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value + " Email is Invalid");
        }
    }

    public void thirdEmail(String value){
        if(Pattern.matches("^([a-z.0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }

    public void fourthEmail(String value){
        if(Pattern.matches("^([a-z0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }

    public void fifthEmail(String value){
        if(Pattern.matches("^([a-z.0-9]+)@([a-z]+).([a-z]{2,8}).([a-z]{2,3})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }

    public void sixthEmail(String value){
        if(Pattern.matches("^([a-z]+)@([0-9]+).([a-z]{2,8})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }

    public void seventhEmail(String value){
        if(Pattern.matches("^([a-z]+)@([a-z0-9]+).([a-z]{2,8}).([a-z]{2,4})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }

    public void eighthEmail(String value){
        if(Pattern.matches("^([a-z+0-9]+)@([a-z0-9]+).([a-z]{2,8})$",value)){
            System.out.println(value +  " Email is Valid");
        }
        else {
            System.out.println(value +  " Email is Invalid");
        }
    }




    public static void main(String[] args) {

        EmailValidations emailCheck = new EmailValidations();

        emailCheck.firstEmail("abc@yahoo.com");
        emailCheck.secondEmail("abc-100@yahoo.com");
        emailCheck.thirdEmail("abc.100@yahoo.com");
        emailCheck.fourthEmail("abc111@abc.com");
        emailCheck.fifthEmail("abc.100@abc.com.au");
        emailCheck.sixthEmail("abc@1.com");
        emailCheck.seventhEmail("abc@gmail.com.com");
        emailCheck.eighthEmail("abc+100@gmail.com");


    }
}
