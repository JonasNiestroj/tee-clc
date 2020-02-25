// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ArtifactPropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ArtifactSpec;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetChangesetPropertyResponse;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _RepositoryExtensionsSoap_GetChangesetPropertyResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ArtifactPropertyValue getChangesetPropertyResult;

    public _RepositoryExtensionsSoap_GetChangesetPropertyResponse()
    {
        super();
    }

    public _RepositoryExtensionsSoap_GetChangesetPropertyResponse(
        final _ArtifactPropertyValue getChangesetPropertyResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetChangesetPropertyResult(getChangesetPropertyResult);
    }

    public _ArtifactPropertyValue getGetChangesetPropertyResult()
    {
        return this.getChangesetPropertyResult;
    }

    public void setGetChangesetPropertyResult(_ArtifactPropertyValue value)
    {
        this.getChangesetPropertyResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetChangesetPropertyResult"))
                {
                    this.getChangesetPropertyResult = new _ArtifactPropertyValue();
                    this.getChangesetPropertyResult.readFromElement(reader);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
