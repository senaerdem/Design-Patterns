package com.example.proxydesignpattern;
// Real Subject
class RealFile implements File {
    // Gerçek dosya silme işlemi
    @Override
    public void delete(String userRole) {
        System.out.println("File deleted successfully.");
    }
}
