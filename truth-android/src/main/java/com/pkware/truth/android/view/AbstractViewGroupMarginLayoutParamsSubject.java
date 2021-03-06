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
package com.pkware.truth.android.view;

import android.view.ViewGroup;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractViewGroupMarginLayoutParamsSubject<S extends AbstractViewGroupMarginLayoutParamsSubject<S, T>, T extends ViewGroup.MarginLayoutParams>
    extends Subject<S, T> {
  protected AbstractViewGroupMarginLayoutParamsSubject(FailureMetadata failureMetadata, T subject) {
    super(failureMetadata, subject);
  }

  public S hasBottomMargin(int margin) {
    assertThat(actual().bottomMargin)
        .named("bottom margin")
        .isEqualTo(margin);
    //noinspection unchecked
    return (S) this;
  }

  public S hasLeftMargin(int margin) {
    assertThat(actual().leftMargin)
        .named("left margin")
        .isEqualTo(margin);
    //noinspection unchecked
    return (S) this;
  }

  public S hasRightMargin(int margin) {
    assertThat(actual().rightMargin)
        .named("right margin")
        .isEqualTo(margin);
    //noinspection unchecked
    return (S) this;
  }

  public S hasTopMargin(int margin) {
    assertThat(actual().topMargin)
        .named("top margin")
        .isEqualTo(margin);
    //noinspection unchecked
    return (S) this;
  }
}
