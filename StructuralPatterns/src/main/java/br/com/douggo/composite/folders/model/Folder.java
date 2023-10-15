package br.com.douggo.composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem {

    private final String name;

    private final List<FileSystemItem> children;

    public Folder(String name, List<FileSystemItem> children) {
        this.name = name;
        this.children = children;
    }

    public void addNewChild(FileSystemItem child) {
        this.children.add(child);
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + this.name);
        this.children.forEach(fileSystemItem -> fileSystemItem.print(structure + "|   "));

    }

}
