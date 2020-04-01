package alma;

import annotation.TestCaseKey;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.support.AnnotationSupport;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Tm4jExtension implements BeforeEachCallback {

    public static final String TEST_CASE_KEY = "testCaseKey";
    Map<String, String> annotationsMap = new HashMap<>();

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        Optional<TestCaseKey> testCaseOption = AnnotationSupport.findAnnotation(context.getTestMethod(), TestCaseKey.class);
        testCaseOption.ifPresent(testCase -> publishAnnotation(testCase, context));
    }

    private void publishAnnotation(final TestCaseKey testCase, final ExtensionContext context) {
        int i = 0;
        for (String key:testCase.keys()){
            annotationsMap.put(TEST_CASE_KEY.concat(String.valueOf(i)),key);
            i++;
        }
        context.publishReportEntry(annotationsMap);
    }
}
