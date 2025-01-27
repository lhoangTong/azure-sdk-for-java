// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.NameInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NameInfoTests {
    @Test
    public void testDeserialize() {
        NameInfo model =
            BinaryData.fromString("{\"value\":\"psbjta\",\"localizedValue\":\"ugxywpmueef\"}").toObject(NameInfo.class);
        Assertions.assertEquals("psbjta", model.value());
        Assertions.assertEquals("ugxywpmueef", model.localizedValue());
    }

    @Test
    public void testSerialize() {
        NameInfo model = new NameInfo().withValue("psbjta").withLocalizedValue("ugxywpmueef");
        model = BinaryData.fromObject(model).toObject(NameInfo.class);
        Assertions.assertEquals("psbjta", model.value());
        Assertions.assertEquals("ugxywpmueef", model.localizedValue());
    }
}
