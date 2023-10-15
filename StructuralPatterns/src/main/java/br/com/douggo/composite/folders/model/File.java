package br.com.douggo.composite.folders.model;

public class File implements FileSystemItem {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + this.name);
    }

}
