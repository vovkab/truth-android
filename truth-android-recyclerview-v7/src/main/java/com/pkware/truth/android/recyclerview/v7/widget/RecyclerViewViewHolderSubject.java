/*
 * Copyright 2013 Square, Inc.
 * Copyright 2016 PKWARE, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pkware.truth.android.recyclerview.v7.widget;

import android.support.v7.widget.RecyclerView;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link RecyclerView.ViewHolder} subjects.
 */
public class RecyclerViewViewHolderSubject
    extends Subject<RecyclerViewViewHolderSubject, RecyclerView.ViewHolder> {

  protected RecyclerViewViewHolderSubject(FailureMetadata failureMetadata, RecyclerView.ViewHolder subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<RecyclerViewViewHolderSubject, RecyclerView.ViewHolder> type() {
    return new Subject.Factory<RecyclerViewViewHolderSubject, RecyclerView.ViewHolder>() {
      @Override
      public RecyclerViewViewHolderSubject createSubject(FailureMetadata fm, RecyclerView.ViewHolder that) {
        return new RecyclerViewViewHolderSubject(fm, that);
      }
    };
  }

  public RecyclerViewViewHolderSubject hasPosition(int position) {
    assertThat(actual().getPosition())
        .named("position")
        .isEqualTo(position);
    return this;
  }

  public RecyclerViewViewHolderSubject hasItemId(long itemId) {
    assertThat(actual().getItemId())
        .named("item ID")
        .isEqualTo(itemId);
    return this;
  }

  public RecyclerViewViewHolderSubject hasItemViewType(int itemViewType) {
    assertThat(actual().getItemViewType())
        .named("item view type")
        .isEqualTo(itemViewType);
    return this;
  }

  public RecyclerViewViewHolderSubject isRecyclable() {
    assertThat(actual().isRecyclable())
        .named("is recyclable")
        .isTrue();
    return this;
  }

  public RecyclerViewViewHolderSubject isNotRecyclable() {
    assertThat(actual().isRecyclable())
        .named("is recyclable")
        .isFalse();
    return this;
  }
}
