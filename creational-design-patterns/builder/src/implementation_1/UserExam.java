package implementation_1;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    UserExam(UserExamParamenter userExamParamenter){

        if(userExamParamenter.englishMarks > 10 ||
           userExamParamenter.mathsMarks > 10 ||
           userExamParamenter.scienceMarks > 10){
                throw  new InvalidParameterException("Marks can not be grarter than 10");
        }

        this.englishMarks = userExamParamenter.englishMarks;
        this.mathsMarks = userExamParamenter.mathsMarks;
        this.scienceMarks = userExamParamenter.scienceMarks;
        this.name = userExamParamenter.name;
    }

    @Override
    public String toString() {
        return "UserExam{" +
                "englishMarks=" + englishMarks +
                ", mathsMarks=" + mathsMarks +
                ", scienceMarks=" + scienceMarks +
                ", name='" + name + '\'' +
                '}';
    }
}
