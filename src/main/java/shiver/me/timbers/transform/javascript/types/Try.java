package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Try extends CompositeTokenTransformation {
    public static final String NAME = "'try'";

    public Try(TokenApplier applier) {
        super(NAME, applier);
    }
}