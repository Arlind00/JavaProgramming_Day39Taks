package day39_Recap.CydeoTask;

public class Student extends Person {



    private int studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if( studentId <= 0){
            System.err.println("Invalid Id number");
            System.exit(1);
        }
        this.studentId = studentId;
    }


    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if( fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()){
            System.err.println("You entered invalid field!!! ");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }



    public void study(){
        System.out.println("Student is studying");
    }

    public String toString() {
        return " Student {" +
                " studentId= " + studentId +
                ", fieldOfStudy= " + fieldOfStudy   +
                '}';
    }
}



/*
 6. Create a subclass of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */