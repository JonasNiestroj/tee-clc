// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ReportingService2005Soap_GetModelItemPermissions;

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
public class _ReportingService2005Soap_GetModelItemPermissions
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String model;
    protected String modelItemID;

    public _ReportingService2005Soap_GetModelItemPermissions()
    {
        super();
    }

    public _ReportingService2005Soap_GetModelItemPermissions(
        final String model,
        final String modelItemID)
    {
        // TODO : Call super() instead of setting all fields directly?
        setModel(model);
        setModelItemID(modelItemID);
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String value)
    {
        this.model = value;
    }

    public String getModelItemID()
    {
        return this.modelItemID;
    }

    public void setModelItemID(String value)
    {
        this.modelItemID = value;
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
            "Model",
            this.model);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ModelItemID",
            this.modelItemID);

        writer.writeEndElement();
    }
}
