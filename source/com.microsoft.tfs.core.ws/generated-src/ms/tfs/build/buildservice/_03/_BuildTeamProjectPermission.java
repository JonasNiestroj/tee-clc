// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildTeamProjectPermission;

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
public class _BuildTeamProjectPermission
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String[] allows;
    protected String[] denies;
    protected String identityName;

    public _BuildTeamProjectPermission()
    {
        super();
    }

    public _BuildTeamProjectPermission(
        final String[] allows,
        final String[] denies,
        final String identityName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAllows(allows);
        setDenies(denies);
        setIdentityName(identityName);
    }

    public String[] getAllows()
    {
        return this.allows;
    }

    public void setAllows(String[] value)
    {
        this.allows = value;
    }

    public String[] getDenies()
    {
        return this.denies;
    }

    public void setDenies(String[] value)
    {
        this.denies = value;
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
        if (this.allows != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Allows");

            for (int iterator0 = 0; iterator0 < this.allows.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.allows[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.denies != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Denies");

            for (int iterator0 = 0; iterator0 < this.denies.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.denies[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "IdentityName",
            this.identityName);

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

                if (localName.equalsIgnoreCase("Allows"))
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

                    this.allows = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Denies"))
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

                    this.denies = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("IdentityName"))
                {
                    this.identityName = reader.getElementText();
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
