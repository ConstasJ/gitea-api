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
import io.swagger.client.model.NodeInfoUsageUsers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NodeInfoUsage contains usage statistics for this server
 */
@Schema(description = "NodeInfoUsage contains usage statistics for this server")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class NodeInfoUsage {
  @SerializedName("localComments")
  private Long localComments = null;

  @SerializedName("localPosts")
  private Long localPosts = null;

  @SerializedName("users")
  private NodeInfoUsageUsers users = null;

  public NodeInfoUsage localComments(Long localComments) {
    this.localComments = localComments;
    return this;
  }

   /**
   * Get localComments
   * @return localComments
  **/
  @Schema(description = "")
  public Long getLocalComments() {
    return localComments;
  }

  public void setLocalComments(Long localComments) {
    this.localComments = localComments;
  }

  public NodeInfoUsage localPosts(Long localPosts) {
    this.localPosts = localPosts;
    return this;
  }

   /**
   * Get localPosts
   * @return localPosts
  **/
  @Schema(description = "")
  public Long getLocalPosts() {
    return localPosts;
  }

  public void setLocalPosts(Long localPosts) {
    this.localPosts = localPosts;
  }

  public NodeInfoUsage users(NodeInfoUsageUsers users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public NodeInfoUsageUsers getUsers() {
    return users;
  }

  public void setUsers(NodeInfoUsageUsers users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoUsage nodeInfoUsage = (NodeInfoUsage) o;
    return Objects.equals(this.localComments, nodeInfoUsage.localComments) &&
        Objects.equals(this.localPosts, nodeInfoUsage.localPosts) &&
        Objects.equals(this.users, nodeInfoUsage.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localComments, localPosts, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoUsage {\n");
    
    sb.append("    localComments: ").append(toIndentedString(localComments)).append("\n");
    sb.append("    localPosts: ").append(toIndentedString(localPosts)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
