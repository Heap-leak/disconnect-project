package js.web.dom.svg;

import js.web.canvas.CanvasImageSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <image> element. */
        public interface SVGImageElement extends SVGGraphicsElement, SVGURIReference, CanvasImageSource {
        @JSProperty
        SVGAnimatedLength getHeight();

        @JSProperty
        SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

        @JSProperty
        SVGAnimatedLength getWidth();

        @JSProperty
        SVGAnimatedLength getX();

        @JSProperty
        SVGAnimatedLength getY();

        @JSBody(script = "return SVGImageElement.prototype")
        static SVGImageElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGImageElement()")
        static SVGImageElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
