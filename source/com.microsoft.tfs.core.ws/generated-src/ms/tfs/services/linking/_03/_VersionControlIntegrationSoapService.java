// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.services.linking._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.linking._03._Artifact;
import ms.tfs.services.linking._03._ExtendedAttribute;
import ms.tfs.services.linking._03._OutboundLink;
import ms.tfs.services.linking._03._VersionControlIntegrationSoap_GetArtifacts;
import ms.tfs.services.linking._03._VersionControlIntegrationSoap_GetArtifactsResponse;

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
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Linking/03}VersionControlIntegrationSoapService
 */
public class _VersionControlIntegrationSoapService
    extends SOAP11Service
    implements _VersionControlIntegrationSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Linking/03",
                "VersionControlIntegrationSoapService");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/VersionControl/v1.0/Integration.asmx";

    public _VersionControlIntegrationSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _VersionControlIntegrationSoapService(
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
        return _VersionControlIntegrationSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _VersionControlIntegrationSoapService.ENDPOINT_PATH;
    }

    public _Artifact[] getArtifacts(final String[] artifactUris)
        throws TransportException, SOAPFault
    {
        final _VersionControlIntegrationSoap_GetArtifacts requestData = new _VersionControlIntegrationSoap_GetArtifacts(
                    artifactUris);

        final SOAPRequest request = createSOAPRequest(
                "GetArtifacts",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetArtifacts");
                    }
                });

        final _VersionControlIntegrationSoap_GetArtifactsResponse responseData = new _VersionControlIntegrationSoap_GetArtifactsResponse();

        executeSOAPRequest(
            request,
            "GetArtifactsResponse",
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

        return responseData.getGetArtifactsResult();
    }
}
