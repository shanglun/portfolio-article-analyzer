package seanwang;

import org.apache.xpath.operations.String;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by shang on 1/21/2017.
 */
public class PortfolioNewsAnalyzer {
    private HashSet<String> portfolio;
    public PortfolioNewsAnalyzer(){
        this.portfolio = new HashSet<String>();
    }
    public void addPortfolioCompany(String company) {
        this.portfolio.add(company);
    }
    public boolean arePortfolioCompaniesMentioned(HashSet<String> articleProperNouns){
        return !Collections.disjoint(articleProperNouns, this.portfolio);
    }
}
