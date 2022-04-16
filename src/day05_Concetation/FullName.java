package day05_Concetation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Albus";
        String lastName = "Dumbledore";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Microsoft";
        int salary = 45000;

        String fullName = firstName + " " + lastName;

        // Full name of the person is
        System.out.println("Full name of the person is: " + fullName);


        //.... is .... years old
        System.out.println(fullName + " is " + age + " years old.");

        //Fullname is jobTitle, works at CompanyName, and FullName salary is ...
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is " + salary);



    }
}

/*
create a class FullName         String firstName = "" ;
                                String lastName =
                                String fullName =
                                System.out.println("Fullname of the person is " + fullName);

 */