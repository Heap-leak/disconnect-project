package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Correspond to the <length> basic data type. */
        public interface SVGLength extends Any {
        @JSProperty
        int getUnitType();

        @JSProperty
        double getValue();

        @JSProperty
        void setValue(double value);

        @JSProperty
        String getValueAsString();

        @JSProperty
        void setValueAsString(String valueAsString);

        @JSProperty
        double getValueInSpecifiedUnits();

        @JSProperty
        void setValueInSpecifiedUnits(double valueInSpecifiedUnits);

        void convertToSpecifiedUnits(UnitType unitType);
        void newValueSpecifiedUnits(UnitType unitType, double valueInSpecifiedUnits);

        abstract class UnitType extends JsEnum {
        public static final UnitType SVG_LENGTHTYPE_CM = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_CM");

        public static final UnitType SVG_LENGTHTYPE_EMS = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_EMS");


        public static final UnitType SVG_LENGTHTYPE_EXS = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_EXS");

        public static final UnitType SVG_LENGTHTYPE_IN = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_IN");

        public static final UnitType SVG_LENGTHTYPE_MM = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_MM");


        public static final UnitType SVG_LENGTHTYPE_NUMBER = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_NUMBER");


        public static final UnitType SVG_LENGTHTYPE_PC = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_PC");

        public static final UnitType SVG_LENGTHTYPE_PERCENTAGE = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_PERCENTAGE");


        public static final UnitType SVG_LENGTHTYPE_PT = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_PT");
        public static final UnitType SVG_LENGTHTYPE_PX = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_PX");
        public static final UnitType SVG_LENGTHTYPE_UNKNOWN = JsEnum.from("return SVGLength.SVG_LENGTHTYPE_UNKNOWN");}


        @JSBody(script = "return SVGLength.prototype")
        static SVGLength prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGLength()")
        static SVGLength create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
