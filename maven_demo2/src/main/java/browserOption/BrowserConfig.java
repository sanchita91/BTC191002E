package browserOption;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserConfig {
	public static Properties readProp(String path) throws IOException {
		File fi=new File(path);
		FileInputStream f=new FileInputStream(fi);
		Properties prop=new Properties();
		prop.load(f);
		return prop;
	}

}
