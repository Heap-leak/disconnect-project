package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DOMPointInit extends Any {
    @JSProperty
    double getW();

    @JSProperty
    void setW(double w);

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    double getZ();

    @JSProperty
    void setZ(double z);

}
