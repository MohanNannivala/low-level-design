package implementation_2;

public class Main {

    public static void main(String[] args) {

        try {

            UserExam userExam = UserExam.getBuilder()
                    .setEnglishMarks(10)
                    .setMathsMarks(10)
                    .build();

            System.out.println(userExam);

        }catch(Exception e){

            System.out.println("Some parameters are wrong.");

        }
    }
}
