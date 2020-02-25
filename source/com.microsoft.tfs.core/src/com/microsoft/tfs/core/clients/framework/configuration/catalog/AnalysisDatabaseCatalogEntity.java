// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.framework.configuration.catalog;

import com.microsoft.tfs.core.clients.framework.catalog.CatalogNode;
import com.microsoft.tfs.core.clients.framework.configuration.entities.AnalysisDatabaseEntity;
import com.microsoft.tfs.core.clients.framework.configuration.internal.TFSCatalogEntitySession;

/**
 * @since TEE-SDK-10.1
 */
public class AnalysisDatabaseCatalogEntity extends TFSCatalogEntity implements AnalysisDatabaseEntity {
    public AnalysisDatabaseCatalogEntity(final TFSCatalogEntitySession session, final CatalogNode catalogNode) {
        super(session, catalogNode);
    }
}
