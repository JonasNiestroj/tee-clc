// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._AccessMapping;
import ms.ws._ConnectionData;
import ms.ws._IdentityDescriptor;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._LocationServiceData;
import ms.ws._PropertyValue;
import ms.ws._ServiceDefinition;
import ms.ws._TeamFoundationIdentity;

import java.lang.Object;
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
public class _ConnectionData
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String instanceId;
    protected String catalogResourceId;
    protected String webApplicationRelativeDirectory;
    protected int serverCapabilities;

    // Elements
    protected _TeamFoundationIdentity authenticatedUser;
    protected _TeamFoundationIdentity authorizedUser;
    protected _LocationServiceData locationServiceData;

    public _ConnectionData()
    {
        super();
    }

    public _ConnectionData(
        final String instanceId,
        final String catalogResourceId,
        final String webApplicationRelativeDirectory,
        final int serverCapabilities,
        final _TeamFoundationIdentity authenticatedUser,
        final _TeamFoundationIdentity authorizedUser,
        final _LocationServiceData locationServiceData)
    {
        // TODO : Call super() instead of setting all fields directly?
        setInstanceId(instanceId);
        setCatalogResourceId(catalogResourceId);
        setWebApplicationRelativeDirectory(webApplicationRelativeDirectory);
        setServerCapabilities(serverCapabilities);
        setAuthenticatedUser(authenticatedUser);
        setAuthorizedUser(authorizedUser);
        setLocationServiceData(locationServiceData);
    }

    public String getInstanceId()
    {
        return this.instanceId;
    }

    public void setInstanceId(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'InstanceId' is a required attribute, its value cannot be null");
        }

        this.instanceId = value;
    }

    public String getCatalogResourceId()
    {
        return this.catalogResourceId;
    }

    public void setCatalogResourceId(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'CatalogResourceId' is a required attribute, its value cannot be null");
        }

        this.catalogResourceId = value;
    }

    public String getWebApplicationRelativeDirectory()
    {
        return this.webApplicationRelativeDirectory;
    }

    public void setWebApplicationRelativeDirectory(final String value)
    {
        this.webApplicationRelativeDirectory = value;
    }

    public int getServerCapabilities()
    {
        return this.serverCapabilities;
    }

    public void setServerCapabilities(final int value)
    {
        this.serverCapabilities = value;
    }

    public _TeamFoundationIdentity getAuthenticatedUser()
    {
        return this.authenticatedUser;
    }

    public void setAuthenticatedUser(_TeamFoundationIdentity value)
    {
        this.authenticatedUser = value;
    }

    public _TeamFoundationIdentity getAuthorizedUser()
    {
        return this.authorizedUser;
    }

    public void setAuthorizedUser(_TeamFoundationIdentity value)
    {
        this.authorizedUser = value;
    }

    public _LocationServiceData getLocationServiceData()
    {
        return this.locationServiceData;
    }

    public void setLocationServiceData(_LocationServiceData value)
    {
        this.locationServiceData = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "InstanceId",
            this.instanceId);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "CatalogResourceId",
            this.catalogResourceId);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "WebApplicationRelativeDirectory",
            this.webApplicationRelativeDirectory);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ServerCapabilities",
            this.serverCapabilities);

        // Elements
        if (this.authenticatedUser != null)
        {
            this.authenticatedUser.writeAsElement(
                writer,
                "AuthenticatedUser");
        }

        if (this.authorizedUser != null)
        {
            this.authorizedUser.writeAsElement(
                writer,
                "AuthorizedUser");
        }

        if (this.locationServiceData != null)
        {
            this.locationServiceData.writeAsElement(
                writer,
                "LocationServiceData");
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("InstanceId"))
            {
                this.instanceId = attributeValue;
            }
            else if (localName.equalsIgnoreCase("CatalogResourceId"))
            {
                this.catalogResourceId = attributeValue;
            }
            else if (localName.equalsIgnoreCase("WebApplicationRelativeDirectory"))
            {
                this.webApplicationRelativeDirectory = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ServerCapabilities"))
            {
                this.serverCapabilities = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("AuthenticatedUser"))
                {
                    this.authenticatedUser = new _TeamFoundationIdentity();
                    this.authenticatedUser.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("AuthorizedUser"))
                {
                    this.authorizedUser = new _TeamFoundationIdentity();
                    this.authorizedUser.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("LocationServiceData"))
                {
                    this.locationServiceData = new _LocationServiceData();
                    this.locationServiceData.readFromElement(reader);
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
