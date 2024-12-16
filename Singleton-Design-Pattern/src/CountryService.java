import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CountryService {
    // Singleton örneği
    private static CountryService instance = null; // Bu, sınıfın yalnızca bir örneğini tutar. İlk kez getInstance() çağrıldığında bu örnek oluşturulacaktır.

    // Üzerinde işlem yapılacak ülke listesi
    private List<Country> countries;

    // Private constructor: Dışarıdan yeni nesne oluşturulmaz
    private CountryService() {
        try {
            // Veriye 2 saniyelik gecikme
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ülkeler listesini oluştur
        countries = new ArrayList<>();
        countries.add(new Country("Türkiye"));
        countries.add(new Country("İngiltere"));
    }

    // Singleton örneğini almak için kullanılan metod
    public static CountryService getInstance() {
        // Eğer instance zaten oluşturulmuşsa, mevcut örneği döndürür; değilse, yeni bir örnek yaratır ve bunu döndürür. Yani burada uygulamanın herhangi bir yerinden bu sınıfa erişseniz de, her zaman aynı nesneye sahip olursunuz.
        if (instance == null) {
            instance = new CountryService(); // yalnızca getInstance() ilk kez çağrıldığında çalıştırılır.
        }
        return instance;
    }

    // Ülkelerin sayısını döndüren metod
    public int getCountryCount() {
        return countries.size();
    }

    // Ülkelerin listesini döndüren metod
    public CompletableFuture<List<Country>> getCountries() { // Asenkron bir işlem döndürmek için CompletableFuture kullanıyoruz
        // Loglama işlemi
        Logger.getInstance().log("getCountries çağrıldı");

        return CompletableFuture.supplyAsync(() -> countries);
    }
}
