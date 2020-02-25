// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.groupsecurity._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.groupsecurity._03._GroupSecurityServiceSoap_IsMember;

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
public class _GroupSecurityServiceSoap_IsMember
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String groupSid;
    protected String identitySid;

    public _GroupSecurityServiceSoap_IsMember()
    {
        super();
    }

    public _GroupSecurityServiceSoap_IsMember(
        final String groupSid,
        final String identitySid)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGroupSid(groupSid);
        setIdentitySid(identitySid);
    }

    public String getGroupSid()
    {
        return this.groupSid;
    }

    public void setGroupSid(String value)
    {
        this.groupSid = value;
    }

    public String getIdentitySid()
    {
        return this.identitySid;
    }

    public void setIdentitySid(String value)
    {
        this.identitySid = value;
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
            "groupSid",
            this.groupSid);
        XMLStreamWriterHelper.writeElement(
            writer,
            "identitySid",
            this.identitySid);

        writer.writeEndElement();
    }
}
