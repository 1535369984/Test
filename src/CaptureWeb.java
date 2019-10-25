import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

/**
 * @Description :
 * Created by WL on 2018/5/2
 */
public class CaptureWeb {
    public static void main(String[] args) throws IOException {
        String url = URLEncoder.encode("https://www.baidu.com/s?ie=UTF-8&wd=pattern");
        URL u = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) u.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        reader.close();
        inputStream.close();
    }
}
