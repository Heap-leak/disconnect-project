package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface DoubleIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    DoubleIterator getIterator();

    default Iterable<Double> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
