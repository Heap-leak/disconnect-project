package js.web.webcrypto;

import js.lang.Unknown;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface HkdfCtrParams extends Algorithm {
    @JSProperty
    BufferSource getContext();

    @JSProperty
    void setContext(BufferSource context);

    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);

    @JSProperty
    void setHash(Algorithm hash);

    @JSProperty
    BufferSource getLabel();

    @JSProperty
    void setLabel(BufferSource label);

}
