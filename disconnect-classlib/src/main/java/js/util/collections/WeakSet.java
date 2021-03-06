package js.util.collections;

import js.lang.Any;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public abstract class WeakSet<T extends Any> implements Any {
    @JSBody(script = "return WeakSet.prototype")
    static WeakSet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WeakSet()")
    static <T extends Any> WeakSet<T> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(Array<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(JsIterable<T> values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "values", script = "return new WeakSet(values)")
    static <T extends Any> WeakSet<T> create(T... values) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    public native WeakSet<T> add(T value);

    public native boolean delete(T value);

    public native boolean has(T value);

}
