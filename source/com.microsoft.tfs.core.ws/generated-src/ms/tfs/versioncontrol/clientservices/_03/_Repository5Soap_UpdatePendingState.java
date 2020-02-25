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

import ms.tfs.versioncontrol.clientservices._03._ConflictInformation;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._PendingState;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_UpdatePendingState;

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
public class _Repository5Soap_UpdatePendingState
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _PendingState[] updates;
    protected int maxClientPathLength;

    public _Repository5Soap_UpdatePendingState()
    {
        super();
    }

    public _Repository5Soap_UpdatePendingState(
        final String workspaceName,
        final String workspaceOwner,
        final _PendingState[] updates,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setUpdates(updates);
        setMaxClientPathLength(maxClientPathLength);
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

    public _PendingState[] getUpdates()
    {
        return this.updates;
    }

    public void setUpdates(_PendingState[] value)
    {
        this.updates = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
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
            "workspaceOwner",
            this.workspaceOwner);

        if (this.updates != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("updates");

            for (int iterator0 = 0; iterator0 < this.updates.length; iterator0++)
            {
                this.updates[iterator0].writeAsElement(
                    writer,
                    "PendingState");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
