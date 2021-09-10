// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;

/** Samples for ExposureControl GetFeatureValueByFactory. */
public final class ExposureControlGetFeatureValueByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/ExposureControl_GetFeatureValueByFactory.json
     */
    /**
     * Sample code: ExposureControl_GetFeatureValueByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void exposureControlGetFeatureValueByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .exposureControls()
            .getFeatureValueByFactoryWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                new ExposureControlRequest()
                    .withFeatureName("ADFIntegrationRuntimeSharingRbac")
                    .withFeatureType("Feature"),
                Context.NONE);
    }
}