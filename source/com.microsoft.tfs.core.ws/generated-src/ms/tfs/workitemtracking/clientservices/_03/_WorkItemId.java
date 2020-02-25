// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._WorkItemId;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _WorkItemId
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected int id;
    protected long rowVersion;

    public _WorkItemId()
    {
        super();
    }

    public _WorkItemId(
        final int id,
        final long rowVersion)
    {
        // TODO : Call super() instead of setting all fields directly?
        setId(id);
        setRowVersion(rowVersion);
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int value)
    {
        this.id = value;
    }

    public long getRowVersion()
    {
        return this.rowVersion;
    }

    public void setRowVersion(long value)
    {
        this.rowVersion = value;
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
            "Id",
            this.id);
        XMLStreamWriterHelper.writeElement(
            writer,
            "RowVersion",
            this.rowVersion);

        writer.writeEndElement();
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

                if (localName.equalsIgnoreCase("Id"))
                {
                    this.id = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("RowVersion"))
                {
                    this.rowVersion = XMLConvert.toLong(reader.getElementText());
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
