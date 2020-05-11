package de.coding.akademie.function.kata01.htmlgen;

public class WikiPagePath {
    String path = "/<unknown-path>";

    WikiPagePath(String path) {
        this.path = path;
    }

    public String toString() {
        return path;
    }
}
