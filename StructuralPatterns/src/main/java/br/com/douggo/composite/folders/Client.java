package br.com.douggo.composite.folders;

import br.com.douggo.composite.folders.model.File;
import br.com.douggo.composite.folders.model.FileSystemItem;
import br.com.douggo.composite.folders.model.Folder;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		Folder parentFolder = new Folder("Musics", createFilesForParentFolder());

		String absolutePath = System.getProperty("user.dir");
		java.io.File file = new java.io.File(absolutePath + java.io.File.separator + "diagramas");
		Folder anotherParentFolder = new Folder("diagramas", Collections.singletonList(getFoldersFromUbuntuFile(file)));

		parentFolder.print("");
		System.out.println("----------");
		anotherParentFolder.print("");
	}

	private static List<FileSystemItem> createFilesForParentFolder() {
		FileSystemItem metallicaFolder = new Folder("Metallica", Arrays.asList(
				new File("The Unforgiven II.mp3"),
				new File("Hero of the Day.mp3")
		));

		FileSystemItem unbrokenMp3 = new File("Unbroken.mp3");

		FileSystemItem ozzyFolder = new Folder("Ozzy Osbourne", Arrays.asList(
				new File("No More Tears.mp3"),
				new File("Crazy Train.mp3"),
				new File("Perry Mason.mp3")
		));

		List<FileSystemItem> files = new ArrayList<>();
		files.add(metallicaFolder);
		files.add(unbrokenMp3);
		files.add(ozzyFolder);

		return files;
	}

	private static FileSystemItem getFoldersFromUbuntuFile(java.io.File file) {
		if (!file.isDirectory()) {
			return new File(file.getName());
		}

		List<FileSystemItem> children = new ArrayList<>();
		java.io.File[] files = file.listFiles();

		if (Objects.isNull(files)) {
			return new Folder(file.getName(), new ArrayList<>());
		}

		for(java.io.File javaFile: files) {
			children.add(getFoldersFromUbuntuFile(javaFile));
		}

		return new Folder(file.getName(), children);
	}

}
