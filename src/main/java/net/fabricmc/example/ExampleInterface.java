package net.fabricmc.example;

import net.minecraft.text.Text;

public interface ExampleInterface {
    default Text getTitle() { return null; }
}
