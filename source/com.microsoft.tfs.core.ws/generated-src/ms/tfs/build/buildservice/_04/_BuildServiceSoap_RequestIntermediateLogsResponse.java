// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildServiceSoap_RequestIntermediateLogsResponse;

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
public class _BuildServiceSoap_RequestIntermediateLogsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected String requestIntermediateLogsResult;

    public _BuildServiceSoap_RequestIntermediateLogsResponse()
    {
        super();
    }

    public _BuildServiceSoap_RequestIntermediateLogsResponse(final String requestIntermediateLogsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRequestIntermediateLogsResult(requestIntermediateLogsResult);
    }

    public String getRequestIntermediateLogsResult()
    {
        return this.requestIntermediateLogsResult;
    }

    public void setRequestIntermediateLogsResult(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException(
                    "'RequestIntermediateLogsResult' is a required element, its value cannot be null");
        }

        this.requestIntermediateLogsResult = value;
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

                if (localName.equalsIgnoreCase("RequestIntermediateLogsResult"))
                {
                    this.requestIntermediateLogsResult = reader.getElementText();
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
