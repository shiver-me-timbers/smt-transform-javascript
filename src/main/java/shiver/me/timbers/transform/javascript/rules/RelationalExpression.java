package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class RelationalExpression extends CompositeTokenTransformation {
    public static final String NAME = "relationalExpression";

    public RelationalExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
