package homework18;

import java.util.Arrays;

public class Otel extends House implements Action{
    private Person[] otelFamily;

    public Otel(Person[] otelFamily) {
        super(otelFamily);
        this.otelFamily = otelFamily;
    }

    public Person[] getOtelFamily() {
        return otelFamily;
    }

    public void setOtelFamily(Person[] otelFamily) {
        this.otelFamily = otelFamily;
    }

    @Override
    public void zhashoo() {
        System.out.println("We live in "+ getClass().getSimpleName());
    }

    @Override
    public void payForLive() {
Action.super.payForLive();
    }

    @Override
    public String toString() {
        return "Otel{" +
                "otelFamily=" + Arrays.toString(otelFamily) +
                '}';
    }
}
