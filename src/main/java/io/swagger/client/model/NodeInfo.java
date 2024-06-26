/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.NodeInfoServices;
import io.swagger.client.model.NodeInfoSoftware;
import io.swagger.client.model.NodeInfoUsage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NodeInfo contains standardized way of exposing metadata about a server running one of the distributed social networks
 */
@Schema(description = "NodeInfo contains standardized way of exposing metadata about a server running one of the distributed social networks")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class NodeInfo {
  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("openRegistrations")
  private Boolean openRegistrations = null;

  @SerializedName("protocols")
  private List<String> protocols = null;

  @SerializedName("services")
  private NodeInfoServices services = null;

  @SerializedName("software")
  private NodeInfoSoftware software = null;

  @SerializedName("usage")
  private NodeInfoUsage usage = null;

  @SerializedName("version")
  private String version = null;

  public NodeInfo metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public NodeInfo openRegistrations(Boolean openRegistrations) {
    this.openRegistrations = openRegistrations;
    return this;
  }

   /**
   * Get openRegistrations
   * @return openRegistrations
  **/
  @Schema(description = "")
  public Boolean isOpenRegistrations() {
    return openRegistrations;
  }

  public void setOpenRegistrations(Boolean openRegistrations) {
    this.openRegistrations = openRegistrations;
  }

  public NodeInfo protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public NodeInfo addProtocolsItem(String protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<String>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @Schema(description = "")
  public List<String> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }

  public NodeInfo services(NodeInfoServices services) {
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @Schema(description = "")
  public NodeInfoServices getServices() {
    return services;
  }

  public void setServices(NodeInfoServices services) {
    this.services = services;
  }

  public NodeInfo software(NodeInfoSoftware software) {
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @Schema(description = "")
  public NodeInfoSoftware getSoftware() {
    return software;
  }

  public void setSoftware(NodeInfoSoftware software) {
    this.software = software;
  }

  public NodeInfo usage(NodeInfoUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")
  public NodeInfoUsage getUsage() {
    return usage;
  }

  public void setUsage(NodeInfoUsage usage) {
    this.usage = usage;
  }

  public NodeInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfo nodeInfo = (NodeInfo) o;
    return Objects.equals(this.metadata, nodeInfo.metadata) &&
        Objects.equals(this.openRegistrations, nodeInfo.openRegistrations) &&
        Objects.equals(this.protocols, nodeInfo.protocols) &&
        Objects.equals(this.services, nodeInfo.services) &&
        Objects.equals(this.software, nodeInfo.software) &&
        Objects.equals(this.usage, nodeInfo.usage) &&
        Objects.equals(this.version, nodeInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, openRegistrations, protocols, services, software, usage, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfo {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    openRegistrations: ").append(toIndentedString(openRegistrations)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
