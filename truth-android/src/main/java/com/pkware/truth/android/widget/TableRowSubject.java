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
package com.pkware.truth.android.widget;

import android.widget.TableRow;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link TableRow} subjects.
 */
public class TableRowSubject extends AbstractLinearLayoutSubject<TableRowSubject, TableRow> {
  protected TableRowSubject(FailureMetadata failureMetadata, TableRow subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<TableRowSubject, TableRow> type() {
    return new Subject.Factory<TableRowSubject, TableRow>() {
      @Override
      public TableRowSubject createSubject(FailureMetadata fm, TableRow that) {
        return new TableRowSubject(fm, that);
      }
    };
  }

  public TableRowSubject hasVirtualChildCount(int count) {
    int actualCount = actual().getVirtualChildCount();
    assertThat(actual().getVirtualChildCount())
        .named("virtual child count")
        .isEqualTo(count);
    return this;
  }
}
