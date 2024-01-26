package secondweek.multiclass;

public class ConcreteCitizen extends ConcreteCountry implements Citizen {

    String name;
    int age;
    String phoneNum;

    ConcreteCitizen(String continent, String countryName, String politicalSystem, String language,
            String name, int age, String phoneNum){
        super(continent, countryName, politicalSystem, language);
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }


    @Override
    public String getName() { return name; }

    @Override
    public int getAge() { return age; }

    @Override
    public String getPhoneNum() { return phoneNum; }

    @Override
    public String toString() {
        return "ConcreteCitizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", continent='" + continent + '\'' +
                ", countryName='" + countryName + '\'' +
                ", politicalSystem='" + politicalSystem + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
