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
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService3Soap_GetMetadataEx2Response;

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
public class _ClientService3Soap_GetMetadataEx2Response
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected AnyContentType metadata;
    protected String dbStamp;
    protected int locale;
    protected int comparisonStyle;
    protected int mode;

    public _ClientService3Soap_GetMetadataEx2Response()
    {
        super();
    }

    public _ClientService3Soap_GetMetadataEx2Response(
        final AnyContentType metadata,
        final String dbStamp,
        final int locale,
        final int comparisonStyle,
        final int mode)
    {
        // TODO : Call super() instead of setting all fields directly?
        setMetadata(metadata);
        setDbStamp(dbStamp);
        setLocale(locale);
        setComparisonStyle(comparisonStyle);
        setMode(mode);
    }

    public AnyContentType getMetadata()
    {
        return this.metadata;
    }

    public void setMetadata(AnyContentType value)
    {
        this.metadata = value;
    }

    public String getDbStamp()
    {
        return this.dbStamp;
    }

    public void setDbStamp(String value)
    {
        this.dbStamp = value;
    }

    public int getLocale()
    {
        return this.locale;
    }

    public void setLocale(int value)
    {
        this.locale = value;
    }

    public int getComparisonStyle()
    {
        return this.comparisonStyle;
    }

    public void setComparisonStyle(int value)
    {
        this.comparisonStyle = value;
    }

    public int getMode()
    {
        return this.mode;
    }

    public void setMode(int value)
    {
        this.mode = value;
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

                if (localName.equalsIgnoreCase("metadata"))
                {
                    if (this.metadata == null)
                    {
                        throw new XMLStreamException(
                                "An AnyContentType implementation must be supplied by the caller "
                                + "for the 'metadata' field before deserialization can occur.");
                    }

                    this.metadata.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("dbStamp"))
                {
                    this.dbStamp = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("locale"))
                {
                    this.locale = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("comparisonStyle"))
                {
                    this.comparisonStyle = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("mode"))
                {
                    this.mode = XMLConvert.toInt(reader.getElementText());
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
