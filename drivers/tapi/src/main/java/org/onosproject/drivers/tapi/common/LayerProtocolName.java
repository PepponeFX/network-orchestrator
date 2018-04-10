/*
 * Copyright (c) 2018 ACINO Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.drivers.tapi.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Provides a controlled list of layer protocol names and indicates the naming authority.
 * Note that it is expected that attributes will be added to this structure to convey the naming authority name, the name of the layer protocol using a human readable string and any particular standard reference.
 * Layer protocol names include:
 * -    Layer 1 (L1): OTU, ODU
 * -    Layer 2 (L2): Carrier Grade Ethernet (ETY, ETH), MPLS-TP (MT)
 * 
 */
public enum LayerProtocolName {
  OCH("och"), ODU("odu"), ETH("eth"), MPLS_TP("mpls-tp");

  private final String jsonName;

  private LayerProtocolName(){
      this.jsonName = this.name();
  }

  private LayerProtocolName(String jsonName) {
    this.jsonName = jsonName;
  }

  @JsonCreator
  public static LayerProtocolName fromJsonString(String jsonString) {
    for (LayerProtocolName value : LayerProtocolName.values())
      if (value.jsonName.equals(jsonString)) {
        return value;
      }
    return null;
  }

  @JsonValue
  public String toJsonString() {
    return this.jsonName;
  }

}