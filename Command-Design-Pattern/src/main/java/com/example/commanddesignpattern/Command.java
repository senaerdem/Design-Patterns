package com.example.commanddesignpattern;
// Command Interface
interface Command {
    void execute(); // Komutun gerçekleştirilmesi
    void undo();    // Komutun geri alınması
}
