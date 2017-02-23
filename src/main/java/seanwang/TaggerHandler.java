package seanwang;



import org.apache.thrift.TException;

public class TaggerHandler implements TaggerService.Iface {

    public String tagString(String stringToTag) throws TException {
        System.out.println("tagging");
        return "java says: " + stringToTag;
    }

}
