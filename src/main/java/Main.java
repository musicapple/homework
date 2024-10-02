import java.util.ArrayList;

/*
1. 추상 객체 Person이 있다

2. Person은 다음과 같은 기능을 수행한다.
 - 이름을 리턴하는 함수 ( getName() )
 - 나이를 리턴해주는 함수 ( getAge() )
 - 직업을 리턴해주는 함수 ( getJob() )

 3. 프로그램에는 Person 말고도 조금 더 구체적인 객체가 있다.
  - Student (학생 클래스)
  - SalayMan (직장인 클래스)
  - Teacher (선생님 클래스)

 4. 프로그램이 실행되면 다음과 같은 동작을 한다
  - 선생님 ( 이순신, 24) / 선생님 (장성준, 28)
  - 학생 ( 김띨띨, 23) / 학생 (노똥똥, 24)
  - 직장인 (김환영, 24) / 직장인 (홍길동, 25)
  - 위의 모든 클래스를 생성한다.
  - 이후, 모든 클래스를 하나의 배열에 저장
  - 해당 배열을 순회하여 모두의 정보를 각각 출력한다. 이 때 , 각 정보를 출력하는 함수를 사용하여 출력
* */

public class Main {

    public static void main(String[] args) {
        Person st1 = new Student("김띨띨",23,"학생");
        Person st2 = new Student("노똥똥",24,"학생");

        Person teacher1 = new Teacher("이순신",24,"선생님");
        Person teacher2 = new Teacher("장성준",28,"선생님");

        Person salayMan1 = new SalayMan("김환영",24,"직장인");
        Person salayMan2 = new SalayMan("홍길동",25,"직장인");

        ArrayList<Person> person = new ArrayList<>();
        person.add(st1);
        person.add(st2);
        person.add(teacher1);
        person.add(teacher2);
        person.add(salayMan1);
        person.add(salayMan2);

        for(Person p : person){
            System.out.println(p.getName() + "의 나이는 " + p.getAge() + "입니다. 직업은 " + p.getJob() + "입니다.");
        }

    }
}


abstract class Person{
    protected String name;
    protected int age;
    protected String job;

    public Person(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    abstract String getName();
    abstract int getAge();
    abstract String getJob();
}

class Student extends Person{

    public Student(String name, int age, String job) {
        super(name, age, job);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getAge() {
        return age;
    }

    @Override
    String getJob() {
        return job;
    }
}
class SalayMan extends Person{

    public SalayMan(String name, int age, String job) {
        super(name, age, job);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getAge() {
        return age;
    }

    @Override
    String getJob() {
        return job;
    }
}
class Teacher extends Person{

    public Teacher(String name, int age, String job) {
        super(name, age, job);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getAge() {
        return age;
    }

    @Override
    String getJob() {
        return job;
    }
}