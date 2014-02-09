package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class BitwiseORExpressionNoIn extends CompositeTokenTransformation {
    public static final String NAME = "bitwiseORExpressionNoIn";

    public BitwiseORExpressionNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
