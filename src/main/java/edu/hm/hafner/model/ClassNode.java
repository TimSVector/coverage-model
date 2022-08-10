package edu.hm.hafner.model;

/**
 * A {@link Node} for a specific class. It stores the actual class name.
 */
public class ClassNode extends Node {
    private static final long serialVersionUID = 1621410859864978552L;

    /**
     * Creates a new {@link ClassNode} with the given name.
     *
     * @param name
     *         the name of the class
     */
    public ClassNode(final String name) {
        super(Metric.CLASS, name);
    }
}
