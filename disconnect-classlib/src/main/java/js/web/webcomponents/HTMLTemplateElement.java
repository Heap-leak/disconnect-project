package js.web.webcomponents;

import js.web.dom.DocumentFragment;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Enables access to the contents of an HTML <template> element. */
public interface HTMLTemplateElement extends HTMLElement {
    @JSProperty
    DocumentFragment getContent();

    @JSBody(script = "return HTMLTemplateElement.prototype")
    static HTMLTemplateElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTemplateElement()")
    static HTMLTemplateElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
