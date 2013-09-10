package org.stjs.javascript.jquery.testing;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryUINamespace;

@SyntheticType
public class TestingJQueryNamespace extends JQueryUINamespace {
	native public String mockjax(MockjaxOptions options);

	native public void mockjaxClear();

	native public void mockjaxClear(String id);
}
