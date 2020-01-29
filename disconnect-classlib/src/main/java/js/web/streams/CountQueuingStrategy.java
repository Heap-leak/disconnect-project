package js.web.streams;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
public interface CountQueuingStrategy extends QueuingStrategy {
    @JSProperty
    int getHighWaterMark();

    @JSProperty
    void setHighWaterMark(int highWaterMark);

    int size(Any chunk);

    interface Options extends Any {
        @JSProperty
        int getHighWaterMark();

        @JSProperty
        void setHighWaterMark(int highWaterMark);
    }

    @JSBody(script = "return CountQueuingStrategy.prototype")
    static CountQueuingStrategy prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="options", script = "return new CountQueuingStrategy(options)")
    static CountQueuingStrategy create(Options options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
