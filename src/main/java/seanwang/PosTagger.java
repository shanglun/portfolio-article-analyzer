package seanwang;

import java.util.List;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 * Created by shang on 1/15/2017.
 */
public class PosTagger {
    private static String modelPath = "edu\\stanford\\nlp\\models\\pos-tagger\\english-left3words\\english-left3words-distsim.tagger";
    private static MaxentTagger tagger = new MaxentTagger(modelPath);
    public static String tagPos(String input) {
        String output = tagger.tagString(input);
        return output;
    }
}
