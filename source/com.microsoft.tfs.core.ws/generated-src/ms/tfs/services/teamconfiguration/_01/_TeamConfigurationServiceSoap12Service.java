// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.services.teamconfiguration._01;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.teamconfiguration._01._TeamConfiguration;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_GetTeamConfigurationsForUser;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_GetTeamConfigurationsForUserResponse;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_SetTeamSettings;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_SetTeamSettingsResponse;
import ms.tfs.services.teamconfiguration._01._TeamFieldValue;
import ms.tfs.services.teamconfiguration._01._TeamSettings;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/TeamConfiguration/01}TeamConfigurationServiceSoap12Service
 */
public class _TeamConfigurationServiceSoap12Service
    extends SOAP12Service
    implements _TeamConfigurationServiceSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/Services/TeamConfiguration/01",
                "TeamConfigurationServiceSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Services/v1.0/TeamConfigurationService.asmx";

    public _TeamConfigurationServiceSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _TeamConfigurationServiceSoap12Service(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _TeamConfigurationServiceSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _TeamConfigurationServiceSoap12Service.ENDPOINT_PATH;
    }

    public _TeamConfiguration[] getTeamConfigurationsForUser(final String[] projectUris)
        throws TransportException, SOAPFault
    {
        final _TeamConfigurationServiceSoap_GetTeamConfigurationsForUser requestData = new _TeamConfigurationServiceSoap_GetTeamConfigurationsForUser(
                    projectUris);

        final SOAPRequest request = createSOAPRequest(
                "GetTeamConfigurationsForUser",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetTeamConfigurationsForUser");
                    }
                });

        final _TeamConfigurationServiceSoap_GetTeamConfigurationsForUserResponse responseData = new _TeamConfigurationServiceSoap_GetTeamConfigurationsForUserResponse();

        executeSOAPRequest(
            request,
            "GetTeamConfigurationsForUserResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getGetTeamConfigurationsForUserResult();
    }

    public void setTeamSettings(
        final String teamId,
        final _TeamSettings teamSettings)
        throws TransportException, SOAPFault
    {
        final _TeamConfigurationServiceSoap_SetTeamSettings requestData = new _TeamConfigurationServiceSoap_SetTeamSettings(
                    teamId,
                    teamSettings);

        final SOAPRequest request = createSOAPRequest(
                "SetTeamSettings",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetTeamSettings");
                    }
                });

        final _TeamConfigurationServiceSoap_SetTeamSettingsResponse responseData = new _TeamConfigurationServiceSoap_SetTeamSettingsResponse();

        executeSOAPRequest(
            request,
            "SetTeamSettingsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });
    }
}
