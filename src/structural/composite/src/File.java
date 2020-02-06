package structural.composite.src;

import java.util.Collections;

public class File extends AbstractFile {

	public File(String name) {
		super(name);
	}

	@Override
	public String ls(int level) {
		return String.join("", Collections.nCopies(level, " ")).concat(this.getName()).concat("\n");
	}

}
