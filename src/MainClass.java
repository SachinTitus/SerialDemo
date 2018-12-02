public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Anuja");
        person.setAge(31);
        person.setIdNumber("123456");
        person.setNationality("Indian");

        FileUtils fileUtils = new FileUtils();
        fileUtils.serializeObject(person);
    }
}
