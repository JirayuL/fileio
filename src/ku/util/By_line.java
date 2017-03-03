package ku.util;

public class By_line extends FileCopyTask {
	public By_line(String infile, String outfile) {
		super(infile, outfile);
	}

	public void run() {
		FileUtil.bcopy(in, out);
	}

	public String toString() {
		return "Copy a file by line";
	}

}
