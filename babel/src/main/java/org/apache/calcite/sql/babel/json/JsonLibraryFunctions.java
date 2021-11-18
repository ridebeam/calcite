/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.calcite.sql.babel.json;

import org.apache.calcite.sql.SqlBinaryOperator;
import org.apache.calcite.sql.fun.LibraryOperator;
import org.apache.calcite.sql.fun.SqlLibrary;

/** default stuff.*/
public abstract class JsonLibraryFunctions {
  @LibraryOperator(
      libraries = {SqlLibrary.POSTGRESQL}
  )
  public static final SqlBinaryOperator JSON_ELEM;
  public static final SqlBinaryOperator JSON_ELEM_TEXT;
  public static final SqlBinaryOperator JSON_PATH;
  public static final SqlBinaryOperator JSON_PATH_TEXT;
//  public static final SqlOperator JSON_OPERATOR;

  static {
   // JSON_OPERATOR = OperandTypes.or(OperandTypes.ANY);

    JSON_ELEM = new JsonOperator(JsonOperatorKind.JSON_ELEM);
    JSON_ELEM_TEXT = new JsonOperator(JsonOperatorKind.JSON_ELEM_TEXT);
    JSON_PATH = new JsonOperator(JsonOperatorKind.JSON_PATH);
    JSON_PATH_TEXT = new JsonOperator(JsonOperatorKind.JSON_PATH);
  }
}
