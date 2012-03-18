package de.foerther;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rfoerthe
 * Date: 02.02.12
 * Time: 23:42
 * To change this template use File | Settings | File Templates.
 */
public class ContextMenuPageTest {
    List mockedList;
    
    @Before
    public void setUp() throws Exception {
        mockedList = mock(List.class);
        when(mockedList.add("1")).thenReturn(true);
        when(mockedList.add("5")).thenReturn(false);


    }

    @Test
    public void testSimple() throws Exception {
        
        mockedList.clear();
        mockedList.clear();

        Assert.assertEquals(true, mockedList.add("1"));

        
        verify(mockedList, atLeast(2)).clear();

    }

    @After
    public void tearDown() throws Exception {

    }
}
