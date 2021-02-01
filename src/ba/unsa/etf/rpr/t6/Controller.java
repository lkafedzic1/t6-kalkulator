package ba.unsa.etf.rpr.t6;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty displej;
    private SimpleStringProperty broj1;
    private  SimpleStringProperty operator; //broj2 je u dispejlu

    public String getDisplej() {
        return displej.get();
    }

    public SimpleStringProperty displejProperty()
    {
        return displej;
    }

    public Controller()    {
        displej = new SimpleStringProperty("0");
        operator = null;
        broj1 = null;
    }

    public void button8(javafx.event.ActionEvent actionEvent) {
        if(displej.get().equals("0"))
            displej.set("8");
        else
            displej.set(displej.get()+"8");
    }

    public void button9(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("9");
        else
            displej.set(displej.get()+"9");
    }

    public void button4(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("4");
        else
            displej.set(displej.get()+"4");
    }

    public void button7(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("7");
        else
            displej.set(displej.get()+"7");
    }

    public void button5(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("5");
        else
            displej.set(displej.get()+"5");
    }


    public void button6(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("6");
        else
            displej.set(displej.get()+"6");
    }

    public void button1(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("1");
        else
            displej.set(displej.get()+"1");
    }

    public void button2(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("2");
        else
            displej.set(displej.get()+"2");
    }

    public void button3(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("3");
        else
            displej.set(displej.get()+"3");
    }

    public void substraction(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("-");
        else
        {
            broj1= new SimpleStringProperty(displej.get());
            operator = new SimpleStringProperty("-");
            displej.set("0");
        }
    }

    public void addition(javafx.event.ActionEvent actionEvent)
    {
        broj1= new SimpleStringProperty(displej.get());
        operator = new SimpleStringProperty("+");
        displej.set("0");
    }

    public void equals(javafx.event.ActionEvent actionEvent)
    {
        if(operator == null)
            displej.get();
        else
        {
            Double br1 = Double.parseDouble(broj1.get());
            Double br2 = Double.parseDouble(displej.get());
            Double rezultat= (double) 0;

            if(operator.get().equals("-"))
                rezultat= br1-br2;
            else if(operator.get().equals("+"))
                rezultat= br1+br2;
            else if(operator.get().equals("*"))
                rezultat=br1*br2;
            else if(operator.get().equals("/"))
            {
                if(br2 == 0)
                {
                    displej.set("error");
                    return;
                }
                rezultat=br1/br2;
            }
            else if(operator.get().equals("%"))
                rezultat= br1%br2;

            System.out.println(br1+" "+br2+" "+rezultat);
            displej.set(rezultat.toString());
        }
    }

    public void button0(javafx.event.ActionEvent actionEvent)
    {
        if(displej.get().equals("0"))
            displej.set("0");
        else
        {
            displej.set(displej.get()+"0");
        }
    }

    public void decimal(javafx.event.ActionEvent actionEvent)
    {
        displej.set(displej.get()+".");
    }

    public void multiplication(javafx.event.ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("*");

        displej.set("0");
    }

    public void divide(javafx.event.ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("/");

        displej.set("0");
    }

    public void modulo(javafx.event.ActionEvent actionEvent)
    {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("%");

        displej.set("0");
    }

    public void division(ActionEvent actionEvent) {
        broj1 = new SimpleStringProperty(displej.get());
        operator= new SimpleStringProperty("/");

        displej.set("0");
    }
}
