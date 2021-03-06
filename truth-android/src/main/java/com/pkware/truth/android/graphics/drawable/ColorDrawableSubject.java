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

import android.graphics.drawable.ColorDrawable;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assert_;

/**
 * Propositions for {@link ColorDrawable} subjects.
 */
public class ColorDrawableSubject extends AbstractDrawableSubject<ColorDrawableSubject, ColorDrawable> {
  protected ColorDrawableSubject(FailureMetadata failureMetadata, ColorDrawable subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<ColorDrawableSubject, ColorDrawable> type() {
    return new Subject.Factory<ColorDrawableSubject, ColorDrawable>() {
      @Override
      public ColorDrawableSubject createSubject(FailureMetadata fm, ColorDrawable that) {
        return new ColorDrawableSubject(fm, that);
      }
    };
  }

  public ColorDrawableSubject hasColor(int color) {
    int actualColor = actual().getColor();
    assert_()
        .withMessage("Expected color <%s> but was <%s>.", Integer.toHexString(color), Integer.toHexString(actualColor))
        .that(actualColor)
        .isEqualTo(color);
    return this;
  }
}
