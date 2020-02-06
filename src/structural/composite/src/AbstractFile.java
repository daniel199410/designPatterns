package structural.composite.src;

public abstract class AbstractFile {
	private String name;
	
	public AbstractFile(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public abstract String ls(int level);
}
