/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.web.servlet.view.groovy;

import groovy.text.markup.MarkupTemplateEngine;

/**
 * Interface to be implemented by objects that configure and manage a
 * Groovy MarkupTemplateEngine for automatic lookup in a web environment.
 * Detected and used by GroovyMarkupView.
 *
 * @author Brian Clozel
 * @see GroovyMarkupConfigurer
 * @since 4.1
 */
public interface GroovyMarkupConfig {

	/**
	 * Return the Groovy MarkupTemplateEngine for the current web application context.
	 * May be unique to one servlet, or shared in the root context.
	 * @return the Groovy Template engine
	 */
	MarkupTemplateEngine getTemplateEngine();

}