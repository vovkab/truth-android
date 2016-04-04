/*
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
package com.pkware.truth.android.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assert_;
import static com.pkware.truth.android.internal.IntegerUtils.buildNamedValueString;

/**
 * Propositions for {@link PopupWindow} subjects.
 */
public class PopupWindowSubject extends Subject<PopupWindowSubject, PopupWindow> {
  protected PopupWindowSubject(FailureStrategy failureStrategy, PopupWindow subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<PopupWindowSubject, PopupWindow> type() {
    return new SubjectFactory<PopupWindowSubject, PopupWindow>() {
      @Override
      public PopupWindowSubject getSubject(FailureStrategy fs, PopupWindow that) {
        return new PopupWindowSubject(fs, that);
      }
    };
  }

  public static String inputMethodModeToString(@PopupWindowInputMethodMode int mode) {
    return buildNamedValueString(mode)
        .value(PopupWindow.INPUT_METHOD_FROM_FOCUSABLE, "fromFocusable")
        .value(PopupWindow.INPUT_METHOD_NEEDED, "needed")
        .value(PopupWindow.INPUT_METHOD_NOT_NEEDED, "notNeeded")
        .get();
  }

  public PopupWindowSubject hasAnimationStyle(int style) {
    assertThat(getSubject().getAnimationStyle())
        .named("animation style")
        .isEqualTo(style);
    return this;
  }

  public PopupWindowSubject hasBackground(Drawable background) {
    assertThat(getSubject().getBackground())
        .named("background")
        .isSameAs(background);
    return this;
  }

  public PopupWindowSubject hasContentView(View view) {
    assertThat(getSubject().getContentView())
        .named("content view")
        .isSameAs(view);
    return this;
  }

  public PopupWindowSubject hasHeight(int height) {
    assertThat(getSubject().getHeight())
        .named("height")
        .isEqualTo(height);
    return this;
  }

  public PopupWindowSubject hasInputMethodMode(@PopupWindowInputMethodMode int mode) {
    int actualMode = getSubject().getInputMethodMode();
    //noinspection ResourceType
    assert_()
        .withFailureMessage("Expected input method mode <%s> but was <%s>.",
            inputMethodModeToString(mode), inputMethodModeToString(actualMode))
        .that(actualMode)
        .isEqualTo(mode);
    return this;
  }

  public PopupWindowSubject hasSoftInputMode(int mode) {
    assertThat(getSubject().getSoftInputMode())
        .named("soft input mode")
        .isEqualTo(mode);
    return this;
  }

  public PopupWindowSubject hasWidth(int width) {
    assertThat(getSubject().getWidth())
        .named("width")
        .isEqualTo(width);
    return this;
  }

  public PopupWindowSubject isAboveAnchor() {
    assertThat(getSubject().isAboveAnchor())
        .named("is above anchor")
        .named("is above anchor")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isNotAboveAnchor() {
    assertThat(getSubject().isAboveAnchor())
        .named("is above anchor")
        .isFalse();
    return this;
  }

  public PopupWindowSubject isClippingEnabled() {
    assertThat(getSubject().isClippingEnabled())
        .named("is clipping enabled")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isClippingDisabled() {
    assertThat(!getSubject().isClippingEnabled())
        .named("is clipping disabled")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isFocusable() {
    assertThat(getSubject().isFocusable())
        .named("is focusable")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isNotFocusable() {
    assertThat(getSubject().isFocusable())
        .named("is focusable")
        .isFalse();
    return this;
  }

  public PopupWindowSubject isTouchableOutside() {
    assertThat(getSubject().isOutsideTouchable())
        .named("is touchable outside")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isNotTouchableOutside() {
    assertThat(getSubject().isOutsideTouchable())
        .named("is touchable outside")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isShowing() {
    assertThat(getSubject().isShowing())
        .named("is showing")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isNotShowing() {
    assertThat(getSubject().isShowing())
        .named("is showing")
        .isFalse();
    return this;
  }

  public PopupWindowSubject isSplitTouchEnabled() {
    assertThat(getSubject().isSplitTouchEnabled())
        .named("is split touch enabled")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isSplitTouchDisabled() {
    assertThat(!getSubject().isSplitTouchEnabled())
        .named("is split touch disabled")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isTouchable() {
    assertThat(getSubject().isTouchable())
        .named("is touchable")
        .isTrue();
    return this;
  }

  public PopupWindowSubject isNotTouchable() {
    assertThat(getSubject().isTouchable())
        .named("is touchable")
        .isFalse();
    return this;
  }
}
