package com.example.visitordesignpattern;
// Ziyaretçilerin çalışacağı ortak arayüz
interface FileElement {
    void accept(FileVisitor visitor);
}