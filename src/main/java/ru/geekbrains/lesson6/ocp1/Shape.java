package ru.geekbrains.lesson6.ocp1;

public abstract class Shape {

    private ShapeType shapeType;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
