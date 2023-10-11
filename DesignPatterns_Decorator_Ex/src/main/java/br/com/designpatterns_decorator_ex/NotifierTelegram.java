package br.com.designpatterns_decorator_ex;

public class NotifierTelegram implements NotifierInterface {

    private NotifierInterface ni;

    public NotifierTelegram(NotifierInterface notifierInterface) {
        this.ni = notifierInterface;
    }
    
    @Override
    public void write(String data) {
        
        String attStatus = attMsg(data);
        ni.write(attStatus);

    }

    private String attMsg(String data) {
        return "Telegram: " + data + "\n";
    }

    
}
