package structural.composite.src;

import java.util.Collections;
import java.util.List;

public class Directory extends AbstractFile {
	private List<AbstractFile> includedFiles;

	public Directory(String name, List<AbstractFile> includedFiles) {
		super(name);
		this.includedFiles = includedFiles;
	}

	@Override
	public String ls(int level) {
		return String.join("", Collections.nCopies(level, " "))
			.concat(this.getName())
			.concat("\n")
			.concat(
				this.includedFiles
				.stream()
				.map(includedFile -> includedFile.ls(level + 1))
				.reduce("", (acc, cur) -> acc.concat(cur))
			);
	}

	public List<AbstractFile> getIncludedFiles() {
		return includedFiles;
	}
}
