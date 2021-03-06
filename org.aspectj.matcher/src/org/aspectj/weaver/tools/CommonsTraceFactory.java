/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Matthew Webster - initial implementation
 *******************************************************************************/
package org.aspectj.weaver.tools;

import org.apache.commons.logging.LogFactory;
//OPTIMIZE move out of main weaver for now?
public class CommonsTraceFactory extends TraceFactory {

	private LogFactory logFactory = LogFactory.getFactory();
	
	public Trace getTrace(Class clazz) {
		return new CommonsTrace(clazz);
	}

}
