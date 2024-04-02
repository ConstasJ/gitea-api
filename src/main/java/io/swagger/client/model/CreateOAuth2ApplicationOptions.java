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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateOAuth2ApplicationOptions holds options to create an oauth2 application
 */
@Schema(description = "CreateOAuth2ApplicationOptions holds options to create an oauth2 application")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class CreateOAuth2ApplicationOptions {
  @SerializedName("confidential_client")
  private Boolean confidentialClient = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("redirect_uris")
  private List<String> redirectUris = null;

  public CreateOAuth2ApplicationOptions confidentialClient(Boolean confidentialClient) {
    this.confidentialClient = confidentialClient;
    return this;
  }

   /**
   * Get confidentialClient
   * @return confidentialClient
  **/
  @Schema(description = "")
  public Boolean isConfidentialClient() {
    return confidentialClient;
  }

  public void setConfidentialClient(Boolean confidentialClient) {
    this.confidentialClient = confidentialClient;
  }

  public CreateOAuth2ApplicationOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOAuth2ApplicationOptions redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateOAuth2ApplicationOptions addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<String>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * Get redirectUris
   * @return redirectUris
  **/
  @Schema(description = "")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOAuth2ApplicationOptions createOAuth2ApplicationOptions = (CreateOAuth2ApplicationOptions) o;
    return Objects.equals(this.confidentialClient, createOAuth2ApplicationOptions.confidentialClient) &&
        Objects.equals(this.name, createOAuth2ApplicationOptions.name) &&
        Objects.equals(this.redirectUris, createOAuth2ApplicationOptions.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidentialClient, name, redirectUris);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOAuth2ApplicationOptions {\n");
    
    sb.append("    confidentialClient: ").append(toIndentedString(confidentialClient)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
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