package ku.util;

public class By_4KB extends FileCopyTask {
	final int SIZE_4KB = 1024 * 4;

	public By_4KB(String infile, String outfile) {
		super(infile, outfile);
	}

	public void run() {
		FileUtil.copy(in, out, SIZE_4KB);
	}

	public String toString() {
		return "Copy a file by 4_KB";
	}
}
