package ku.util;

public class By_64KB extends FileCopyTask {
	final int SIZE_64KB = 1024*64;

	public By_64KB(String infile, String outfile) {
		super(infile, outfile);
	}
	public void run() {
		FileUtil.copy(in, out, SIZE_64KB);
	}
	public String toString() {
		return "Copy a file by 64_KB";
	}
}
