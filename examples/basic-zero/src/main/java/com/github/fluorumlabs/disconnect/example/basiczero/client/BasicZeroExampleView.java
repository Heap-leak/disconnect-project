package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.zero.component.html.Button;
import com.github.fluorumlabs.disconnect.zero.component.html.Div;
import com.github.fluorumlabs.disconnect.zero.component.html.H1;
import com.github.fluorumlabs.disconnect.zero.component.html.Paragraph;
import js.lang.JsDate;
import js.util.buffers.Uint8Array;
import js.util.collections.IntShortPair;

import static js.web.dom.Window.CONSOLE;


public class BasicZeroExampleView extends Div {
    {
        add(new H1().text("Disconnect: Basic example"));

        Uint8Array array = Uint8Array.of((short) 4, (short) 8, (short) 15, (short) 16, (short) 23, (short) 42);
        CONSOLE.debug(array);
        for (IntShortPair intShortPair : array.entries().iterable()) {
            CONSOLE.warn("Pair", intShortPair);
        }

        Button button = new Button().text("Click me");
        button.clickEvent().accept(buttonTarget -> {
            add(new Paragraph().text("Button was clicked on " + JsDate.create().toISOString()));
        });

        button.visibilityChangeEvent().accept(evt -> {
            add(new Paragraph().text("Button visibility changed to " + evt.becameVisible()));
        });

        Button hideButton = new Button().text("Hide button");
        hideButton.clickEvent().accept(buttonTarget -> {
            button.toggleVisibility();
        });

        add(button, hideButton);
    }
}
