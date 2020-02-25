// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.authorization._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.authorization._03._ApplicationGroupSpecialType;
import ms.tfs.services.authorization._03._Identity;
import ms.tfs.services.authorization._03._IdentityType;

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
public class _Identity
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _IdentityType type;
    protected String sid;
    protected String displayName;
    protected String description;
    protected String domain;
    protected String accountName;
    protected String distinguishedName;
    protected String mailAddress;
    protected _ApplicationGroupSpecialType specialType;
    protected boolean deleted;
    protected String[] members;
    protected String[] memberOf;
    protected boolean securityGroup = false;

    public _Identity()
    {
        super();
    }

    public _Identity(
        final _IdentityType type,
        final String sid,
        final String displayName,
        final String description,
        final String domain,
        final String accountName,
        final String distinguishedName,
        final String mailAddress,
        final _ApplicationGroupSpecialType specialType,
        final boolean deleted,
        final String[] members,
        final String[] memberOf,
        final boolean securityGroup)
    {
        // TODO : Call super() instead of setting all fields directly?
        setType(type);
        setSid(sid);
        setDisplayName(displayName);
        setDescription(description);
        setDomain(domain);
        setAccountName(accountName);
        setDistinguishedName(distinguishedName);
        setMailAddress(mailAddress);
        setSpecialType(specialType);
        setDeleted(deleted);
        setMembers(members);
        setMemberOf(memberOf);
        setSecurityGroup(securityGroup);
    }

    public _IdentityType getType()
    {
        return this.type;
    }

    public void setType(_IdentityType value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Type' is a required element, its value cannot be null");
        }

        this.type = value;
    }

    public String getSid()
    {
        return this.sid;
    }

    public void setSid(String value)
    {
        this.sid = value;
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(String value)
    {
        this.displayName = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String value)
    {
        this.description = value;
    }

    public String getDomain()
    {
        return this.domain;
    }

    public void setDomain(String value)
    {
        this.domain = value;
    }

    public String getAccountName()
    {
        return this.accountName;
    }

    public void setAccountName(String value)
    {
        this.accountName = value;
    }

    public String getDistinguishedName()
    {
        return this.distinguishedName;
    }

    public void setDistinguishedName(String value)
    {
        this.distinguishedName = value;
    }

    public String getMailAddress()
    {
        return this.mailAddress;
    }

    public void setMailAddress(String value)
    {
        this.mailAddress = value;
    }

    public _ApplicationGroupSpecialType getSpecialType()
    {
        return this.specialType;
    }

    public void setSpecialType(_ApplicationGroupSpecialType value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'SpecialType' is a required element, its value cannot be null");
        }

        this.specialType = value;
    }

    public boolean isDeleted()
    {
        return this.deleted;
    }

    public void setDeleted(boolean value)
    {
        this.deleted = value;
    }

    public String[] getMembers()
    {
        return this.members;
    }

    public void setMembers(String[] value)
    {
        this.members = value;
    }

    public String[] getMemberOf()
    {
        return this.memberOf;
    }

    public void setMemberOf(String[] value)
    {
        this.memberOf = value;
    }

    public boolean isSecurityGroup()
    {
        return this.securityGroup;
    }

    public void setSecurityGroup(boolean value)
    {
        this.securityGroup = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        this.type.writeAsElement(
            writer,
            "Type");
        XMLStreamWriterHelper.writeElement(
            writer,
            "Sid",
            this.sid);
        XMLStreamWriterHelper.writeElement(
            writer,
            "DisplayName",
            this.displayName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Description",
            this.description);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Domain",
            this.domain);
        XMLStreamWriterHelper.writeElement(
            writer,
            "AccountName",
            this.accountName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "DistinguishedName",
            this.distinguishedName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "MailAddress",
            this.mailAddress);
        this.specialType.writeAsElement(
            writer,
            "SpecialType");
        XMLStreamWriterHelper.writeElement(
            writer,
            "Deleted",
            this.deleted);

        if (this.members != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Members");

            for (int iterator0 = 0; iterator0 < this.members.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.members[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.memberOf != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("MemberOf");

            for (int iterator0 = 0; iterator0 < this.memberOf.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.memberOf[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "SecurityGroup",
            this.securityGroup);

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

                if (localName.equalsIgnoreCase("Type"))
                {
                    this.type = _IdentityType.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Sid"))
                {
                    this.sid = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("DisplayName"))
                {
                    this.displayName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Description"))
                {
                    this.description = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Domain"))
                {
                    this.domain = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("AccountName"))
                {
                    this.accountName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("DistinguishedName"))
                {
                    this.distinguishedName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("MailAddress"))
                {
                    this.mailAddress = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("SpecialType"))
                {
                    this.specialType = _ApplicationGroupSpecialType.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Deleted"))
                {
                    this.deleted = XMLConvert.toBoolean(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Members"))
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

                    this.members = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("MemberOf"))
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

                    this.memberOf = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("SecurityGroup"))
                {
                    this.securityGroup = XMLConvert.toBoolean(reader.getElementText());
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