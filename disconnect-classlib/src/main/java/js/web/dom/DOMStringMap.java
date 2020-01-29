package js.web.dom;

import org.teavm.jso.JSBody;

import js.util.StringRecord;

/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
public interface DOMStringMap extends StringRecord {
    @JSBody(script = "return DOMStringMap.prototype")
    static DOMStringMap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMStringMap()")
    static DOMStringMap create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
