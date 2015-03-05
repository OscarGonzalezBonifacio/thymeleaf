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
package org.thymeleaf.aurora.engine;

import org.thymeleaf.aurora.templatemode.TemplateMode;
import org.thymeleaf.aurora.text.ITextRepository;
import org.thymeleaf.util.Validate;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public final class DocumentModelFactory {


    private final TemplateMode templateMode;
    private final ITextRepository textRepository;
    private final AttributeDefinitions attributeDefinitions;
    private final ElementDefinitions elementDefinitions;




    public DocumentModelFactory(
            final TemplateMode templateMode, final ITextRepository textRepository,
            final AttributeDefinitions attributeDefinitions, final ElementDefinitions elementDefinitions) {

        super();

        Validate.notNull(templateMode, "Template Mode cannot be null");
        Validate.notNull(textRepository, "Text Repository cannot be null");
        Validate.notNull(attributeDefinitions, "Attribute Definitions cannot be null");
        Validate.notNull(elementDefinitions, "Element Definitions cannot be null");

        this.templateMode = templateMode;
        this.textRepository = textRepository;
        this.attributeDefinitions = attributeDefinitions;
        this.elementDefinitions = elementDefinitions;

    }




    public CDATASection createCDATASection(final String content) {
        return new CDATASection(this.textRepository, content);
    }

}
