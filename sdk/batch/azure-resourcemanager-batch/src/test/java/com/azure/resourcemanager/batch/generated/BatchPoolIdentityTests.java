// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.BatchPoolIdentity;
import com.azure.resourcemanager.batch.models.PoolIdentityType;
import com.azure.resourcemanager.batch.models.UserAssignedIdentities;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BatchPoolIdentityTests {
    @Test
    public void testDeserialize() {
        BatchPoolIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"zzikhlyfjhdg\":{\"principalId\":\"mjwosytx\",\"clientId\":\"cskfcktqumiekk\"},\"dsuvarmywdmjsjqb\":{\"principalId\":\"gebdunygaeq\",\"clientId\":\"bqfatpxllrxcyjmo\"}}}")
                .toObject(BatchPoolIdentity.class);
        Assertions.assertEquals(PoolIdentityType.USER_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        BatchPoolIdentity model =
            new BatchPoolIdentity()
                .withType(PoolIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "zzikhlyfjhdg",
                        new UserAssignedIdentities(),
                        "dsuvarmywdmjsjqb",
                        new UserAssignedIdentities()));
        model = BinaryData.fromObject(model).toObject(BatchPoolIdentity.class);
        Assertions.assertEquals(PoolIdentityType.USER_ASSIGNED, model.type());
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
