class Person {
  private String name;
 public Person(String name) {
   this.name = name;
 }
 public String introduction() {
    return "My name is " + name + ".";
  }
}
class Student extends Person {
  private String id;
  public Student(String name, String id){
    super(name);
    this.id = id;
  }
  public String introduction() {
    return "I am a student. " + super.introduction() + " My ID is "+ id + ".";
  }
}
class EnglishPerson extends Person{
  public EnglishPerson(String name){
    super(name);
  }
  public String introduction(){
    return "How do you do? "+super.introduction();
  }
}
class EnglishStudent extends Student{
  public EnglishStudent(String name,String id){
    super(name,id);
  }
  public String introduction(){
    return "How do you do? "+super.introduction();
  }
}
class JapanesePerson extends Person{
  public JapanesePerson(String name){
    super(name);
  }
  public String introduction(){
    return "Hajime mashite. "+super.introduction();
  }
}
class JapaneseStudent extends Student{
  public JapaneseStudent(String name,String id){
    super(name,id);
  }
  public String introduction(){
    return "Hajime mashite. "+super.introduction();
  }
}
public class PolymorphismDemo {
  public static void main(String[] args) {
    Person p=new Person("****");
    Student s = new Student("Saito","s115333");
    EnglishPerson ep=new EnglishPerson("Ed Sheeran");
    EnglishStudent es=new EnglishStudent("eminem","m1000001");
    JapanesePerson jp=new JapanesePerson("Noritaka Kagei");
    JapaneseStudent js=new JapaneseStudent("Noritaka Kagei","s1250048");

    System.out.println(p.introduction());
    System.out.println(s.introduction());
    System.out.println(ep.introduction());
    System.out.println(es.introduction());
    System.out.println(jp.introduction());
    System.out.println(js.introduction());
  }
}
