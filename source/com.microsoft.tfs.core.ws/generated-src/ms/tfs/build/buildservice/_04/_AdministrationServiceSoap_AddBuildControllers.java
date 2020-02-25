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

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildControllers;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._PropertyValue;

import java.lang.Object;
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
public class _AdministrationServiceSoap_AddBuildControllers
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildController[] controllers;

    public _AdministrationServiceSoap_AddBuildControllers()
    {
        super();
    }

    public _AdministrationServiceSoap_AddBuildControllers(final _BuildController[] controllers)
    {
        // TODO : Call super() instead of setting all fields directly?
        setControllers(controllers);
    }

    public _BuildController[] getControllers()
    {
        return this.controllers;
    }

    public void setControllers(_BuildController[] value)
    {
        this.controllers = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.controllers != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("controllers");

            for (int iterator0 = 0; iterator0 < this.controllers.length; iterator0++)
            {
                this.controllers[iterator0].writeAsElement(
                    writer,
                    "BuildController");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
