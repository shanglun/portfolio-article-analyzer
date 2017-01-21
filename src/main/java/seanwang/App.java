package seanwang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws java.io.IOException, org.xml.sax.SAXException, de.l3s.boilerpipe.BoilerpipeProcessingException
    {
        String urlString = "http://www.cnbc.com/2017/01/15/luxottica-essilor-in-45-billion-euro-merger-deal-to-create-eyewear-giant-source.html";
        String text = BoilerPipeExtractor.extractFromUrl(urlString);
        //System.out.println(text);
        String tagged = PosTagger.tagPos(text);
        PropNounExtractor.extractProperNouns(tagged);
        //System.out.println(tagged);
    }
}
