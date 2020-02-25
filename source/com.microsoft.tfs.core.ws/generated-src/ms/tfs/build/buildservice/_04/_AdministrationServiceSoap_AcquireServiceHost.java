// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AcquireServiceHost;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AdministrationServiceSoap_AcquireServiceHost
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String serviceHostUri;
    protected String ownerName;

    public _AdministrationServiceSoap_AcquireServiceHost()
    {
        super();
    }

    public _AdministrationServiceSoap_AcquireServiceHost(
        final String serviceHostUri,
        final String ownerName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setServiceHostUri(serviceHostUri);
        setOwnerName(ownerName);
    }

    public String getServiceHostUri()
    {
        return this.serviceHostUri;
    }

    public void setServiceHostUri(String value)
    {
        this.serviceHostUri = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "serviceHostUri",
            this.serviceHostUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ownerName",
            this.ownerName);

        writer.writeEndElement();
    }
}
