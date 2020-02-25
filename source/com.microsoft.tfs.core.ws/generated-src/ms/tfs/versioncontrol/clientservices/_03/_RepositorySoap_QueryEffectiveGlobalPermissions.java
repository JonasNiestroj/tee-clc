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

import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryEffectiveGlobalPermissions;

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
public class _RepositorySoap_QueryEffectiveGlobalPermissions
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String identityName;

    public _RepositorySoap_QueryEffectiveGlobalPermissions()
    {
        super();
    }

    public _RepositorySoap_QueryEffectiveGlobalPermissions(final String identityName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setIdentityName(identityName);
    }

    public String getIdentityName()
    {
        return this.identityName;
    }

    public void setIdentityName(String value)
    {
        this.identityName = value;
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
            "identityName",
            this.identityName);

        writer.writeEndElement();
    }
}
