package js.web.performance;

import js.lang.Unknown;
import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done. */
        public interface PerformanceNavigation extends Any {
        @JSProperty
        int getRedirectCount();

        @JSProperty
        Type getType();

        Unknown toJSON();

        abstract class Type extends JsEnum {
        public static final Type TYPE_BACK_FORWARD = JsEnum.from("return PerformanceNavigation.TYPE_BACK_FORWARD");

        public static final Type TYPE_NAVIGATE = JsEnum.from("return PerformanceNavigation.TYPE_NAVIGATE");

        public static final Type TYPE_RELOAD = JsEnum.from("return PerformanceNavigation.TYPE_RELOAD");

        public static final Type TYPE_RESERVED = JsEnum.from("return PerformanceNavigation.TYPE_RESERVED");}

        @JSBody(script = "return PerformanceNavigation.prototype")
        static PerformanceNavigation prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PerformanceNavigation()")
        static PerformanceNavigation create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
