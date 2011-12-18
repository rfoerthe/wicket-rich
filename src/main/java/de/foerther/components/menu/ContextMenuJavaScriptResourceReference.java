/*
 * Copyright (c) 2009 WiQuery team
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.foerther.components.menu;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

/**
 *
 * @author Roland Förther
 */
public class ContextMenuJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	/**
	 * Singleton instance.
	 */
	private static ContextMenuJavaScriptResourceReference instance =
		new ContextMenuJavaScriptResourceReference();

	/**
	 * Builds a new instance of {@link de.foerther.components.menu.ContextMenuJavaScriptResourceReference}.
	 */
	private ContextMenuJavaScriptResourceReference()
	{
		super(ContextMenuJavaScriptResourceReference.class, "jquery.contextmenu.js");
	}

	/**
	 * Returns the {@link de.foerther.components.menu.ContextMenuJavaScriptResourceReference} instance.
	 */
	public static ContextMenuJavaScriptResourceReference get()
	{
		return instance;
	}

}
