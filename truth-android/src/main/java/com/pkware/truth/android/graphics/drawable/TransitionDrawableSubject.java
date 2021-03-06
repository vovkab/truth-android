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
package com.pkware.truth.android.graphics.drawable;

import android.graphics.drawable.TransitionDrawable;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link TransitionDrawable} subjects.
 */
public class TransitionDrawableSubject extends AbstractDrawableSubject<TransitionDrawableSubject, TransitionDrawable> {
  protected TransitionDrawableSubject(FailureMetadata failureMetadata, TransitionDrawable subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<TransitionDrawableSubject, TransitionDrawable> type() {
    return new Subject.Factory<TransitionDrawableSubject, TransitionDrawable>() {
      @Override
      public TransitionDrawableSubject createSubject(FailureMetadata fm, TransitionDrawable that) {
        return new TransitionDrawableSubject(fm, that);
      }
    };
  }

  public TransitionDrawableSubject isCrossFadeEnabled() {
    assertThat(actual().isCrossFadeEnabled())
        .named("cross-fade is enabled")
        .isTrue();
    return this;
  }

  public TransitionDrawableSubject isCrossFadeDisabled() {
    assertThat(!actual().isCrossFadeEnabled())
        .named("cross-fade is disabled")
        .isTrue();
    return this;
  }
}
