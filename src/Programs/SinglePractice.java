package Programs;

public class SinglePractice {
    private SinglePractice(){};
    private static SinglePractice instance = null;
    public static SinglePractice getInstance(){
        if (instance == null){
            instance = new SinglePractice();
        }
        return instance;
    }
}
