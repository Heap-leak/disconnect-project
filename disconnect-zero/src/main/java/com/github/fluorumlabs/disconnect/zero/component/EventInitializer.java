package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventTarget;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


public interface EventInitializer<X extends EventTarget> {
	<T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer);

	<T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier);

	<T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers);

	<T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener);

	<T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener,
                                                                  BiConsumer<X, EventListener<T>>... addEventListeners);

	<T, E extends ObservableValue<T>> E createObservableValue(Supplier<T> getter,
															  Consumer<T> setter,
															  ObservableEvent<?> event);

	default <T, E extends ObservableValue<T>> E createObservableValue(Supplier<T> getter,
															  Consumer<T> setter,
															  String event) {
		return createObservableValue(getter, setter, createEvent(event));
	}

	default <T, E extends ObservableValue<T>> E createObservableValue(Supplier<T> getter,
															  Consumer<T> setter,
															  String event, String... altEvents) {
		return createObservableValue(getter, setter, createEvent(event, altEvents));
	}
}
