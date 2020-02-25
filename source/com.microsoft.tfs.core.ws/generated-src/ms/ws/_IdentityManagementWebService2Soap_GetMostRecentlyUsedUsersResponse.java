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

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._PropertyValue;
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
public class _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _TeamFoundationIdentity[] getMostRecentlyUsedUsersResult;

    public _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse()
    {
        super();
    }

    public _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse(
        final _TeamFoundationIdentity[] getMostRecentlyUsedUsersResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetMostRecentlyUsedUsersResult(getMostRecentlyUsedUsersResult);
    }

    public _TeamFoundationIdentity[] getGetMostRecentlyUsedUsersResult()
    {
        return this.getMostRecentlyUsedUsersResult;
    }

    public void setGetMostRecentlyUsedUsersResult(_TeamFoundationIdentity[] value)
    {
        this.getMostRecentlyUsedUsersResult = value;
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

                if (localName.equalsIgnoreCase("GetMostRecentlyUsedUsersResult"))
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
                            _TeamFoundationIdentity complexObject0 = new _TeamFoundationIdentity();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getMostRecentlyUsedUsersResult = (_TeamFoundationIdentity[]) list0.toArray(
                                new _TeamFoundationIdentity[list0.size()]);
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