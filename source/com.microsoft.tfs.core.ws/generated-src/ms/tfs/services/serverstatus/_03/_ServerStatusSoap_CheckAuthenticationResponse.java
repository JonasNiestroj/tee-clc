// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.serverstatus._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.serverstatus._03._ServerStatusSoap_CheckAuthenticationResponse;

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
public class _ServerStatusSoap_CheckAuthenticationResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected String checkAuthenticationResult;

    public _ServerStatusSoap_CheckAuthenticationResponse()
    {
        super();
    }

    public _ServerStatusSoap_CheckAuthenticationResponse(final String checkAuthenticationResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setCheckAuthenticationResult(checkAuthenticationResult);
    }

    public String getCheckAuthenticationResult()
    {
        return this.checkAuthenticationResult;
    }

    public void setCheckAuthenticationResult(String value)
    {
        this.checkAuthenticationResult = value;
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

                if (localName.equalsIgnoreCase("CheckAuthenticationResult"))
                {
                    this.checkAuthenticationResult = reader.getElementText();
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
