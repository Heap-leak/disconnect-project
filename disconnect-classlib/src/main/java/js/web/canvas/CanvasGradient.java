package js.web.canvas;

import org.teavm.jso.JSBody;

import js.lang.Any;

/** An opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient() or CanvasRenderingContext2D.createRadialGradient(). */
public interface CanvasGradient extends Any {
    /**
     * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
     *
     * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
     */
    void addColorStop(double offset, String color);

    @JSBody(script = "return CanvasGradient.prototype")
    static CanvasGradient prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CanvasGradient()")
    static CanvasGradient create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
