package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <feDisplacementMap> element. */
        public interface SVGFEDisplacementMapElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
        @JSProperty
        SVGAnimatedString getIn1();

        @JSProperty
        SVGAnimatedString getIn2();

        @JSProperty
        SVGAnimatedNumber getScale();

        @JSProperty
        SVGAnimatedEnumeration<Channel> getXChannelSelector();

        @JSProperty
        SVGAnimatedEnumeration<Channel> getYChannelSelector();

        abstract class Channel extends JsEnum {
        public static final Channel SVG_CHANNEL_A = JsEnum.from("return SVGFEDisplacementMapElement.SVG_CHANNEL_A");

        public static final Channel SVG_CHANNEL_B = JsEnum.from("return SVGFEDisplacementMapElement.SVG_CHANNEL_B");

        public static final Channel SVG_CHANNEL_G = JsEnum.from("return SVGFEDisplacementMapElement.SVG_CHANNEL_G");

        public static final Channel SVG_CHANNEL_R = JsEnum.from("return SVGFEDisplacementMapElement.SVG_CHANNEL_R");

        public static final Channel SVG_CHANNEL_UNKNOWN = JsEnum.from("return SVGFEDisplacementMapElement.SVG_CHANNEL_UNKNOWN");}

        @JSBody(script = "return SVGFEDisplacementMapElement.prototype")
        static SVGFEDisplacementMapElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGFEDisplacementMapElement()")
        static SVGFEDisplacementMapElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
