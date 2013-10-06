package org.stjs.testing.jquery;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryUINamespace;

@SyntheticType
abstract public class TestingJQueryNamespace extends JQueryUINamespace {
	native public String mockjax(MockjaxOptions options);

	native public void mockjaxClear();

	native public void mockjaxClear(String id);
}
