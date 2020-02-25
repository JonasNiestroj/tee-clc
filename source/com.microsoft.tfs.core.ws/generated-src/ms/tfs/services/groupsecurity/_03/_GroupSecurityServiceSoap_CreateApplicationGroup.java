// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.groupsecurity._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.groupsecurity._03._GroupSecurityServiceSoap_CreateApplicationGroup;

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
public class _GroupSecurityServiceSoap_CreateApplicationGroup
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String projectUri;
    protected String groupName;
    protected String groupDescription;

    public _GroupSecurityServiceSoap_CreateApplicationGroup()
    {
        super();
    }

    public _GroupSecurityServiceSoap_CreateApplicationGroup(
        final String projectUri,
        final String groupName,
        final String groupDescription)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProjectUri(projectUri);
        setGroupName(groupName);
        setGroupDescription(groupDescription);
    }

    public String getProjectUri()
    {
        return this.projectUri;
    }

    public void setProjectUri(String value)
    {
        this.projectUri = value;
    }

    public String getGroupName()
    {
        return this.groupName;
    }

    public void setGroupName(String value)
    {
        this.groupName = value;
    }

    public String getGroupDescription()
    {
        return this.groupDescription;
    }

    public void setGroupDescription(String value)
    {
        this.groupDescription = value;
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
            "projectUri",
            this.projectUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "groupName",
            this.groupName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "groupDescription",
            this.groupDescription);

        writer.writeEndElement();
    }
}
