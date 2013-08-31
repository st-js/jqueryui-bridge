package org.stjs.javascript.jquery.impl;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.Event;
import org.stjs.javascript.jquery.JQueryAndPlugins;

/**
 * This class is used when you want to develop your own widgets
 * 
 * @author acraciun
 * 
 */
@SyntheticType
abstract public class UIMousePlugin<FullJQuery extends JQueryAndPlugins<?>> extends UIWidget<FullJQuery> {
	protected FullJQuery helper;

	protected native boolean _mouseCapture(Event ev);

	protected native void _mouseInit();

	protected native void _mouseDrag(Event ev);

	protected native void _mouseStart(Event ev);

	protected native void _mouseStop(Event ev);
}
