package seanwang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws
            java.io.IOException,
            org.xml.sax.SAXException,
            de.l3s.boilerpipe.BoilerpipeProcessingException
    {
        PortfolioNewsAnalyzer analyzer = new PortfolioNewsAnalyzer();
        analyzer.addPortfolioCompany("Luxottica");
        boolean mentioned = analyzer.analyzeArticle("http://www.reuters.com/article/us-essilor-m-a-luxottica-group-idUSKBN14Z110");
        if (mentioned) {
            System.out.println("Article mentions portfolio companies");
        } else {
            System.out.println("Article does not mention portfolio companies");
        }
    }
}
