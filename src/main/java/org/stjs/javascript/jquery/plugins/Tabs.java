/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.javascript.jquery.plugins;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryCore;

@SyntheticType
public interface Tabs<FullJQuery extends JQueryCore<?>> {
	public FullJQuery tabs();

	public FullJQuery tabs(TabsOptions<FullJQuery> options);

	public FullJQuery tabs(String methodName);

	public Object tabs(String option, String optionName);

	public FullJQuery tabs(String methodName, int index);

	public FullJQuery tabs(String option, String optionName, Object value);

	public Object tabs(String option, String optionName, Object value, int index);

	public FullJQuery tabs(String option, int index, String url);

	public FullJQuery tabs(String option, TabsOptions<FullJQuery> options);
}