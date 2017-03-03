package ku.util;

public class ByteCopyTask extends FileCopyTask {
	public ByteCopyTask(String infile, String outfile) {
		super(infile, outfile);
	}

	public void run() {
		FileUtil.copy(in, out);
	}

	public String toString() {
		return "Copy a file byte-by-byte";
	}

}
