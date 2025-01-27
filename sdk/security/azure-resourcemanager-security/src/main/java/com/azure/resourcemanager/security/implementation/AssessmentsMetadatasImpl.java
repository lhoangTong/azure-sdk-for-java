// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AssessmentsMetadatasClient;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataResponseInner;
import com.azure.resourcemanager.security.models.AssessmentsMetadatas;
import com.azure.resourcemanager.security.models.SecurityAssessmentMetadataResponse;

public final class AssessmentsMetadatasImpl implements AssessmentsMetadatas {
    private static final ClientLogger LOGGER = new ClientLogger(AssessmentsMetadatasImpl.class);

    private final AssessmentsMetadatasClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AssessmentsMetadatasImpl(
        AssessmentsMetadatasClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityAssessmentMetadataResponse> list() {
        PagedIterable<SecurityAssessmentMetadataResponseInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAssessmentMetadataResponse> list(Context context) {
        PagedIterable<SecurityAssessmentMetadataResponseInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataResponseImpl(inner1, this.manager()));
    }

    public Response<SecurityAssessmentMetadataResponse> getWithResponse(
        String assessmentMetadataName, Context context) {
        Response<SecurityAssessmentMetadataResponseInner> inner =
            this.serviceClient().getWithResponse(assessmentMetadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityAssessmentMetadataResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityAssessmentMetadataResponse get(String assessmentMetadataName) {
        SecurityAssessmentMetadataResponseInner inner = this.serviceClient().get(assessmentMetadataName);
        if (inner != null) {
            return new SecurityAssessmentMetadataResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SecurityAssessmentMetadataResponse> listBySubscription() {
        PagedIterable<SecurityAssessmentMetadataResponseInner> inner = this.serviceClient().listBySubscription();
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAssessmentMetadataResponse> listBySubscription(Context context) {
        PagedIterable<SecurityAssessmentMetadataResponseInner> inner = this.serviceClient().listBySubscription(context);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataResponseImpl(inner1, this.manager()));
    }

    public Response<SecurityAssessmentMetadataResponse> getInSubscriptionWithResponse(
        String assessmentMetadataName, Context context) {
        Response<SecurityAssessmentMetadataResponseInner> inner =
            this.serviceClient().getInSubscriptionWithResponse(assessmentMetadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityAssessmentMetadataResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityAssessmentMetadataResponse getInSubscription(String assessmentMetadataName) {
        SecurityAssessmentMetadataResponseInner inner = this.serviceClient().getInSubscription(assessmentMetadataName);
        if (inner != null) {
            return new SecurityAssessmentMetadataResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteInSubscriptionWithResponse(String assessmentMetadataName, Context context) {
        return this.serviceClient().deleteInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    public void deleteInSubscription(String assessmentMetadataName) {
        this.serviceClient().deleteInSubscription(assessmentMetadataName);
    }

    public SecurityAssessmentMetadataResponse getInSubscriptionById(String id) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.getInSubscriptionWithResponse(assessmentMetadataName, Context.NONE).getValue();
    }

    public Response<SecurityAssessmentMetadataResponse> getInSubscriptionByIdWithResponse(String id, Context context) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.getInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    public void deleteInSubscriptionById(String id) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        this.deleteInSubscriptionWithResponse(assessmentMetadataName, Context.NONE);
    }

    public Response<Void> deleteInSubscriptionByIdWithResponse(String id, Context context) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.deleteInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    private AssessmentsMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public SecurityAssessmentMetadataResponseImpl define(String name) {
        return new SecurityAssessmentMetadataResponseImpl(name, this.manager());
    }
}
