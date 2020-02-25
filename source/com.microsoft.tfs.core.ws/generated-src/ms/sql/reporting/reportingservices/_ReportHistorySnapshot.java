// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ReportHistorySnapshot;

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
public class _ReportHistorySnapshot
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String historyID;
    protected Calendar creationDate;
    protected int size;

    public _ReportHistorySnapshot()
    {
        super();
    }

    public _ReportHistorySnapshot(
        final String historyID,
        final Calendar creationDate,
        final int size)
    {
        // TODO : Call super() instead of setting all fields directly?
        setHistoryID(historyID);
        setCreationDate(creationDate);
        setSize(size);
    }

    public String getHistoryID()
    {
        return this.historyID;
    }

    public void setHistoryID(String value)
    {
        this.historyID = value;
    }

    public Calendar getCreationDate()
    {
        return this.creationDate;
    }

    public void setCreationDate(Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'CreationDate' is a required element, its value cannot be null");
        }

        this.creationDate = value;
    }

    public int getSize()
    {
        return this.size;
    }

    public void setSize(int value)
    {
        this.size = value;
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
            "HistoryID",
            this.historyID);
        XMLStreamWriterHelper.writeElement(
            writer,
            "CreationDate",
            this.creationDate,
            true);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Size",
            this.size);

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

                if (localName.equalsIgnoreCase("HistoryID"))
                {
                    this.historyID = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("CreationDate"))
                {
                    this.creationDate = XMLConvert.toCalendar(
                            reader.getElementText(),
                            true);
                }
                else if (localName.equalsIgnoreCase("Size"))
                {
                    this.size = XMLConvert.toInt(reader.getElementText());
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