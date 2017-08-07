import main.java.task4.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 08.08.2017.
 */
public class Task4Test {

    @Test
    public void testAddWWithObjectArgument() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        boolean actual = objects.add(new Object());
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddWWithIndexAndObjectArgumentsInRange() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        objects.add(0, new Object());
    }

    @Test
    public void testAddAllElementsFromCollection() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        List<Object> javaListObjects = new ArrayList<>();
        javaListObjects.add(1);
        javaListObjects.add(1.3);
        javaListObjects.add(1f);
        javaListObjects.add(1L);
        javaListObjects.add("Test");
        boolean actual = objects.addAll(javaListObjects);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWWithIndexAndObjectArgumentsOutRange() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        objects.add(5, new Object());
    }

    @Test
    public void testContainsElementFromList() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);
        boolean actual = objects.contains(object);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsCollectionElementsFromList() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        List<Object> javaListObjects = new ArrayList<>();
        javaListObjects.add(1);
        javaListObjects.add(1.3);
        javaListObjects.add(1f);
        javaListObjects.add(1L);
        javaListObjects.add("Test");

        objects.add(1);
        objects.add(1.3);
        objects.add(1f);
        objects.add(1L);
        objects.add("Test");

        boolean actual = objects.containsAll(javaListObjects);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsElementOutOfList() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(new Object());
        boolean actual = objects.contains(object);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexOf(){
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);
        int actual = objects.indexOf(object);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetElementByIndex(){
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);

        Object anotherObject = new Object();
        objects.set(0, anotherObject);
        Object actual = objects.get(0);
        Object expected = anotherObject;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSize(){
        CustomArrayList<Object> objects = new CustomArrayList<>();
        objects.add(new Object());
        Assert.assertEquals(1, objects.size());
    }

    @Test
    public void testIsEmptyList(){
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Assert.assertEquals(true, objects.isEmpty());
    }

    @Test
    public void testGetSame() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);
        Object returned = objects.get(0);
        boolean actual = object.equals(returned);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexOutOfBounds() {
        CustomArrayList<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(new Object());
        Object returned = objects.get(5);
    }
}
