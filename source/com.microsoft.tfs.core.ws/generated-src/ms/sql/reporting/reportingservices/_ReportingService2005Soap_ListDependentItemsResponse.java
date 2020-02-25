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

import ms.sql.reporting.reportingservices._CatalogItem;
import ms.sql.reporting.reportingservices._ItemTypeEnum;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_ListDependentItemsResponse;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReportingService2005Soap_ListDependentItemsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _CatalogItem[] catalogItems;

    public _ReportingService2005Soap_ListDependentItemsResponse()
    {
        super();
    }

    public _ReportingService2005Soap_ListDependentItemsResponse(final _CatalogItem[] catalogItems)
    {
        // TODO : Call super() instead of setting all fields directly?
        setCatalogItems(catalogItems);
    }

    public _CatalogItem[] getCatalogItems()
    {
        return this.catalogItems;
    }

    public void setCatalogItems(_CatalogItem[] value)
    {
        this.catalogItems = value;
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

                if (localName.equalsIgnoreCase("CatalogItems"))
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
                            _CatalogItem complexObject0 = new _CatalogItem();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.catalogItems = (_CatalogItem[]) list0.toArray(new _CatalogItem[list0.size()]);
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
