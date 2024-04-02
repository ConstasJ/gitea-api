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
/**
 * CreateOrgOption options for creating an organization
 */
@Schema(description = "CreateOrgOption options for creating an organization")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class CreateOrgOption {
  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("repo_admin_change_team_access")
  private Boolean repoAdminChangeTeamAccess = null;

  @SerializedName("username")
  private String username = null;

  /**
   * possible values are &#x60;public&#x60; (default), &#x60;limited&#x60; or &#x60;private&#x60;
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    @SerializedName("public")
    PUBLIC("public"),
    @SerializedName("limited")
    LIMITED("limited"),
    @SerializedName("private")
    PRIVATE("private");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityEnum fromValue(String input) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VisibilityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

  @SerializedName("website")
  private String website = null;

  public CreateOrgOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateOrgOption email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateOrgOption fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CreateOrgOption location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CreateOrgOption repoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
    return this;
  }

   /**
   * Get repoAdminChangeTeamAccess
   * @return repoAdminChangeTeamAccess
  **/
  @Schema(description = "")
  public Boolean isRepoAdminChangeTeamAccess() {
    return repoAdminChangeTeamAccess;
  }

  public void setRepoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
  }

  public CreateOrgOption username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateOrgOption visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * possible values are &#x60;public&#x60; (default), &#x60;limited&#x60; or &#x60;private&#x60;
   * @return visibility
  **/
  @Schema(description = "possible values are `public` (default), `limited` or `private`")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public CreateOrgOption website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrgOption createOrgOption = (CreateOrgOption) o;
    return Objects.equals(this.description, createOrgOption.description) &&
        Objects.equals(this.email, createOrgOption.email) &&
        Objects.equals(this.fullName, createOrgOption.fullName) &&
        Objects.equals(this.location, createOrgOption.location) &&
        Objects.equals(this.repoAdminChangeTeamAccess, createOrgOption.repoAdminChangeTeamAccess) &&
        Objects.equals(this.username, createOrgOption.username) &&
        Objects.equals(this.visibility, createOrgOption.visibility) &&
        Objects.equals(this.website, createOrgOption.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, email, fullName, location, repoAdminChangeTeamAccess, username, visibility, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrgOption {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    repoAdminChangeTeamAccess: ").append(toIndentedString(repoAdminChangeTeamAccess)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
