// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentQuota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CommitmentQuotaTests {
    @Test
    public void testDeserialize() {
        CommitmentQuota model =
            BinaryData
                .fromString("{\"quantity\":8988719472980860271,\"unit\":\"wkz\"}")
                .toObject(CommitmentQuota.class);
        Assertions.assertEquals(8988719472980860271L, model.quantity());
        Assertions.assertEquals("wkz", model.unit());
    }

    @Test
    public void testSerialize() {
        CommitmentQuota model = new CommitmentQuota().withQuantity(8988719472980860271L).withUnit("wkz");
        model = BinaryData.fromObject(model).toObject(CommitmentQuota.class);
        Assertions.assertEquals(8988719472980860271L, model.quantity());
        Assertions.assertEquals("wkz", model.unit());
    }
}
