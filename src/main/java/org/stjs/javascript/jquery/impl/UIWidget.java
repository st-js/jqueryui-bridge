package org.stjs.javascript.jquery.impl;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryAndPlugins;

@SyntheticType
abstract public class UIWidget<FullJQuery extends JQueryAndPlugins<?>> {
	protected native void _trigger(String event);

	protected native void _init();

	@Override
	public native FullJQuery clone();
}
