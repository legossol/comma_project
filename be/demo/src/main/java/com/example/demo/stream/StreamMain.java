package com.example.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import static com.example.demo.stream.RefUtil.*;


public class StreamMain{
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("메뉴 : 0,EXIT 1.학년오름차순 2.성적내림차순 3.이름오름차순 4.ID오름차순");
            switch(scan.nextInt()){
                case 0: return;
                case 1: ascGrade().forEach(System.out::println); break;
                case 2: descScore().forEach(System.out::println); break;
                case 3: ascName().forEach(System.out::println); break;
                case 4: ascUserName().forEach(System.out::println); break;
            }
        }
        ascGrade().forEach(System.out::print);
    }

    public static Stream<Student> makeStream(){
        DummyGenerator dum = new DummyGenerator();
        return
        Stream.of(
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,3), rangeBelowRandom.apply(0,100),dum.makeUsername())
            );

}
public static Stream<Student> ascGrade(){
    return makeStream().sorted(Comparator.comparing(Student::getGrade).thenComparing(Comparator.naturalOrder()));
}
public static Stream<Student> ascUserName(){
    return makeStream().sorted(Comparator.comparing(Student::getName).thenComparing(Comparator.naturalOrder()));
}
public static Stream<Student> descScore(){
    return makeStream().sorted(Comparator.comparing(Student::getScore).thenComparing(Comparator.naturalOrder()));
}
public static Stream<Student> ascName(){
    return makeStream().sorted(Comparator.comparing(Student::getName).thenComparing(Comparator.naturalOrder()));
        
}

class Student implements Comparator<Student>{
    private String name;
    private int grade;
    private int score;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return String.format("[%n, %g, %s]",name,grade,score);
    }
    @Override
    public int 
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return Integer.compare(o1.score - o2.getScore);
    }
    public Student(String name, int grade, int score){
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    
    


    
            
    
    


    }
        //배열을 리스트로 전환해서 솔팅하는 법
    // new StreamUtil().arrayToList(new String[]{"b","d","a"}).forEach(System.out::println) {
        // System.out.println(RefUtil.strToInt.apply("1"));
        // RefUtil.pr.accept("바부");
        // System.out.println(RefUtil.valOv.apply("1"));
        // RefUtil.equ.and("나는","넌");

   
    // String[] starArr = {"bb","ddd"};
    // List<String> starList = Arrays.asList(starArr);
    // Stream<String> starStream1 = starList.stream();
    // Stream<String> starStream2 = Arrays.stream(starArr);

    

}
