import org.apache.commons.lang3.StringUtils;


public class FooMain {

    public static void main(String args[]) throws Exception {
        System.out.println(StringUtils.join( new String[]{"hello", "world"}, " "));
    }
}