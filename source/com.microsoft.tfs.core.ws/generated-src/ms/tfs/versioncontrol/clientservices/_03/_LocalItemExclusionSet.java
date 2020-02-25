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

import ms.tfs.versioncontrol.clientservices._03._LocalItemExclusionSet;

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
public class _LocalItemExclusionSet
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String[] exclusions;
    protected String watermark;

    public _LocalItemExclusionSet()
    {
        super();
    }

    public _LocalItemExclusionSet(
        final String[] exclusions,
        final String watermark)
    {
        // TODO : Call super() instead of setting all fields directly?
        setExclusions(exclusions);
        setWatermark(watermark);
    }

    public String[] getExclusions()
    {
        return this.exclusions;
    }

    public void setExclusions(String[] value)
    {
        this.exclusions = value;
    }

    public String getWatermark()
    {
        return this.watermark;
    }

    public void setWatermark(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Watermark' is a required element, its value cannot be null");
        }

        this.watermark = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.exclusions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Exclusions");

            for (int iterator0 = 0; iterator0 < this.exclusions.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.exclusions[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Watermark",
            this.watermark);

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

                if (localName.equalsIgnoreCase("Exclusions"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(reader.getElementText());
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.exclusions = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Watermark"))
                {
                    this.watermark = reader.getElementText();
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
