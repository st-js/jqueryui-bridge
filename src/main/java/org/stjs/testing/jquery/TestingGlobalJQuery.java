package org.stjs.testing.jquery;

import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryAndPlugins;

@GlobalScope
@SyntheticType
public final class TestingGlobalJQuery {
	public static TestingJQueryNamespace $;

	/**
	 * jquery constructors
	 */
	public native static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path);

	public native static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path, Object context);

	public native static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(Object path);

}
