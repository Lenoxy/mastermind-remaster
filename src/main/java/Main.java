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
