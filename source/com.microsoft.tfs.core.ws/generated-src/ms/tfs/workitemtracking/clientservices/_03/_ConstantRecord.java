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

import ms.tfs.workitemtracking.clientservices._03._ConstantRecord;

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
public class _ConstantRecord
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected int constantId;
    protected String displayValue;
    protected String accountName;
    protected String sid;
    protected String teamFoundationId;

    public _ConstantRecord()
    {
        super();
    }

    public _ConstantRecord(
        final int constantId,
        final String displayValue,
        final String accountName,
        final String sid,
        final String teamFoundationId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setConstantId(constantId);
        setDisplayValue(displayValue);
        setAccountName(accountName);
        setSid(sid);
        setTeamFoundationId(teamFoundationId);
    }

    public int getConstantId()
    {
        return this.constantId;
    }

    public void setConstantId(int value)
    {
        this.constantId = value;
    }

    public String getDisplayValue()
    {
        return this.displayValue;
    }

    public void setDisplayValue(String value)
    {
        this.displayValue = value;
    }

    public String getAccountName()
    {
        return this.accountName;
    }

    public void setAccountName(String value)
    {
        this.accountName = value;
    }

    public String getSid()
    {
        return this.sid;
    }

    public void setSid(String value)
    {
        this.sid = value;
    }

    public String getTeamFoundationId()
    {
        return this.teamFoundationId;
    }

    public void setTeamFoundationId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'TeamFoundationId' is a required element, its value cannot be null");
        }

        this.teamFoundationId = value;
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
            "ConstantId",
            this.constantId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "DisplayValue",
            this.displayValue);
        XMLStreamWriterHelper.writeElement(
            writer,
            "AccountName",
            this.accountName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Sid",
            this.sid);
        XMLStreamWriterHelper.writeElement(
            writer,
            "TeamFoundationId",
            this.teamFoundationId);

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

                if (localName.equalsIgnoreCase("ConstantId"))
                {
                    this.constantId = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("DisplayValue"))
                {
                    this.displayValue = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("AccountName"))
                {
                    this.accountName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Sid"))
                {
                    this.sid = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("TeamFoundationId"))
                {
                    this.teamFoundationId = reader.getElementText();
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
