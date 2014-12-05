/*
 * (C) Copyright 2014 Java Test Automation Framework Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.finra.jtaf.core.parsing.exceptions;


/**
 * Base class for exceptions thrown while parsing
 */
public class ParsingException extends Exception {

	/**
	 * Auto-generated
	 */
	private static final long serialVersionUID = -218747052989712917L;

	public ParsingException() {
		super();
	}
	
	public ParsingException(String message) {
		super(message);
	}
	
	public ParsingException(String message, Throwable e) {
		super(message, e);
	}
	
	public ParsingException(Throwable e) {
		super(e);
	}
}
