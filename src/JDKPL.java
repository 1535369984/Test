import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public class JDKPL {

	public String getReturnData(String urlString) throws UnsupportedEncodingException {
		String res = "";
		try {
			URL url = new URL(urlString);
			java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			java.io.BufferedReader in = new java.io.BufferedReader(
					new java.io.InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				res += line;
			}
			in.close();
		} catch (Exception e) {
			System.out.println("error in wapaction,and e is " + e.getMessage());
		}
		// System.out.println(res);
		return res;
	}

	public static void main(String[] args) throws IOException {
		JDKPL t = new JDKPL();
		String url = "https://auth.360buy.com/oauth/token?grant_type=authorization_code&client_id=312CF63F64E6C05F53EE874E4E1F5958&redirect_uri=http://app.chaoxing.com/&code=3NyLVw&state=quanyi&client_secret=47089850b1ce4826b6cab9b1c0ed4505";
		System.out.println(t.getReturnData(url));
	}

}
