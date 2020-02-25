// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebServiceSoap_AddMemberToApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_AddMemberToApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_CreateApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_CreateApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_DeleteApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_DeleteApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_GetScopeName;
import ms.ws._IdentityManagementWebServiceSoap_GetScopeNameResponse;
import ms.ws._IdentityManagementWebServiceSoap_IsMember;
import ms.ws._IdentityManagementWebServiceSoap_IsMemberResponse;
import ms.ws._IdentityManagementWebServiceSoap_ListApplicationGroups;
import ms.ws._IdentityManagementWebServiceSoap_ListApplicationGroupsResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentities;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptor;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptorResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesById;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesByIdResponse;
import ms.ws._IdentityManagementWebServiceSoap_ReadIdentitiesResponse;
import ms.ws._IdentityManagementWebServiceSoap_RefreshIdentity;
import ms.ws._IdentityManagementWebServiceSoap_RefreshIdentityResponse;
import ms.ws._IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroupResponse;
import ms.ws._IdentityManagementWebServiceSoap_UpdateApplicationGroup;
import ms.ws._IdentityManagementWebServiceSoap_UpdateApplicationGroupResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._PropertyValue;
import ms.ws._TeamFoundationIdentity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.Object;
import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://microsoft.com/webservices/}IdentityManagementWebServiceSoapService
 */
