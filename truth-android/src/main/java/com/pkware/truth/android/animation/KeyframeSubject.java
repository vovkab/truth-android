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
package com.pkware.truth.android.animation;

import android.animation.Keyframe;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link Keyframe} subjects.
 */
public class KeyframeSubject extends Subject<KeyframeSubject, Keyframe> {
  private KeyframeSubject(FailureMetadata failureMetadata, Keyframe subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<KeyframeSubject, Keyframe> type() {
    return new Subject.Factory<KeyframeSubject, Keyframe>() {
      @Override
      public KeyframeSubject createSubject(FailureMetadata fm, Keyframe that) {
        return new KeyframeSubject(fm, that);
      }
    };
  }

  public KeyframeSubject hasType(Class type) {
    assertThat(actual().getType())
        .named("type")
        .isEqualTo(type);
    return this;
  }

  public KeyframeSubject hasValue(Object value) {
    assertThat(actual().getValue())
        .named("value")
        .isEqualTo(value);
    return this;
  }
}