package js.web.paymentrequest;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentCurrencyAmount extends Any {
    @JSProperty
    String getCurrency();

    @JSProperty
    void setCurrency(String currency);

    @JSProperty
    @Nullable
    String getCurrencySystem();

    @JSProperty
    void setCurrencySystem(String currencySystem);

    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

}
