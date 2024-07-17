public abstract class Message {
    private String message = "Welcome!";
    private Int randomNumber = 1;
    private boolean correct = false;

    protected Message(){}

    public String getMessage(){
        return message;
    }

    public void setMessage(){
        this.message = message;
    }

    public Int getRandomNumber(){
        return randomNumber;
    }

    public void setRandomNumber(){
        this.randomNumber = randomNumber;
    }
}
