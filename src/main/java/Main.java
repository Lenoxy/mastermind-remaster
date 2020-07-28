import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class Main{
    static Controller c;

    public static void main(String[] args){
        boolean restart;
        do{
            c = new Controller();
            restart = c.play();
        }while(restart);

    }
}
