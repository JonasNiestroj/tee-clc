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

import ms.tfs.versioncontrol.clientservices._03._Mapping;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolderType;

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
public class _Mapping
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String item;
    protected _WorkingFolderType type = _WorkingFolderType.Map;
    protected int depth = 120;

    // No elements    
    public _Mapping()
    {
        super();
    }

    public _Mapping(
        final String item,
        final _WorkingFolderType type,
        final int depth)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setType(type);
        setDepth(depth);
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(final String value)
    {
        this.item = value;
    }

    public _WorkingFolderType getType()
    {
        return this.type;
    }

    public void setType(final _WorkingFolderType value)
    {
        this.type = value;
    }

    public int getDepth()
    {
        return this.depth;
    }

    public void setDepth(final int value)
    {
        this.depth = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "item",
            this.item);

        if (this.type != null)
        {
            this.type.writeAsAttribute(
                writer,
                "type");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "depth",
            this.depth);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("item"))
            {
                this.item = attributeValue;
            }
            else if (localName.equalsIgnoreCase("type"))
            {
                this.type = _WorkingFolderType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("depth"))
            {
                this.depth = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}