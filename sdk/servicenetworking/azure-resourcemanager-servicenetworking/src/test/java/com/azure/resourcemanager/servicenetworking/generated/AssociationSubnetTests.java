// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociationSubnetTests {
    @Test
    public void testDeserialize() {
        AssociationSubnet model = BinaryData.fromString("{\"id\":\"jfddgmbmbe\"}").toObject(AssociationSubnet.class);
        Assertions.assertEquals("jfddgmbmbe", model.id());
    }

    @Test
    public void testSerialize() {
        AssociationSubnet model = new AssociationSubnet().withId("jfddgmbmbe");
        model = BinaryData.fromObject(model).toObject(AssociationSubnet.class);
        Assertions.assertEquals("jfddgmbmbe", model.id());
    }
}
