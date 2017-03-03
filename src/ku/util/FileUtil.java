package ku.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;

public class FileUtil {
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
	
	static void ccopy(InputStream in, OutputStream out){
		
	}

}
