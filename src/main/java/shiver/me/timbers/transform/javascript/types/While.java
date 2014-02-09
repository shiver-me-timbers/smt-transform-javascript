package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class While extends CompositeTokenTransformation {
    public static final String NAME = "'while'";

    public While(TokenApplier applier) {
        super(NAME, applier);
    }
}
