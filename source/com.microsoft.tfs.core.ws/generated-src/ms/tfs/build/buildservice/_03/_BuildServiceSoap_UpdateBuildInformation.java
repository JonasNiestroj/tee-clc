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

import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildInformation;
import ms.tfs.build.buildservice._03._InformationChangeRequest;

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
public class _BuildServiceSoap_UpdateBuildInformation
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _InformationChangeRequest[] changes;

    public _BuildServiceSoap_UpdateBuildInformation()
    {
        super();
    }

    public _BuildServiceSoap_UpdateBuildInformation(final _InformationChangeRequest[] changes)
    {
        // TODO : Call super() instead of setting all fields directly?
        setChanges(changes);
    }

    public _InformationChangeRequest[] getChanges()
    {
        return this.changes;
    }

    public void setChanges(_InformationChangeRequest[] value)
    {
        this.changes = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
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
                    "InformationChangeRequest");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
