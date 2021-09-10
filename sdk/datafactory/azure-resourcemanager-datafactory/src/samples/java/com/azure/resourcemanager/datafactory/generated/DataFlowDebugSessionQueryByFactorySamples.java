// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.Context;

/** Samples for DataFlowDebugSession QueryByFactory. */
public final class DataFlowDebugSessionQueryByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/DataFlowDebugSession_QueryByFactory.json
     */
    /**
     * Sample code: DataFlowDebugSession_QueryByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void dataFlowDebugSessionQueryByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.dataFlowDebugSessions().queryByFactory("exampleResourceGroup", "exampleFactoryName", Context.NONE);
    }
}