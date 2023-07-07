package implementation_1;

public class Main {
    public static void main(String[] args) {

        UserExamParamenter userExamParamenter=new UserExamParamenter();

        userExamParamenter.englishMarks = 10;
        userExamParamenter.mathsMarks = 10;
        userExamParamenter.name = "Mohan";

        try{
            UserExam userExam = new UserExam(userExamParamenter);
            System.out.println(userExam.toString());
        }catch (Exception e){
            System.out.println("some parameters are wrong");
        }

    }
}