package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CallExpressionSuffix extends CompositeTokenTransformation {
    public static final String NAME = "callExpressionSuffix";

    public CallExpressionSuffix(TokenApplier applier) {
        super(NAME, applier);
    }
}
