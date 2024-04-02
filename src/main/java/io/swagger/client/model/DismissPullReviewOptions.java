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
 * DismissPullReviewOptions are options to dismiss a pull review
 */
@Schema(description = "DismissPullReviewOptions are options to dismiss a pull review")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class DismissPullReviewOptions {
  @SerializedName("message")
  private String message = null;

  @SerializedName("priors")
  private Boolean priors = null;

  public DismissPullReviewOptions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DismissPullReviewOptions priors(Boolean priors) {
    this.priors = priors;
    return this;
  }

   /**
   * Get priors
   * @return priors
  **/
  @Schema(description = "")
  public Boolean isPriors() {
    return priors;
  }

  public void setPriors(Boolean priors) {
    this.priors = priors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DismissPullReviewOptions dismissPullReviewOptions = (DismissPullReviewOptions) o;
    return Objects.equals(this.message, dismissPullReviewOptions.message) &&
        Objects.equals(this.priors, dismissPullReviewOptions.priors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, priors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DismissPullReviewOptions {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    priors: ").append(toIndentedString(priors)).append("\n");
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