package de.larsgrefer;

import io.github.classgraph.ClassGraph;
import jakarta.faces.component.UIComponent;
import jakarta.faces.view.facelets.FaceletContext;
import jakarta.faces.view.facelets.TagConfig;
import jakarta.faces.view.facelets.TagHandler;

import java.io.IOException;

public class ClassgraphTag extends TagHandler {

    public ClassgraphTag(TagConfig config) {
        super(config);
    }

    @Override
    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {
        //dummy
    }

    public String unused(ClassGraph classGraph) {
        return classGraph.getClasspath();
    }
}
