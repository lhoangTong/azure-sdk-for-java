// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Format write settings. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = FormatWriteSettings.class)
@JsonTypeName("FormatWriteSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AvroWriteSettings", value = AvroWriteSettings.class),
    @JsonSubTypes.Type(name = "OrcWriteSettings", value = OrcWriteSettings.class),
    @JsonSubTypes.Type(name = "ParquetWriteSettings", value = ParquetWriteSettings.class),
    @JsonSubTypes.Type(name = "DelimitedTextWriteSettings", value = DelimitedTextWriteSettings.class),
    @JsonSubTypes.Type(name = "JsonWriteSettings", value = JsonWriteSettings.class)
})
@Fluent
public class FormatWriteSettings {
    /*
     * Format write settings.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of FormatWriteSettings class. */
    public FormatWriteSettings() {
    }

    /**
     * Get the additionalProperties property: Format write settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Format write settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the FormatWriteSettings object itself.
     */
    public FormatWriteSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
