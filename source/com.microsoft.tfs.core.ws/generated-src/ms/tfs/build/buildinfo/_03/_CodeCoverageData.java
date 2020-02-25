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

import ms.tfs.build.buildinfo._03._CodeCoverageData;

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
public class _CodeCoverageData
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String runId;
    protected String name;
    protected String runUser;
    protected int linesCovered;
    protected int linesNotCovered;
    protected int linesPartiallyCovered;
    protected int blocksCovered;
    protected int blocksNotCovered;
    protected boolean isBuildCoverageProcessing;

    public _CodeCoverageData()
    {
        super();
    }

    public _CodeCoverageData(
        final String runId,
        final String name,
        final String runUser,
        final int linesCovered,
        final int linesNotCovered,
        final int linesPartiallyCovered,
        final int blocksCovered,
        final int blocksNotCovered,
        final boolean isBuildCoverageProcessing)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRunId(runId);
        setName(name);
        setRunUser(runUser);
        setLinesCovered(linesCovered);
        setLinesNotCovered(linesNotCovered);
        setLinesPartiallyCovered(linesPartiallyCovered);
        setBlocksCovered(blocksCovered);
        setBlocksNotCovered(blocksNotCovered);
        setIsBuildCoverageProcessing(isBuildCoverageProcessing);
    }

    public String getRunId()
    {
        return this.runId;
    }

    public void setRunId(String value)
    {
        this.runId = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public String getRunUser()
    {
        return this.runUser;
    }

    public void setRunUser(String value)
    {
        this.runUser = value;
    }

    public int getLinesCovered()
    {
        return this.linesCovered;
    }

    public void setLinesCovered(int value)
    {
        this.linesCovered = value;
    }

    public int getLinesNotCovered()
    {
        return this.linesNotCovered;
    }

    public void setLinesNotCovered(int value)
    {
        this.linesNotCovered = value;
    }

    public int getLinesPartiallyCovered()
    {
        return this.linesPartiallyCovered;
    }

    public void setLinesPartiallyCovered(int value)
    {
        this.linesPartiallyCovered = value;
    }

    public int getBlocksCovered()
    {
        return this.blocksCovered;
    }

    public void setBlocksCovered(int value)
    {
        this.blocksCovered = value;
    }

    public int getBlocksNotCovered()
    {
        return this.blocksNotCovered;
    }

    public void setBlocksNotCovered(int value)
    {
        this.blocksNotCovered = value;
    }

    public boolean isIsBuildCoverageProcessing()
    {
        return this.isBuildCoverageProcessing;
    }

    public void setIsBuildCoverageProcessing(boolean value)
    {
        this.isBuildCoverageProcessing = value;
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
            "RunId",
            this.runId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeElement(
            writer,
            "RunUser",
            this.runUser);
        XMLStreamWriterHelper.writeElement(
            writer,
            "LinesCovered",
            this.linesCovered);
        XMLStreamWriterHelper.writeElement(
            writer,
            "LinesNotCovered",
            this.linesNotCovered);
        XMLStreamWriterHelper.writeElement(
            writer,
            "LinesPartiallyCovered",
            this.linesPartiallyCovered);
        XMLStreamWriterHelper.writeElement(
            writer,
            "BlocksCovered",
            this.blocksCovered);
        XMLStreamWriterHelper.writeElement(
            writer,
            "BlocksNotCovered",
            this.blocksNotCovered);
        XMLStreamWriterHelper.writeElement(
            writer,
            "IsBuildCoverageProcessing",
            this.isBuildCoverageProcessing);

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

                if (localName.equalsIgnoreCase("RunId"))
                {
                    this.runId = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Name"))
                {
                    this.name = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("RunUser"))
                {
                    this.runUser = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("LinesCovered"))
                {
                    this.linesCovered = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("LinesNotCovered"))
                {
                    this.linesNotCovered = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("LinesPartiallyCovered"))
                {
                    this.linesPartiallyCovered = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("BlocksCovered"))
                {
                    this.blocksCovered = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("BlocksNotCovered"))
                {
                    this.blocksNotCovered = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("IsBuildCoverageProcessing"))
                {
                    this.isBuildCoverageProcessing = XMLConvert.toBoolean(reader.getElementText());
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