/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.tone_analyzer.v3.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Tone analysis results performed on the entire document's text. This includes three tone categories: Social Tone,
 * Emotion Tone and Language Tone.
 */
public class ToneAnalysisDocumentTone extends GenericModel {

  /**
   * Tone analysis results for this sentence; divided in three Tone categories: Social Tone, Emotion Tone and Writing
   * Tone.
   */
  @SerializedName("tone_categories")
  private List<ToneCategory> toneCategories;

  /**
   * Gets the toneCategories.
   *
   * @return the toneCategories
   */
  public List<ToneCategory> getToneCategories() {
    return toneCategories;
  }

  /**
   * Sets the toneCategories.
   *
   * @param toneCategories the new toneCategories
   */
  public void setToneCategories(final List<ToneCategory> toneCategories) {
    this.toneCategories = toneCategories;
  }
}
