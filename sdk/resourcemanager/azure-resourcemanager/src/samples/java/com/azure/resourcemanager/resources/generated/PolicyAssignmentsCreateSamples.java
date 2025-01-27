// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.fluent.models.PolicyAssignmentInner;
import com.azure.resourcemanager.resources.models.EnforcementMode;
import com.azure.resourcemanager.resources.models.Identity;
import com.azure.resourcemanager.resources.models.IdentityUserAssignedIdentitiesValue;
import com.azure.resourcemanager.resources.models.NonComplianceMessage;
import com.azure.resourcemanager.resources.models.ParameterValuesValue;
import com.azure.resourcemanager.resources.models.ResourceIdentityType;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for PolicyAssignments Create. */
public final class PolicyAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/createPolicyAssignment.json
     */
    /**
     * Sample code: Create or update a policy assignment.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAPolicyAssignment(com.azure.resourcemanager.AzureResourceManager azure)
        throws IOException {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .createWithResponse(
                "subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2",
                "EnforceNaming",
                new PolicyAssignmentInner()
                    .withDisplayName("Enforce resource naming rules")
                    .withPolicyDefinitionId(
                        "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming")
                    .withParameters(
                        mapOf(
                            "prefix",
                            new ParameterValuesValue().withValue("DeptA"),
                            "suffix",
                            new ParameterValuesValue().withValue("-LC")))
                    .withDescription("Force resource names to begin with given DeptA and end with -LC")
                    .withMetadata(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"assignedBy\":\"Special Someone\"}", Object.class, SerializerEncoding.JSON))
                    .withNonComplianceMessages(
                        Arrays
                            .asList(
                                new NonComplianceMessage()
                                    .withMessage("Resource names must start with 'DeptA' and end with '-LC'."))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/createPolicyAssignmentWithIdentity.json
     */
    /**
     * Sample code: Create or update a policy assignment with a system assigned identity.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAPolicyAssignmentWithASystemAssignedIdentity(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .createWithResponse(
                "subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2",
                "EnforceNaming",
                new PolicyAssignmentInner()
                    .withLocation("eastus")
                    .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                    .withDisplayName("Enforce resource naming rules")
                    .withPolicyDefinitionId(
                        "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming")
                    .withParameters(
                        mapOf(
                            "prefix",
                            new ParameterValuesValue().withValue("DeptA"),
                            "suffix",
                            new ParameterValuesValue().withValue("-LC")))
                    .withDescription("Force resource names to begin with given DeptA and end with -LC")
                    .withMetadata(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"assignedBy\":\"Foo Bar\"}", Object.class, SerializerEncoding.JSON))
                    .withEnforcementMode(EnforcementMode.DEFAULT),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/createPolicyAssignmentNonComplianceMessages.json
     */
    /**
     * Sample code: Create or update a policy assignment with multiple non-compliance messages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAPolicyAssignmentWithMultipleNonComplianceMessages(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .createWithResponse(
                "subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2",
                "securityInitAssignment",
                new PolicyAssignmentInner()
                    .withDisplayName("Enforce security policies")
                    .withPolicyDefinitionId(
                        "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policySetDefinitions/securityInitiative")
                    .withNonComplianceMessages(
                        Arrays
                            .asList(
                                new NonComplianceMessage()
                                    .withMessage(
                                        "Resources must comply with all internal security policies. See <internal site"
                                            + " URL> for more info."),
                                new NonComplianceMessage()
                                    .withMessage("Resource names must start with 'DeptA' and end with '-LC'.")
                                    .withPolicyDefinitionReferenceId("10420126870854049575"),
                                new NonComplianceMessage()
                                    .withMessage("Storage accounts must have firewall rules configured.")
                                    .withPolicyDefinitionReferenceId("8572513655450389710"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/createPolicyAssignmentWithUserAssignedIdentity.json
     */
    /**
     * Sample code: Create or update a policy assignment with a user assigned identity.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAPolicyAssignmentWithAUserAssignedIdentity(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .createWithResponse(
                "subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2",
                "EnforceNaming",
                new PolicyAssignmentInner()
                    .withLocation("eastus")
                    .withIdentity(
                        new Identity()
                            .withType(ResourceIdentityType.USER_ASSIGNED)
                            .withUserAssignedIdentities(
                                mapOf(
                                    "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/resourceGroups/testResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-identity",
                                    new IdentityUserAssignedIdentitiesValue())))
                    .withDisplayName("Enforce resource naming rules")
                    .withPolicyDefinitionId(
                        "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming")
                    .withParameters(
                        mapOf(
                            "prefix",
                            new ParameterValuesValue().withValue("DeptA"),
                            "suffix",
                            new ParameterValuesValue().withValue("-LC")))
                    .withDescription("Force resource names to begin with given DeptA and end with -LC")
                    .withMetadata(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"assignedBy\":\"Foo Bar\"}", Object.class, SerializerEncoding.JSON))
                    .withEnforcementMode(EnforcementMode.DEFAULT),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/createPolicyAssignmentWithoutEnforcement.json
     */
    /**
     * Sample code: Create or update a policy assignment without enforcing policy effect during resource creation or
     * update.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAPolicyAssignmentWithoutEnforcingPolicyEffectDuringResourceCreationOrUpdate(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .createWithResponse(
                "subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2",
                "EnforceNaming",
                new PolicyAssignmentInner()
                    .withDisplayName("Enforce resource naming rules")
                    .withPolicyDefinitionId(
                        "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming")
                    .withParameters(
                        mapOf(
                            "prefix",
                            new ParameterValuesValue().withValue("DeptA"),
                            "suffix",
                            new ParameterValuesValue().withValue("-LC")))
                    .withDescription("Force resource names to begin with given DeptA and end with -LC")
                    .withMetadata(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"assignedBy\":\"Special Someone\"}", Object.class, SerializerEncoding.JSON))
                    .withEnforcementMode(EnforcementMode.DO_NOT_ENFORCE),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
