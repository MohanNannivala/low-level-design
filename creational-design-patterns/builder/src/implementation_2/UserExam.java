package implementation_2;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private UserExam(){}

    public static UserExamBuilder getBuilder(){
        return  new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build(){

            if(this.englishMarks > 10 || this.mathsMarks > 10 || this.scienceMarks > 10){
                throw new InvalidParameterException("Marks can not be grarter than 10");
            }

            UserExam userExam = new UserExam();

            userExam.englishMarks = this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;

            return userExam;
        }
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
