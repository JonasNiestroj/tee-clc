// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebService2Soap_UpdateApplicationGroup;

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
public class _IdentityManagementWebService2Soap_UpdateApplicationGroup
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _IdentityDescriptor groupDescriptor;
    protected int groupProperty;
    protected String newValue;

    public _IdentityManagementWebService2Soap_UpdateApplicationGroup()
    {
        super();
    }

    public _IdentityManagementWebService2Soap_UpdateApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final int groupProperty,
        final String newValue)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGroupDescriptor(groupDescriptor);
        setGroupProperty(groupProperty);
        setNewValue(newValue);
    }

    public _IdentityDescriptor getGroupDescriptor()
    {
        return this.groupDescriptor;
    }

    public void setGroupDescriptor(_IdentityDescriptor value)
    {
        this.groupDescriptor = value;
    }

    public int getGroupProperty()
    {
        return this.groupProperty;
    }

    public void setGroupProperty(int value)
    {
        this.groupProperty = value;
    }

    public String getNewValue()
    {
        return this.newValue;
    }

    public void setNewValue(String value)
    {
        this.newValue = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.groupDescriptor != null)
        {
            this.groupDescriptor.writeAsElement(
                writer,
                "groupDescriptor");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "groupProperty",
            this.groupProperty);
        XMLStreamWriterHelper.writeElement(
            writer,
            "newValue",
            this.newValue);

        writer.writeEndElement();
    }
}
