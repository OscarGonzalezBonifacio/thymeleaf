/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.thymeleaf.aurora.templatemode;

/**
 *
 * @author Daniel Fern&aacute;ndez
 *
 * @since 3.0.0
 *
 */
public enum TemplateMode {

    HTML(true, false, false), XML(false, true, false), TEXT(false, false, true);


    private final boolean html;
    private final boolean xml;
    private final boolean text;

    TemplateMode(final boolean html, final boolean xml, final boolean text) {
        this.html = html;
        this.xml = xml;
        this.text = text;
    }

    public boolean isHTML() {
        return this.html;
    }

    public boolean isXML() {
        return this.xml;
    }

    public boolean isText() {
        return this.text;
    }

}
