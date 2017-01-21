package seanwang;

import java.util.HashSet;

/**
 * Created by shang on 1/21/2017.
 */
public class PropNounExtractor {
    public static HashSet<String> extractProperNouns(String taggedOutput) {
        HashSet<String> propNounSet = new HashSet<String>();
        String[] split = taggedOutput.split(" ");
        for (String token: split ){
            String[] split_token = token.split("_");
            if(split_token[1].equals("NNP")){
                propNounSet.add(split_token[0]);
            }
        }
        System.out.print(propNounSet);
        return propNounSet;
    }
}
