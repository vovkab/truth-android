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
package com.pkware.truth.android.util;

import android.annotation.TargetApi;
import android.util.SparseBooleanArray;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import java.util.Locale;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assert_;

/**
 * Propositions for {@link SparseBooleanArray} subjects.
 */
@TargetApi(JELLY_BEAN_MR2)
public class SparseBooleanArraySubject extends Subject<SparseBooleanArraySubject, SparseBooleanArray> {
  protected SparseBooleanArraySubject(FailureMetadata failureMetadata, SparseBooleanArray subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<SparseBooleanArraySubject, SparseBooleanArray> type() {
    return new Subject.Factory<SparseBooleanArraySubject, SparseBooleanArray>() {
      @Override
      public SparseBooleanArraySubject createSubject(FailureMetadata fm, SparseBooleanArray that) {
        return new SparseBooleanArraySubject(fm, that);
      }
    };
  }

  public SparseBooleanArraySubject keyIsTrue(int key) {
    assertThat(actual().get(key))
        .named(String.format(Locale.ENGLISH, "key %d", key))
        .isTrue();
    return this;
  }

  public SparseBooleanArraySubject keyIsFalse(int key) {
    assertThat(actual().get(key))
        .named(String.format(Locale.ENGLISH, "key %d", key))
        .isFalse();
    return this;
  }

  public SparseBooleanArraySubject hasKey(int key) {
    assert_()
        .withMessage("Expected key <%s> to be present but was not.", key)
        .that(actual().indexOfKey(key))
        .isGreaterThan(-1);
    return this;
  }

  public SparseBooleanArraySubject doesNotHaveKey(int key) {
    assert_()
        .withMessage("Expected key <%s> to not be present but was.")
        .that(actual().indexOfKey(key))
        .isLessThan(0);
    return this;
  }

  public SparseBooleanArraySubject hasSize(int size) {
    assertThat(actual().size())
        .named("size")
        .isEqualTo(size);
    return this;
  }
}
