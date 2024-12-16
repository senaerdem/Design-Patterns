import java.util.List;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Zaman formatı
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // İlk getCountries çağrısı
        System.out.println("İlk çağrı zamanı: " + LocalTime.now().format(formatter));

        CountryService countryService = CountryService.getInstance(); // CountryService sınıfının Singleton bir örneği oluşturulur (eğer daha önce oluşturulmamışsa).
        List<Country> countries = countryService.getCountries().join(); // Veriyi al
        for (Country country : countries) { // ülkeleri yazdırır
            System.out.println(country.getName());
        }
        System.out.println(countryService.getCountryCount());

        // Logları kontrol et
        System.out.println("Loglar dosyaya yazıldı...");

        // İkinci getCountries çağrısı
        System.out.println("İkinci çağrı zamanı: " + LocalTime.now().format(formatter));

        List<Country> countries1 = countryService.getCountries().join(); // Bu sefer Singleton nesne daha önce oluşturulduğu için getInstance() yeniden bir nesne yaratmaz. Mevcut nesne kullanılır.
        for (Country country : countries1) { // ülkeleri yazdırır
            System.out.println(country.getName());
        }
        System.out.println(countryService.getCountryCount());
    }
}
