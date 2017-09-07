/*
 * Copyright 2017 Adalloc Inc. All Rights Reserved.
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

package com.adalloc.openrtb;

import static com.google.openrtb.json.OpenRtbJsonUtils.endObject;
import static com.google.openrtb.json.OpenRtbJsonUtils.getCurrentName;
import static com.google.openrtb.json.OpenRtbJsonUtils.startArray;
import static com.google.openrtb.json.OpenRtbJsonUtils.startObject;

import com.adalloc.openrtb.SmaatoExt.BidRequestExt.UniqueDeviceIdContainer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import com.google.openrtb.json.OpenRtbJsonUtils;

/**
 * Utilities for writing JSON serialization code.
 */
public class SmaatoJsonUtils {


  protected static void writeUniqueDeviceIdContainer(UniqueDeviceIdContainer udi, JsonGenerator gen) throws IOException {
    gen.writeStartObject();
    writeUniqueDeviceIdContainerFields(udi, gen);
    gen.writeEndObject();
  }

  protected static void writeUniqueDeviceIdContainerFields(UniqueDeviceIdContainer udi, JsonGenerator gen) throws IOException {
    if (udi.hasAndroidid()) {
      gen.writeStringField("androidid", udi.getAndroidid());
    }

    if (udi.hasAndroididmd5()) {
      gen.writeStringField("androididmd5", udi.getAndroididmd5());
    }

    if (udi.hasAndroididsha1()) {
      gen.writeStringField("androididsha1", udi.getAndroididsha1());
    }

    if (udi.hasImei()) {
      gen.writeStringField("imei", udi.getImei());
    }

    if (udi.hasImeimd5()) {
      gen.writeStringField("imeimd5", udi.getImeimd5());
    }

    if (udi.hasImeisha1()) {
      gen.writeStringField("imeisha1", udi.getImeisha1());
    }

    if (udi.hasUdidmd5()) {
      gen.writeStringField("udidmd5", udi.getUdidmd5());
    }

    if (udi.hasUdidsha1()) {
      gen.writeStringField("udidsha1", udi.getUdidsha1());
    }

    if (udi.hasMacmd5()) {
      gen.writeStringField("macmd5", udi.getMacmd5());
    }

    if (udi.hasMacsha1()) {
      gen.writeStringField("macsha1", udi.getMacsha1());
    }

    if (udi.hasOdin()) {
      gen.writeStringField("odin", udi.getOdin());
    }

    if (udi.hasOpenudid()) {
      gen.writeStringField("openudid", udi.getOpenudid());
    }

    if (udi.hasIdfa()) {
      gen.writeStringField("idfa", udi.getIdfa());
    }

    if (udi.hasIdfamd5()) {
      gen.writeStringField("idfamd5", udi.getIdfamd5());
    }

    if (udi.hasIdfasha1()) {
      gen.writeStringField("idfasha1", udi.getIdfasha1());
    }

    if (udi.hasIdfatracking()) {
      OpenRtbJsonUtils.writeIntBoolField("idfatracking", udi.getIdfatracking(), gen);
    }

    if (udi.hasGoogleadid()) {
      gen.writeStringField("googleadid", udi.getGoogleadid());
    }

    if (udi.hasGooglednt()) {
      OpenRtbJsonUtils.writeIntBoolField("googlednt", udi.getGooglednt(), gen);
    }

    if (udi.hasBbid()) {
      gen.writeStringField("bbid", udi.getBbid());
    }

    if (udi.hasWpid()) {
      gen.writeStringField("wpid", udi.getWpid());
    }

    if (udi.hasAtuid()) {
      gen.writeStringField("atuid", udi.getAtuid());
    }
  }

  protected static UniqueDeviceIdContainer.Builder readUniqueDeviceIdContainer(JsonParser par) throws IOException {
    UniqueDeviceIdContainer.Builder udi = UniqueDeviceIdContainer.newBuilder();
    for (startObject(par); endObject(par); par.nextToken()) {
      String fieldName = getCurrentName(par);
      if (par.nextToken() != JsonToken.VALUE_NULL) {
        readUniqueDeviceIdContainerField(par, udi, fieldName);
      }
    }
    return udi;
  }

  protected static void readUniqueDeviceIdContainerField(JsonParser par, UniqueDeviceIdContainer.Builder udi, String fieldName) throws IOException {
    switch (fieldName) {
      case "androidid":
        udi.setAndroidid(par.getText());
        break;
      case "androididmd5":
        udi.setAndroididmd5(par.getText());
        break;
      case "androididsha1":
        udi.setAndroididsha1(par.getText());
        break;
      case "imei":
        udi.setImei(par.getText());
        break;
      case "imeimd5":
        udi.setImeimd5(par.getText());
        break;
      case "imeisha1":
        udi.setImeisha1(par.getText());
        break;
      case "udidmd5":
        udi.setUdidmd5(par.getText());
        break;
      case "udidsha1":
        udi.setUdidsha1(par.getText());
        break;
      case "macmd5":
        udi.setMacmd5(par.getText());
        break;
      case "macsha1":
        udi.setMacsha1(par.getText());
        break;
      case "odin":
        udi.setOdin(par.getText());
        break;
      case "openudid":
        udi.setOpenudid(par.getText());
        break;
      case "idfa":
        udi.setIdfa(par.getText());
        break;
      case "idfamd5":
        udi.setIdfamd5(par.getText());
        break;
      case "idfasha1":
        udi.setIdfasha1(par.getText());
        break;
      case "idfatracking":
        par.nextToken();
        udi.setIdfatracking(par.getValueAsBoolean());
        break;
      case "googleadid":
        udi.setGoogleadid(par.getText());
        break;
      case "googlednt":
        par.nextToken();
        udi.setGooglednt(par.getValueAsBoolean());
        break;
      case "bbid":
        udi.setBbid(par.getText());
        break;
      case "wpid":
        udi.setWpid(par.getText());
        break;
      case "atuid":
        udi.setAtuid(par.getText());
        break;
    }

  }

}
