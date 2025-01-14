package com.example.visitordesignpattern;
// Concrete Element : Metin dosyasını temsil eden sınıf
class TextFile implements FileElement {
    private String name;
    private String content;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    // Visitor'ın bu nesneyi işlemesi için accept metodu
    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}