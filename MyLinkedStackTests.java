import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedStackTests {

    @Test
    public void Push_AddMultipleNodes_ShouldSuccessfullyAdd() {
        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();

        // Act
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("World");

        // Assert
        assertEquals("World", myLinkedStack.Peek());
    }

    @Test
    public void Push_AddNodeWhenListIsEmpty_ShouldSuccessfullyAdd() {
        String expected = "Hello6";

        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();

        // Act
        myLinkedStack.Push(expected);

        // Assert
        assertEquals(expected, myLinkedStack.Peek());
    }


    @Test
    public void Pop_WhenListIsEmpty_ShouldReturnNull() {
        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();

        // Assert
        assertEquals(null, myLinkedStack.Pop());
    }

    @Test
    public void Pop_WhenListHasValues_ShouldReturnElementThatIsRemoved() {
        // Arrange
        String expectedString = "hello";
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push(expectedString);

        // Act
        String removedElement = myLinkedStack.Pop();

        // Assert
        assertEquals(expectedString, removedElement);
        assertEquals(null, myLinkedStack.Peek());
    }
    
    @Test
    public void IsEmpty_WhenListIsEmpty_ShouldReturnTrue() {
        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();

        // Act
        boolean isEmpty = myLinkedStack.IsEmpty();

        // Assert
        assertTrue(isEmpty);

    }

    @Test
    public void IsEmpty_WhenListHasValues_ShouldReturnFalse() {
        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("World!");

        // Act
        boolean isEmpty = myLinkedStack.IsEmpty();

        // Assert
        assertFalse(isEmpty);

    }

    @Test
    public void Clear_WhenListHasValues_PeekShouldReturnNull() {
        // Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("World");

        // Act
        myLinkedStack.Clear();

        // Assert
        assertNull(myLinkedStack.Peek());
    }

}