package les10_01;

/*
 *Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить.
 */
public class Main {
	public static void main(String[] args) {
		Directory resource = new Directory("каталог");

		Directory subresource = new Directory("subresource");
		resource.addDirectory(subresource);

		TextFile newBook = new TextFile("создать", "файл");
		resource.addFile(newBook);
		TextFile newBook1 = new TextFile("создать2", "файл");
		resource.addFile(newBook1);
		System.out.println(resource.toString());// вывести на консоль

		newBook.setName("создать1");// переименовать файл
		System.out.println(resource.toString());

		resource.deleteFile(newBook); // удалить
		System.out.println(resource.toString());
	}
}
