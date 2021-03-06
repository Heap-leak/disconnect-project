package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface ItemIndexEvent<ITEM extends Any> extends CustomEvent<ItemIndexEvent.Details<ITEM>> {
	interface Details<ITEM extends Any> extends Any {
		@JSProperty
		ITEM getItem();

		@JSProperty
		int getIndex();
	}
}
