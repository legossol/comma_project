package com.example.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import static com.example.demo.stream.RefUtil.*;


public class StreamMain{
    class Student implements Comparable<String, Object>{
        private String name;
        private int grade;
        private int score;
        private String userName;
    
        public void setUserName(String userName){
            this.userName = userName;
        }
        public String getUserName(){
            return userName;
        }
    
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
            return String.format("[%n, %g, %s, %w]",name,grade,score,userName);
        }
        //아래는 생성자
        public Student(String name, int grade, int score, String userName){
            this.name = name;
            this.grade = grade;
            this.score = score;
            this.userName = userName;
            return;
        }
        @Override
        public int compareTo(Map<String, Object> map) {
            Student student = (Student)map.get("object");
            String prop = (String)map.get("prop");
            String option = (String)map.get("option");
            //데코패턴https://junigguya.tistory.com/106
            switch(prop){
                case "name" : break;
                case "username" : break;
                case "grade" : return student.getScore() - this.getScore;
                case "score" : break;
            }
            Student o = null;
            return 0;
        }
    }
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("메뉴 : 0,EXIT 1.학년오름차순 2.성적내림차순 3.이름오름차순 4.ID오름차순");
            switch(scan.nextInt()){
                case 0: return;
                case 1: ascGrade().forEach(System.out::println); break;
                case 2: descScore().forEach(System.out::println); break;
                case 3: ascName().forEach(System.out::println); break;
                case 4: ascUserName().forEach(System.out::println); 
            }
        }
    }
        // ascGrade().forEach(System.out::println);
    public static Stream<Student>makeStream(){
        DummyGenerator dum = new DummyGenerator();
        return
        Stream.of(
            new Student(dum.makeName(), rangeBelowRandom.apply(1,100), rangeBelowRandom.apply(0,100), dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,300), rangeBelowRandom.apply(0,100), dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,200), rangeBelowRandom.apply(0,100), dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,600), rangeBelowRandom.apply(0,100), dum.makeUsername()),
            new Student(dum.makeName(), rangeBelowRandom.apply(1,620), rangeBelowRandom.apply(0,100), dum.makeUsername()));
            
            

    }

    
    public static Stream<Student> ascGrade(){
        return ;
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

