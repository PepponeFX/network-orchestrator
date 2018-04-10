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

/**
 * Net2Plan - ONOS REST Interface
 * Interface description for Net2Plan to ONOS integration. This is the API presented by Net2Plan to ONOS, a separate description exists for the other direction.
 * <p>
 * OpenAPI spec version: 0.1.3
 * Contact: ponsko@acreo.se
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.onosproject.orchestrator.netrap.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Objects;

/**
 * Representation of a single node The node can be either ROADM, OTN, SWITCH/ROUTER types. For ACINO, the attribute list should include  \&quot;IPNode\&quot;: \&quot;true\&quot; (OTN/SWITCH/ROUTER) or \&quot;false\&quot; (ROADM), and  \&quot;name\&quot;: \&quot;a3_bottom\&quot;, the symbolic name in ONOS
 */

public class NetRapNode {

    private Double MTBF = null;
    private Double MTTR = null;
    private String SRG = null;
    private String name = null;
    private Double latitude = null;
    private Double longitude = null;
    private HashMap attributes = null;

    /**
     * Mean Time Between Failure in Hours If not here, a default value will be assigned
     **/
    public NetRapNode MTBF(Double MTBF) {
        this.MTBF = MTBF;
        return this;
    }


    @ApiModelProperty(example = "null", value = "Mean Time Between Failure in Hours If not here, a default value will be assigned")
    public Double getMTBF() {
        return MTBF;
    }

    public void setMTBF(Double MTBF) {
        this.MTBF = MTBF;
    }

    /**
     * Mean Time To Recovery in Hours If not here, a default value will be assigned
     **/
    public NetRapNode MTTR(Double MTTR) {
        this.MTTR = MTTR;
        return this;
    }


    @ApiModelProperty(example = "null", value = "Mean Time To Recovery in Hours If not here, a default value will be assigned")
    public Double getMTTR() {
        return MTTR;
    }

    public void setMTTR(Double MTTR) {
        this.MTTR = MTTR;
    }

    /**
     * Name of a Shared-risk group If not here, an SRG will not be assigned If here, an SRG with default values will be created and assigned
     **/
    public NetRapNode SRG(String SRG) {
        this.SRG = SRG;
        return this;
    }


    @ApiModelProperty(example = "null", value = "Name of a Shared-risk group If not here, an SRG will not be assigned If here, an SRG with default values will be created and assigned")
    public String getSRG() {
        return SRG;
    }

    public void setSRG(String SRG) {
        this.SRG = SRG;
    }

    /**
     * External name of the device (ONOS name)
     **/
    public NetRapNode name(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(example = "null", required = true, value = "External name of the device (ONOS name)")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * X position of the node
     **/
    public NetRapNode latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }


    @ApiModelProperty(example = "null", required = true, value = "X position of the node")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Y position of the node
     **/
    public NetRapNode longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }


    @ApiModelProperty(example = "null", required = true, value = "Y position of the node")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Representation of a single node The node can be either ROADM, OTN, SWITCH/ROUTER types. For ACINO, the attribute list should include  \"IPNode\": \"true\" (OTN/SWITCH/ROUTER) or \"false\" (ROADM), and  \"name\": \"a3_bottom\", the symbolic name in ONOS
     **/
    public NetRapNode attributes(HashMap attributes) {
        this.attributes = attributes;
        return this;
    }


    @ApiModelProperty(example = "null", value = "Representation of a single node The node can be either ROADM, OTN, SWITCH/ROUTER types. For ACINO, the attribute list should include  \"IPNode\": \"true\" (OTN/SWITCH/ROUTER) or \"false\" (ROADM), and  \"name\": \"a3_bottom\", the symbolic name in ONOS")
    public HashMap getAttributes() {
        return attributes;
    }

    public void setAttributes(HashMap attributes) {
        this.attributes = attributes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetRapNode netRapNode = (NetRapNode) o;
        return Objects.equals(MTBF, netRapNode.MTBF) &&
                Objects.equals(MTTR, netRapNode.MTTR) &&
                Objects.equals(SRG, netRapNode.SRG) &&
                Objects.equals(name, netRapNode.name) &&
                Objects.equals(latitude, netRapNode.latitude) &&
                Objects.equals(longitude, netRapNode.longitude) &&
                Objects.equals(attributes, netRapNode.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MTBF, MTTR, SRG, name, latitude, longitude, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetRapNode {\n");

        sb.append("    MTBF: ").append(toIndentedString(MTBF)).append("\n");
        sb.append("    MTTR: ").append(toIndentedString(MTTR)).append("\n");
        sb.append("    SRG: ").append(toIndentedString(SRG)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