public class _IdentityManagementWebServiceSoapService
    extends SOAP11Service
    implements _IdentityManagementWebServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://microsoft.com/webservices/",
            "IdentityManagementWebServiceSoapService");
    private static final String ENDPOINT_PATH = "/tfs/TeamFoundation/Administration/v3.0/IdentityManagementService.asmx";

    public _IdentityManagementWebServiceSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _IdentityManagementWebServiceSoapService(
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
        return _IdentityManagementWebServiceSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _IdentityManagementWebServiceSoapService.ENDPOINT_PATH;
    }

    public _TeamFoundationIdentity[] readIdentitiesByDescriptor(
        final _IdentityDescriptor[] descriptors,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptor requestData = new _IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptor(
                    descriptors,
                    queryMembership,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentitiesByDescriptor",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentitiesByDescriptor");
                    }
                });

        final _IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptorResponse responseData = new _IdentityManagementWebServiceSoap_ReadIdentitiesByDescriptorResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesByDescriptorResponse",
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

        return responseData.getReadIdentitiesByDescriptorResult();
    }

    public _TeamFoundationIdentity[] readIdentitiesById(
        final String[] teamFoundationIds,
        final int queryMembership,
        final int features,
        final int options,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_ReadIdentitiesById requestData = new _IdentityManagementWebServiceSoap_ReadIdentitiesById(
                    teamFoundationIds,
                    queryMembership,
                    features,
                    options,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentitiesById",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentitiesById");
                    }
                });

        final _IdentityManagementWebServiceSoap_ReadIdentitiesByIdResponse responseData = new _IdentityManagementWebServiceSoap_ReadIdentitiesByIdResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesByIdResponse",
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

        return responseData.getReadIdentitiesByIdResult();
    }

    public _TeamFoundationIdentity[][] readIdentities(
        final int searchFactor,
        final String[] factorValues,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_ReadIdentities requestData = new _IdentityManagementWebServiceSoap_ReadIdentities(
                    searchFactor,
                    factorValues,
                    queryMembership,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentities",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentities");
                    }
                });

        final _IdentityManagementWebServiceSoap_ReadIdentitiesResponse responseData = new _IdentityManagementWebServiceSoap_ReadIdentitiesResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesResponse",
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

        return responseData.getReadIdentitiesResult();
    }

    public _IdentityDescriptor createApplicationGroup(
        final String projectUri,
        final String groupName,
        final String groupDescription)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_CreateApplicationGroup requestData = new _IdentityManagementWebServiceSoap_CreateApplicationGroup(
                    projectUri,
                    groupName,
                    groupDescription);

        final SOAPRequest request = createSOAPRequest(
                "CreateApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CreateApplicationGroup");
                    }
                });

        final _IdentityManagementWebServiceSoap_CreateApplicationGroupResponse responseData = new _IdentityManagementWebServiceSoap_CreateApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "CreateApplicationGroupResponse",
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

        return responseData.getCreateApplicationGroupResult();
    }

    public _TeamFoundationIdentity[] listApplicationGroups(
        final String projectUri,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_ListApplicationGroups requestData = new _IdentityManagementWebServiceSoap_ListApplicationGroups(
                    projectUri,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ListApplicationGroups",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ListApplicationGroups");
                    }
                });

        final _IdentityManagementWebServiceSoap_ListApplicationGroupsResponse responseData = new _IdentityManagementWebServiceSoap_ListApplicationGroupsResponse();

        executeSOAPRequest(
            request,
            "ListApplicationGroupsResponse",
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

        return responseData.getListApplicationGroupsResult();
    }

    public void updateApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final int groupProperty,
        final String newValue)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_UpdateApplicationGroup requestData = new _IdentityManagementWebServiceSoap_UpdateApplicationGroup(
                    groupDescriptor,
                    groupProperty,
                    newValue);

        final SOAPRequest request = createSOAPRequest(
                "UpdateApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateApplicationGroup");
                    }
                });

        final _IdentityManagementWebServiceSoap_UpdateApplicationGroupResponse responseData = new _IdentityManagementWebServiceSoap_UpdateApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "UpdateApplicationGroupResponse",
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

    public void deleteApplicationGroup(final _IdentityDescriptor groupDescriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_DeleteApplicationGroup requestData = new _IdentityManagementWebServiceSoap_DeleteApplicationGroup(
                    groupDescriptor);

        final SOAPRequest request = createSOAPRequest(
                "DeleteApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteApplicationGroup");
                    }
                });

        final _IdentityManagementWebServiceSoap_DeleteApplicationGroupResponse responseData = new _IdentityManagementWebServiceSoap_DeleteApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "DeleteApplicationGroupResponse",
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

    public void addMemberToApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_AddMemberToApplicationGroup requestData = new _IdentityManagementWebServiceSoap_AddMemberToApplicationGroup(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "AddMemberToApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddMemberToApplicationGroup");
                    }
                });

        final _IdentityManagementWebServiceSoap_AddMemberToApplicationGroupResponse responseData = new _IdentityManagementWebServiceSoap_AddMemberToApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "AddMemberToApplicationGroupResponse",
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

    public void removeMemberFromApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup requestData = new _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "RemoveMemberFromApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveMemberFromApplicationGroup");
                    }
                });

        final _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroupResponse responseData = new _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "RemoveMemberFromApplicationGroupResponse",
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

    public boolean isMember(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_IsMember requestData = new _IdentityManagementWebServiceSoap_IsMember(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "IsMember",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "IsMember");
                    }
                });

        final _IdentityManagementWebServiceSoap_IsMemberResponse responseData = new _IdentityManagementWebServiceSoap_IsMemberResponse();

        executeSOAPRequest(
            request,
            "IsMemberResponse",
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

        return responseData.isIsMemberResult();
    }

    public boolean refreshIdentity(final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_RefreshIdentity requestData = new _IdentityManagementWebServiceSoap_RefreshIdentity(
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "RefreshIdentity",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RefreshIdentity");
                    }
                });

        final _IdentityManagementWebServiceSoap_RefreshIdentityResponse responseData = new _IdentityManagementWebServiceSoap_RefreshIdentityResponse();

        executeSOAPRequest(
            request,
            "RefreshIdentityResponse",
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

        return responseData.isRefreshIdentityResult();
    }

    public String getScopeName(final String scopeId)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebServiceSoap_GetScopeName requestData = new _IdentityManagementWebServiceSoap_GetScopeName(
                    scopeId);

        final SOAPRequest request = createSOAPRequest(
                "GetScopeName",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetScopeName");
                    }
                });

        final _IdentityManagementWebServiceSoap_GetScopeNameResponse responseData = new _IdentityManagementWebServiceSoap_GetScopeNameResponse();

        executeSOAPRequest(
            request,
            "GetScopeNameResponse",
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

        return responseData.getGetScopeNameResult();
    }
}
