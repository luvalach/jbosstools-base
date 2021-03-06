/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.common.meta.action;

import org.jboss.tools.common.model.plugin.ModelPlugin;
import org.jboss.tools.common.model.util.*;

public final class SpecialWizardFactory {
    public static SpecialWizard createSpecialWizard(String classname) {
        try {
            return (SpecialWizard)ModelFeatureFactory.getInstance().createFeatureInstance(classname);
        } catch (ClassCastException e) {
        	ModelPlugin.getPluginLog().logError(e);
            return null;
        }
    }
}

