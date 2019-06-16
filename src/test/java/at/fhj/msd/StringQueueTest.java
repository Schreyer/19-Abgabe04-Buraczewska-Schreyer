package at.fhj.msd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

/**
 * This class tests the StringQueue class.
 * @author Diana Buraczewska
 * @author Lukas Schreyer
 */
public class StringQueueTest {

    /**
     * this is a method to initialize of the StringQueue
     */
    StringQueue q;

    @Before
    public void setup() {
        q = new StringQueue(5);
    }

    /**
     * this method tests if the initialization was a success
     */
    @Test
    public void testInitialization() {
        Assert.assertTrue(q != null);
    }

    /**
     * this method tests if null is returned if the queue is empty by poll method
     */
    @Test
    public void testNullReturned() {
        Assert.assertNull(q.poll());
    }

    /**
     * this method tests if null is returned if the queue is not empty by poll
     * method
     */
    @Test
    public void testNotEmptPolly() {
        assertTrue(q.offer("Element"));
        Assert.assertEquals(("Element"), q.poll());
    }

    /**
     * this method tests if the first element of the queue is returned and then
     * removed if the queue is not empty by remove method
     */
    @Test
    public void testIfElementReturnedAndRemoved() {
        assertTrue(q.offer("Element"));
        Assert.assertEquals("Element", q.remove());
    }

    /**
     * tests if there is an exception thrown when the remove method is used but
     * there is no element in the queue by remove method
     */
    @Test(expected = NoSuchElementException.class)
    public void testElementException() {
        q.remove();
    }

    /**
     * this method tests if the peek method returns null if there is no element in
     * the queue by peek method
     */
    @Test
    public void testIfNullReturnedIfPeekEMpty() {
        Assert.assertNull(q.peek());
    }

    /**
     * this method tests if the peek method returns the first element if there are
     * elements in the queue by peek method
     */
    @Test
    public void testIfElementReturnedIfPeekNotEmpty() {
        assertTrue(q.offer("Element"));
        Assert.assertEquals("Element", q.poll());

    }

    /**
     * this method tests if one element is added to the queue with success by offer
     * method
     */
    @Test
    public void testOffer1() {
        q.offer("test1");
        Assert.assertTrue(q.offer("test1"));
    }

    /**
     * this method inserts 5 elements and then one more to the queue to check if the
     * method offer returns False
     */
    @Test
    public void testOffer2() {
        for (int i = 0; i < 5; i++) {
            q.offer("high");
        }
        Assert.assertFalse(q.offer("test2"));
    }

    /**
     * this method tests if a NoSuchElementException is thrown if the queue is empty
     * by element method
     */
    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException() {
        q.element();
    }

    /**
     * this method tests if the first element in the queue gets returned by element method
     */
    @Test
    public void testElementReturnFirst() {
        q.offer("first");
        assertEquals("first", q.element());
    }

}
