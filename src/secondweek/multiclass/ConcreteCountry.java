package secondweek.multiclass;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCountry implements Country {

    String continent;
    String countryName;
    String politicalSystem;
    String language;

    ConcreteCountry(String continent, String countryName, String politicalSystem, String language){
        this.continent = continent;
        this.countryName = countryName;
        this.politicalSystem = politicalSystem;
        this.language = language;
    }
    public static final Map<String, ConcreteCountry> countryInfo = new HashMap<>();
    static {
        countryInfo.put("Korea", new ConcreteCountry("Asia", "Korea", "Public", "Korean"));
        countryInfo.put("Japan", new ConcreteCountry("Asia", "Japan", "Public", "Japanese"));
        countryInfo.put("China", new ConcreteCountry("Asia", "China", "Public", "Chinese"));
        countryInfo.put("US", new ConcreteCountry("N-America", "US", "Public", "English"));
        countryInfo.put("UK", new ConcreteCountry("Europe", "UK", "Public", "English"));
    }
    @Override
    public String getContinent() {
        return continent;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }

    @Override
    public String getPoliticalSystem() {
        return politicalSystem;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s", continent, countryName, politicalSystem, language);
    }

}


