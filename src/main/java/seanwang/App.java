package seanwang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String urlString = "http://www.cnbc.com/2017/01/15/luxottica-essilor-in-45-billion-euro-merger-deal-to-create-eyewear-giant-source.html";
        String text = BoilerPipeExtractor.extractFromUrl(urlString);
        System.out.println(text);
    }
}
