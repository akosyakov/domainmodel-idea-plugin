package org.example.domainmodel.domainmodel.lang.parsing;

import com.intellij.testFramework.ParsingTestCase;
import com.intellij.testFramework.PlatformTestCase;

public class DomainModelParsingTest extends ParsingTestCase {

    public DomainModelParsingTest() {
        super("", "dmodel", new DomainModelParserDefinition());
        PlatformTestCase.initPlatformLangPrefix();
    }

    @Override
    protected String getTestDataPath() {
        return "./testData";
    }

    public void testData() throws Exception {
        doTest(true);
    }

}