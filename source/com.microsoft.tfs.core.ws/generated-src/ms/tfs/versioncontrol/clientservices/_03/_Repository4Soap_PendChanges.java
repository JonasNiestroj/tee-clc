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

import ms.tfs.versioncontrol.clientservices._03._ChangeRequest;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_PendChanges;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

import java.lang.Object;
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
public class _Repository4Soap_PendChanges
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String ownerName;
    protected _ChangeRequest[] changes;
    protected int pendChangesOptions;
    protected int supportedFeatures;
    protected String[] itemPropertyFilters;
    protected String[] itemAttributeFilters;

    public _Repository4Soap_PendChanges()
    {
        super();
    }

    public _Repository4Soap_PendChanges(
        final String workspaceName,
        final String ownerName,
        final _ChangeRequest[] changes,
        final int pendChangesOptions,
        final int supportedFeatures,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setOwnerName(ownerName);
        setChanges(changes);
        setPendChangesOptions(pendChangesOptions);
        setSupportedFeatures(supportedFeatures);
        setItemPropertyFilters(itemPropertyFilters);
        setItemAttributeFilters(itemAttributeFilters);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public _ChangeRequest[] getChanges()
    {
        return this.changes;
    }

    public void setChanges(_ChangeRequest[] value)
    {
        this.changes = value;
    }

    public int getPendChangesOptions()
    {
        return this.pendChangesOptions;
    }

    public void setPendChangesOptions(int value)
    {
        this.pendChangesOptions = value;
    }

    public int getSupportedFeatures()
    {
        return this.supportedFeatures;
    }

    public void setSupportedFeatures(int value)
    {
        this.supportedFeatures = value;
    }

    public String[] getItemPropertyFilters()
    {
        return this.itemPropertyFilters;
    }

    public void setItemPropertyFilters(String[] value)
    {
        this.itemPropertyFilters = value;
    }

    public String[] getItemAttributeFilters()
    {
        return this.itemAttributeFilters;
    }

    public void setItemAttributeFilters(String[] value)
    {
        this.itemAttributeFilters = value;
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
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ownerName",
            this.ownerName);

        if (this.changes != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("changes");

            for (int iterator0 = 0; iterator0 < this.changes.length; iterator0++)
            {
                this.changes[iterator0].writeAsElement(
                    writer,
                    "ChangeRequest");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "pendChangesOptions",
            this.pendChangesOptions);
        XMLStreamWriterHelper.writeElement(
            writer,
            "supportedFeatures",
            this.supportedFeatures);

        if (this.itemPropertyFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemPropertyFilters");

            for (int iterator0 = 0; iterator0 < this.itemPropertyFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemPropertyFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.itemAttributeFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemAttributeFilters");

            for (int iterator0 = 0; iterator0 < this.itemAttributeFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemAttributeFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
