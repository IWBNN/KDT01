package secondweek.multiclass;

public class TravelManagementCountry extends ConcreteCountry implements Travel, NationalityManagement{
    TravelManagementCountry(String continent, String countryName,String politicalSystem, String language) {
        super(continent, countryName,politicalSystem, language);
    }

    @Override
    public Country changeNationality(Citizen citizen, Country newCountry) {
        System.out.println(citizen.getName() + "님의국적을 변경합니다. " + this.getCountryName() + " -> " + newCountry.getCountryName());
        return newCountry;
    }

    @Override
    public void TravelTo(Country destination) {
        System.out.println("여행: " + this.getCountryName() + " -> " + destination);
    }
}
