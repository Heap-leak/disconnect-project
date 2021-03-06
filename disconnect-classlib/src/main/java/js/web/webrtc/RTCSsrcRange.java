package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCSsrcRange extends Any {
    @JSProperty
    int getMax();

    @JSProperty
    void setMax(int max);

    @JSProperty
    int getMin();

    @JSProperty
    void setMin(int min);

}
