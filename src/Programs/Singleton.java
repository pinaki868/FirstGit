package Programs;

public class Singleton {

    private Singleton(){ }

    static Singleton instance = null;

    static public Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();

        }
        return instance;
    }

}
