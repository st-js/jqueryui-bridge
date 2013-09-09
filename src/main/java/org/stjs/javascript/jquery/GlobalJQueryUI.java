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
package org.stjs.javascript.jquery;

import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.SyntheticType;

@GlobalScope
@SyntheticType
abstract public class GlobalJQueryUI {
	public static JQueryUINamespace $;

	/**
	 * jquery constructors
	 */
	public static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path) {
		return null;
	}

	public static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(String path, Object context) {
		return null;
	}

	public static <FullJQuery extends JQueryAndPlugins<?>> FullJQuery $(Object path) {
		return null;
	}

}
