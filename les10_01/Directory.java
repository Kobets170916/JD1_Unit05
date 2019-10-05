package les10_01;

import java.util.ArrayList;
import java.util.List;

/*
 *Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить.
 */
public class Directory {//класс Директория
	private String name;
	private List<File> listFile;
	private List<Directory> subDirectory;

	public Directory(String name) {
		this.name = name;
		listFile = new ArrayList<File>();
		subDirectory = new ArrayList<Directory>();
	}

	public void addFile(File file) {
		listFile.add(file);
	}

	public void deleteFile(File file) {
		listFile.remove(file);
	}

	public void addDirectory(Directory directory) {
		subDirectory.add(directory);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<File> getListFile() {
		return listFile;
	}

	public void setListFile(List<File> listFile) {
		this.listFile = listFile;
	}

	public List<Directory> getSubDirectory() {
		return subDirectory;
	}

	public void setSubDirectory(List<Directory> subDirectory) {
		this.subDirectory = subDirectory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listFile == null) ? 0 : listFile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subDirectory == null) ? 0 : subDirectory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (listFile == null) {
			if (other.listFile != null)
				return false;
		} else if (!listFile.equals(other.listFile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subDirectory == null) {
			if (other.subDirectory != null)
				return false;
		} else if (!subDirectory.equals(other.subDirectory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "/" + name + "/" + listFile + "/" + subDirectory;
	}

}
