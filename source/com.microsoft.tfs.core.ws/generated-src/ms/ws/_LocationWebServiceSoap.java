// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._AccessMapping;
import ms.ws._ConnectionData;
import ms.ws._IdentityDescriptor;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._LocationServiceData;
import ms.ws._LocationWebServiceSoap_ConfigureAccessMapping;
import ms.ws._LocationWebServiceSoap_ConfigureAccessMappingResponse;
import ms.ws._LocationWebServiceSoap_Connect;
import ms.ws._LocationWebServiceSoap_ConnectResponse;
import ms.ws._LocationWebServiceSoap_QueryServices;
import ms.ws._LocationWebServiceSoap_QueryServicesResponse;
import ms.ws._LocationWebServiceSoap_RemoveAccessMapping;
import ms.ws._LocationWebServiceSoap_RemoveAccessMappingResponse;
import ms.ws._LocationWebServiceSoap_RemoveServiceDefinitions;
import ms.ws._LocationWebServiceSoap_RemoveServiceDefinitionsResponse;
import ms.ws._LocationWebServiceSoap_SaveServiceDefinitions;
import ms.ws._LocationWebServiceSoap_SaveServiceDefinitionsResponse;
import ms.ws._LocationWebServiceSoap_SetDefaultAccessMapping;
import ms.ws._LocationWebServiceSoap_SetDefaultAccessMappingResponse;
import ms.ws._PropertyValue;
import ms.ws._ServiceDefinition;
import ms.ws._ServiceTypeFilter;
import ms.ws._TeamFoundationIdentity;

import java.lang.Object;
import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://microsoft.com/webservices/}LocationWebServiceSoap
 */
public interface _LocationWebServiceSoap
{
    public _LocationServiceData saveServiceDefinitions(
        final _ServiceDefinition[] serviceDefinitions,
        final int lastChangeId)
        throws TransportException, SOAPFault;

    public _LocationServiceData removeServiceDefinitions(
        final _ServiceDefinition[] serviceDefinitions,
        final int lastChangeId)
        throws TransportException, SOAPFault;

    public _LocationServiceData configureAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId,
        final boolean makeDefault)
        throws TransportException, SOAPFault;

    public _LocationServiceData setDefaultAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId)
        throws TransportException, SOAPFault;

    public _LocationServiceData removeAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId)
        throws TransportException, SOAPFault;

    public _LocationServiceData queryServices(
        final _ServiceTypeFilter[] serviceTypeFilters,
        final int lastChangeId)
        throws TransportException, SOAPFault;

    public _ConnectionData connect(
        final int connectOptions,
        final int lastChangeId,
        final int features)
        throws TransportException, SOAPFault;
}