package com.example.proxydesignpattern;
// Proxy
class FileProxy implements File {
    private RealFile realFile; // Gerçek dosya işlemi için proxy sınıfı

    // Dosya silme işlemini kontrol eden metot
    @Override
    public void delete(String userRole) {
        // Eğer kullanıcı "ADMIN" rolüne sahipse, dosya silme işlemini yapabilir
        if ("ADMIN".equalsIgnoreCase(userRole)) {
            // Gerçek dosya nesnesi yalnızca gerektiğinde oluşturulur (Lazy Loading)
            if (realFile == null) {
                // Gerçek dosya nesnesinin silme işlemi çağrılır
                realFile = new RealFile();
            }
            // Gerçek dosya nesnesinin silme işlemi çağrılır
            realFile.delete(userRole);
        } else {
            // Eğer kullanıcı "ADMIN" değilse, erişim reddedilir
            System.out.println("Access Denied: Only admins can delete files.");
        }
    }
}