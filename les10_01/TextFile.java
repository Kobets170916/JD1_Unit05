package les10_01;

/*
 *Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить.
 */
public class TextFile { //класс Текстовый файл
	private String format;

	public TextFile(String name, String format) {
		string(name);
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getName() + "." + format;
	}

}
