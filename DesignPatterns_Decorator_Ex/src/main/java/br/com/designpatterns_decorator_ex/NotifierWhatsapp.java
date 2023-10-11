package br.com.designpatterns_decorator_ex;

public class NotifierWhatsapp implements NotifierInterface {

    private NotifierInterface ni;

    public NotifierWhatsapp(NotifierInterface notifierInterface) {
        this.ni = notifierInterface;
    }

    @Override
    public void write(String data) {

        String attStatus = attMsg(data);
        ni.write(attStatus);

    }

    private String attMsg(String data) {
        return "Whatsapp: " + data + "\n";
    }

}
