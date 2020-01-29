package js.web.mediastreams;

import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;

import org.teavm.jso.JSByRef;


public interface ConstrainVideoFacingModeParameters extends Any {
    @JSProperty
    @Nullable
    Unknown getExact();

    @JSProperty
    void setExact(VideoFacingModeEnum exact);

    @JSProperty
    void setExact(@JSByRef VideoFacingModeEnum... exact);

    @JSProperty
    void setExact(Array<VideoFacingModeEnum> exact);

    @JSProperty
    @Nullable
    Unknown getIdeal();

    @JSProperty
    void setIdeal(VideoFacingModeEnum ideal);

    @JSProperty
    void setIdeal(@JSByRef VideoFacingModeEnum... ideal);

    @JSProperty
    void setIdeal(Array<VideoFacingModeEnum> ideal);

}
