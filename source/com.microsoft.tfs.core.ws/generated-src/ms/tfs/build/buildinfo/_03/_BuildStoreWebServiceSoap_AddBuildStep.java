// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_AddBuildStep;

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
public class _BuildStoreWebServiceSoap_AddBuildStep
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String buildUri;
    protected String buildStepName;
    protected String stepMessage;
    protected Calendar startTime;
    protected long parentBuildStepId;

    public _BuildStoreWebServiceSoap_AddBuildStep()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_AddBuildStep(
        final String buildUri,
        final String buildStepName,
        final String stepMessage,
        final Calendar startTime,
        final long parentBuildStepId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildUri(buildUri);
        setBuildStepName(buildStepName);
        setStepMessage(stepMessage);
        setStartTime(startTime);
        setParentBuildStepId(parentBuildStepId);
    }

    public String getBuildUri()
    {
        return this.buildUri;
    }

    public void setBuildUri(String value)
    {
        this.buildUri = value;
    }

    public String getBuildStepName()
    {
        return this.buildStepName;
    }

    public void setBuildStepName(String value)
    {
        this.buildStepName = value;
    }

    public String getStepMessage()
    {
        return this.stepMessage;
    }

    public void setStepMessage(String value)
    {
        this.stepMessage = value;
    }

    public Calendar getStartTime()
    {
        return this.startTime;
    }

    public void setStartTime(Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'startTime' is a required element, its value cannot be null");
        }

        this.startTime = value;
    }

    public long getParentBuildStepId()
    {
        return this.parentBuildStepId;
    }

    public void setParentBuildStepId(long value)
    {
        this.parentBuildStepId = value;
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
            "buildUri",
            this.buildUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildStepName",
            this.buildStepName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "stepMessage",
            this.stepMessage);
        XMLStreamWriterHelper.writeElement(
            writer,
            "startTime",
            this.startTime,
            true);
        XMLStreamWriterHelper.writeElement(
            writer,
            "parentBuildStepId",
            this.parentBuildStepId);

        writer.writeEndElement();
    }
}
