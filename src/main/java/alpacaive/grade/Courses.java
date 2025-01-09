package alpacaive.grade;

import java.util.List;

// 일급 컬렉션 -> List 형태로 된 Course 정보만 인스턴스 변수로 가지는 클래스, 변수 하나 더 있으면 안됨
public class Courses {
    private final List<Course> courses;


    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
//        double multipliedCreditAndCourseGrade = 0;
//
//        for (Course course : courses) {
////            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//
//        return multipliedCreditAndCourseGrade;

        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
