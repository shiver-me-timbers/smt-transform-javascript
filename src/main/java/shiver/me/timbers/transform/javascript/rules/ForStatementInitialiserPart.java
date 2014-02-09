package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForStatementInitialiserPart extends CompositeTokenTransformation {
    public static final String NAME = "forStatementInitialiserPart";

    public ForStatementInitialiserPart(TokenApplier applier) {
        super(NAME, applier);
    }
}
