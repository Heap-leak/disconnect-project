package js.web.dom;

import js.lang.Any;
import js.web.mse.SourceBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A single audio track from one of the HTML media elements, <audio> or <video>.  */
public interface AudioTrack extends Any {
    @JSProperty
    boolean isEnabled();

    @JSProperty
    void setEnabled(boolean enabled);

    @JSProperty
    String getId();

    @JSProperty
    String getKind();

    @JSProperty
    void setKind(String kind);

    @JSProperty
    String getLabel();

    @JSProperty
    String getLanguage();

    @JSProperty
    void setLanguage(String language);

    @JSProperty
    @Nullable
    SourceBuffer getSourceBuffer();

    @JSBody(script = "return AudioTrack.prototype")
    static AudioTrack prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioTrack()")
    static AudioTrack create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
