package ku.util;

public class By_1KB extends FileCopyTask {
	final int SIZE_1KB = 1024;

	public By_1KB(String infile, String outfile) {
		super(infile, outfile);
	}

	public void run() {
		FileUtil.copy(in, out, SIZE_1KB);
	}

	public String toString() {
		return "Copy a file by 1_KB";
	}
}
