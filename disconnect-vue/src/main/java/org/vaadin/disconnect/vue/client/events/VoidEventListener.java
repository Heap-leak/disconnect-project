package org.vaadin.disconnect.vue.client.events;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@JSFunctor
public interface VoidEventListener extends JSObject {
    void handle();
}
