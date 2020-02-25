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

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Unshelve;

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
public class _RepositorySoap_Unshelve
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String shelvesetName;
    protected String shelvesetOwner;
    protected String workspaceName;
    protected String workspaceOwner;
    protected _ItemSpec[] items;

    public _RepositorySoap_Unshelve()
    {
        super();
    }

    public _RepositorySoap_Unshelve(
        final String shelvesetName,
        final String shelvesetOwner,
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items)
    {
        // TODO : Call super() instead of setting all fields directly?
        setShelvesetName(shelvesetName);
        setShelvesetOwner(shelvesetOwner);
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setItems(items);
    }

    public String getShelvesetName()
    {
        return this.shelvesetName;
    }

    public void setShelvesetName(String value)
    {
        this.shelvesetName = value;
    }

    public String getShelvesetOwner()
    {
        return this.shelvesetOwner;
    }

    public void setShelvesetOwner(String value)
    {
        this.shelvesetOwner = value;
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public _ItemSpec[] getItems()
    {
        return this.items;
    }

    public void setItems(_ItemSpec[] value)
    {
        this.items = value;
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
            "shelvesetName",
            this.shelvesetName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "shelvesetOwner",
            this.shelvesetOwner);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);

        if (this.items != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("items");

            for (int iterator0 = 0; iterator0 < this.items.length; iterator0++)
            {
                this.items[iterator0].writeAsElement(
                    writer,
                    "ItemSpec");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
