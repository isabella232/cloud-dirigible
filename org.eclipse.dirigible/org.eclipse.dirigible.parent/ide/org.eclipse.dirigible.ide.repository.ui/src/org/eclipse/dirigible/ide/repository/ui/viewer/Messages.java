/******************************************************************************* 
 * Copyright (c) 2015 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.ide.repository.ui.viewer;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.dirigible.ide.repository.ui.viewer.messages"; //$NON-NLS-1$
	public static String ArtifactTreeContentProvider_COULD_NOT_CHECK_IF_COLLECTION_HAS_CHILDREN;
	public static String ArtifactTreeContentProvider_COULD_NOT_RESOLVE_COLLECTION_S_CHILDREN;
	public static String ArtifactTreeContentProvider_ERROR_CLICK_TO_RETRY;
	public static String REPOSITORY_ROOT;
	public static String RepositoryViewerResolveNode_CLICK_TO_RESOLVE;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
