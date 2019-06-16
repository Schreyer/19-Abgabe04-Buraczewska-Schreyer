package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilities of your IDE

/**
 * This {@code StringQueue} class represents an array list of strings as queue.
 * It has several methods for adding, deleting or showing elements.
 */
public class StringQueue implements Queue {
    private List<String> elements = new ArrayList<String>();
    private int maxSize;

    /**
     * Size initialization
     * This method gets the the max size and sets the maximum size of the list.
     *
     * @param maxSize The maximum size of the queue
     */
    public StringQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adding method
     * This method adds a new element to the string list and returns an boolean witch indicates if the insertion was successful or not.
     *
     * @param obj The element to insert into queue
     * @return a boolean that represents the success or failure of the method.
     */
    //    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * Polling method
     * This method returns the first element of the queue and removes it afterwards. If the queue ia empty, null gets returned.
     *
     * @return a string that represents the first element of the queue.
     */
    //    @Override
    public String poll() {
        String element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Removing method
     * This method returns the first element of the queue and removes it afterward. If the queue is empty, a NoSuchElementException gets thrown.
     *
     * @return a string that represents the first element of the queue.
     * @throws NoSuchElementException If {@code element} is null
     */
    //    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    /**
     * Peek method
     * This method returns the first element of the queue. If the queue ia empty, null gets returned.
     *
     * @return a string that represents the first element of the queue.
     */
    //    @Override
    public String peek() {
        String element;
        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }
        return element;
    }

    /**
     * Element Method
     * This method returns the first element of the queue. If the queue is empty, a NoSuchElementException gets thrown.
     *
     * @return a string that represents the first element of the queue.
     * @throws NoSuchElementException If {@code element} is null
     */
    //    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}