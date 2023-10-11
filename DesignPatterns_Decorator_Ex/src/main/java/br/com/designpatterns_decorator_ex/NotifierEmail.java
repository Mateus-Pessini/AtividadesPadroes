package br.com.designpatterns_decorator_ex;

public class NotifierEmail implements NotifierInterface {

    private NotifierInterface ni;

    public NotifierEmail(NotifierInterface notifierInterface) {
        this.ni = notifierInterface;
    }

    @Override
    public void write(String data) {

        String attStatus = attMsg(data);
        ni.write(attStatus);

    }

    private String attMsg(String data) {
        return "E-mail: " + data + "\n";
    }

}
