package ku.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * Class for reading file and copy it into OutputStream.
 * 
 * @author Gear
 *
 */
public class FileUtil {
	/**
	 * Copy file byte by byte to OutputStream.
	 * 
	 * @param in
	 *            is the file sent from the user.
	 * @param out
	 *            is the copy file that will sent back to user.
	 */
	static void copy(InputStream in, OutputStream out) {
		try {
			int bytes;
			while ((bytes = in.read()) > -1) {
				out.write(bytes);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy file by the blocksize that user set and sent to OutputStream.
	 * 
	 * @param in
	 *            is the file sent from the user.
	 * @param out
	 *            is the copy file that will sent back to user.
	 * @param blocksize
	 *            is the size that will be use to read file.
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		try {
			byte[] buffer = new byte[blocksize];
			int bytes;
			while ((bytes = in.read(buffer)) > -1) {
				out.write(bytes);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy file by the line.
	 * 
	 * @param in
	 *            is the file sent from the user.
	 * @param out
	 *            is the copy file that will sent back to user.
	 */
	static void bcopy(InputStream in, OutputStream out) {
		try {
			Reader reader = new InputStreamReader(in);
			BufferedReader buffer = new BufferedReader(reader);
			PrintWriter printer = new PrintWriter(out);
			String line;
			while ((line = buffer.readLine()) != null) {
				printer.println(line);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
