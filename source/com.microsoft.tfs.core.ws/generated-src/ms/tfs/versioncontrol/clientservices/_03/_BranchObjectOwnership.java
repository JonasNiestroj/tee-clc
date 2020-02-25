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

import ms.tfs.versioncontrol.clientservices._03._BranchObjectOwnership;
import ms.tfs.versioncontrol.clientservices._03._ItemIdentifier;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

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
public class _BranchObjectOwnership
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ItemIdentifier rootItem;
    protected int versionedItemCount;

    public _BranchObjectOwnership()
    {
        super();
    }

    public _BranchObjectOwnership(
        final _ItemIdentifier rootItem,
        final int versionedItemCount)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRootItem(rootItem);
        setVersionedItemCount(versionedItemCount);
    }

    public _ItemIdentifier getRootItem()
    {
        return this.rootItem;
    }

    public void setRootItem(_ItemIdentifier value)
    {
        this.rootItem = value;
    }

    public int getVersionedItemCount()
    {
        return this.versionedItemCount;
    }

    public void setVersionedItemCount(int value)
    {
        this.versionedItemCount = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.rootItem != null)
        {
            this.rootItem.writeAsElement(
                writer,
                "RootItem");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "VersionedItemCount",
            this.versionedItemCount);

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

                if (localName.equalsIgnoreCase("RootItem"))
                {
                    this.rootItem = new _ItemIdentifier();
                    this.rootItem.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("VersionedItemCount"))
                {
                    this.versionedItemCount = XMLConvert.toInt(reader.getElementText());
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
