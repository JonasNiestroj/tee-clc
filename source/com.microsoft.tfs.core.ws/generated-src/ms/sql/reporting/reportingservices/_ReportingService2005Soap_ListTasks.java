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

import ms.sql.reporting.reportingservices._ReportingService2005Soap_ListTasks;
import ms.sql.reporting.reportingservices._SecurityScopeEnum;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReportingService2005Soap_ListTasks
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _SecurityScopeEnum securityScope;

    public _ReportingService2005Soap_ListTasks()
    {
        super();
    }

    public _ReportingService2005Soap_ListTasks(final _SecurityScopeEnum securityScope)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSecurityScope(securityScope);
    }

    public _SecurityScopeEnum getSecurityScope()
    {
        return this.securityScope;
    }

    public void setSecurityScope(_SecurityScopeEnum value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'SecurityScope' is a required element, its value cannot be null");
        }

        this.securityScope = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        this.securityScope.writeAsElement(
            writer,
            "SecurityScope");

        writer.writeEndElement();
    }
}
