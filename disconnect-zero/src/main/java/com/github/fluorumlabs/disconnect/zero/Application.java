package com.github.fluorumlabs.disconnect.zero;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import js.lang.Unknown;
import js.util.collections.WeakMap;
import js.util.function.JsRunnable;
import js.web.dom.Node;
import js.web.dom.WindowOrWorkerGlobalScope;
import org.teavm.jso.JSBody;

import static js.web.dom.Window.DOCUMENT;
import static js.web.dom.Window.WINDOW;


@Import(symbols = {"$rtd_wrapThread"}, module = "disconnect-core-jar/frontend/thread-wrapper.js")
public final class Application {
    private static final Window window = new Window();
    private static final WeakMap<Unknown, WindowOrWorkerGlobalScope.TimeoutHandle> asyncQueue = WeakMap.create();

    private Application() {
    }

    public static Window window() {
        return window;
    }

    public static void render(AbstractComponent<? extends Node> component) {
        DOCUMENT.getBody().appendChild(component.getRenderedNode());
    }

    public static void async(Runnable action) {
        async(action, action);
    }

    public static void debounce(Runnable action, int milliseconds) {
        debounce(action, action, milliseconds);
    }

    public static void async(Object marker, Runnable action) {
        debounce(marker, action, 0);
    }

    public static void debounce(Object marker, Runnable action, int milliseconds) {
        Unknown actionReference = DisconnectUtils.asJsObject(marker);
        if (asyncQueue.has(actionReference)) {
            WINDOW.clearTimeout(asyncQueue.get(actionReference));
            asyncQueue.delete(actionReference);
        }
        asyncQueue.set(actionReference, WINDOW.setTimeout(wrapRunnable(() -> {
            try {
                action.run();
            } finally {
                asyncQueue.delete(actionReference);
            }
        }), milliseconds));
    }

    @JSBody(params = "runnable", script = "return $rtd_wrapThread.fn(runnable)")
    private static native JsRunnable wrapRunnable(JsRunnable runnable);

}
