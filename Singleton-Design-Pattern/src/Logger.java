import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;
    private static final String LOG_FILE = "app.log"; // Log dosyasının adı

    // Singleton instance'ını almak için
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Loglama metodu
    public void log(String message) {
        // Zaman bilgisi ile mesajı yazma
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = LocalDateTime.now().format(formatter);

        // Logları dosyaya yazma
        try (FileWriter fw = new FileWriter(LOG_FILE, true);  // Dosyaya eklemek için true
             PrintWriter writer = new PrintWriter(fw)) {
            writer.println(formattedTime + ": " + message); // Zaman bilgisi ile log yaz
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(formattedTime + ": " + message);
    }
}
