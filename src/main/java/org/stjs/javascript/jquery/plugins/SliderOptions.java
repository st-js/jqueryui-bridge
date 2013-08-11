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

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryCore;

@SyntheticType
public class SliderOptions<FullJQuery extends JQueryCore<?>> {
	public boolean disabled = false;
	public double min = 0;
	public double max = 100;
	public double step = 1;
	public double value = 0;
	public String orientation = "horizontal";

	public Object animate = false;

	public Object range = false;

	public Array<Double> values;

	public UIEventHandler<SliderUI<FullJQuery>> create;
	public UIEventHandler<SliderUI<FullJQuery>> start;

	public UIEventHandler<SliderUI<FullJQuery>> slide;
	public UIEventHandler<SliderUI<FullJQuery>> change;
	public UIEventHandler<SliderUI<FullJQuery>> stop;
}
