package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import js.web.dom.BufferSource;


public interface AesCbcParams extends Algorithm {
    @JSProperty
    BufferSource getIv();

    @JSProperty
    void setIv(BufferSource iv);


}
