package org.stjs.javascript.jquery;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;

@SyntheticType
abstract public class JQueryUINamespace extends JQueryNamespace {
	abstract public <FullJQuery extends JQueryAndPlugins<?>> void each(JQueryAndPlugins<FullJQuery> collection,
			Callback2<Integer, Element> elementIterationFunction);

	abstract public void widget(String name, Object plugin);
}
