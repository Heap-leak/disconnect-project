package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.html.HTMLElement;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.vue.client.router.Route;

/**
 * Created by Artem Godin on 9/20/2019.
 */
@Import(symbols = "renderElementPrototype", module = "./disconnect-vue/render-elementprototype.js", defaultExport = true)
@Import(symbols = "enqueue as vue_enqueue_watch", module = "./disconnect-vue/defer-watches.js")
@Import(symbols = "register as vue_register_watches", module = "./disconnect-vue/defer-watches.js")
public abstract class ComponentInstance implements JSObject {
    @JSBody(params = "instance", script = "this.$options.data = function() { return instance };")
    public native void setJavaInstance(JSObject instance);

    @JSBody(params = "rf", script = "this.$options.render = function(h) { return renderElementPrototype(h, rf()) };")
    public native void setRenderMethod(RenderFunction rf);

    @JSBody(script = "this.$mount(); return this.$el;")
    public native HTMLElement mount();

    @JSBody(script = "this.$forceUpdate();")
    public native void forceUpdate();

    @JSBody(params = {"callback", "callbackFunction"}, script = "this['__'+callback] = callbackFunction;")
    public native void registerCallback(String callback, VoidCallbackFunction callbackFunction);

    @JSIndexer
    public native void set(String name, JSObject value);

    @JSIndexer
    public native JSObject get(String name);

    public Route getRoute() {
        return get("$route").cast();
    }

    @JSBody(params = {"observeFunction", "computeFunction"}, script = "this.$watch(observeFunction, $rtd_wrapThread(computeFunction), { deep: true, immediate: true })")
    public native void watch(ObserveFunction observeFunction, CallbackFunction computeFunction);

    @JSFunctor
    public interface ObserveFunction extends JSObject {
        JSObject observe();
    }

    @JSFunctor
    public interface CallbackFunction extends JSObject {
        void callback(JSObject object);
    }


    @JSFunctor
    public interface VoidCallbackFunction extends JSObject {
        void callback();
    }

    @JSFunctor
    public interface WatchFunction extends JSObject {
        int watch();
    }

    @JSFunctor
    public interface RenderFunction extends JSObject {
        PlatformObject render();
    }
}