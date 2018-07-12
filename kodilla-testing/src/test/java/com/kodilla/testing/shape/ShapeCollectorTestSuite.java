package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector = new ShapeCollector();

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle(5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(circle, result);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape triangle = new Triangle (2,5);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertNull(shapeCollector.getFigure(0));
    }
    @Test
    public void testShowFigures() {
        //Given
        Shape triangle = new Triangle(5, 7);
        Shape square = new Square(5);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When
        List<Shape> shapeList = shapeCollector.showFigures();
        //
        Assert.assertEquals(2,shapeList.size());
    }
}
