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

import ms.tfs.versioncontrol.clientservices._03._ItemIdentifier;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_TrackMerges;
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
public class _RepositoryExtensionsSoap_TrackMerges
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int[] sourceChangesets;
    protected _ItemIdentifier sourceItem;
    protected _ItemIdentifier[] targetItems;
    protected _ItemSpec pathFilter;

    public _RepositoryExtensionsSoap_TrackMerges()
    {
        super();
    }

    public _RepositoryExtensionsSoap_TrackMerges(
        final int[] sourceChangesets,
        final _ItemIdentifier sourceItem,
        final _ItemIdentifier[] targetItems,
        final _ItemSpec pathFilter)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSourceChangesets(sourceChangesets);
        setSourceItem(sourceItem);
        setTargetItems(targetItems);
        setPathFilter(pathFilter);
    }

    public int[] getSourceChangesets()
    {
        return this.sourceChangesets;
    }

    public void setSourceChangesets(int[] value)
    {
        this.sourceChangesets = value;
    }

    public _ItemIdentifier getSourceItem()
    {
        return this.sourceItem;
    }

    public void setSourceItem(_ItemIdentifier value)
    {
        this.sourceItem = value;
    }

    public _ItemIdentifier[] getTargetItems()
    {
        return this.targetItems;
    }

    public void setTargetItems(_ItemIdentifier[] value)
    {
        this.targetItems = value;
    }

    public _ItemSpec getPathFilter()
    {
        return this.pathFilter;
    }

    public void setPathFilter(_ItemSpec value)
    {
        this.pathFilter = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.sourceChangesets != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("sourceChangesets");

            for (int iterator0 = 0; iterator0 < this.sourceChangesets.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.sourceChangesets[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.sourceItem != null)
        {
            this.sourceItem.writeAsElement(
                writer,
                "sourceItem");
        }

        if (this.targetItems != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("targetItems");

            for (int iterator0 = 0; iterator0 < this.targetItems.length; iterator0++)
            {
                this.targetItems[iterator0].writeAsElement(
                    writer,
                    "ItemIdentifier");
            }

            writer.writeEndElement();
        }

        if (this.pathFilter != null)
        {
            this.pathFilter.writeAsElement(
                writer,
                "pathFilter");
        }

        writer.writeEndElement();
    }
}
