package secondweek.multiclass;

public class Person {
    private ConcreteCountry country;
    private ConcreteCitizen citizen;

    Person(ConcreteCountry country, ConcreteCitizen citizen){
        this.country = country;
        this.citizen = citizen;


    }

    public String getConcreteCountryName(){
        return country.getCountryName();
    }

    public String toString(){
        return String.format("%s, %s", country, citizen);
    }

//    void displayInformation() {
//        System.out.println("Name: " + citizen.getName());
//        System.out.println("Age: " + citizen.getAge());
//        System.out.println("phoneNum: " + citizen.getPhoneNum());
//        System.out.println("Region: " + country.getRegion());
//        System.out.println("PoliticalSystem: " + country.getPoliticalSystem());
//        System.out.println("Language: " + country.getLanguage());
//    }
}
