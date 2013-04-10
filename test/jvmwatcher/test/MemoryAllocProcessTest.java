/**
 * 
 */
package jvmwatcher.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author miyake
 *
 */
public class MemoryAllocProcessTest
{
    MemoryAllocProcess  target = null;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
        this.target = new MemoryAllocProcess(10240, 4096, 5L);
    }

    /**
     * {@link jvmwatcher.test.MemoryAllocProcess#allocMemory()} のためのテスト・メソッド。
     */
    @Test
    public void testAllocMemory()
    {
        this.target.allocMemory();
        
        byte[][] val = this.target.getArrays();
        
        assertEquals(val.length, 4096);
        assertEquals(val[0].length, 10240);
        assertEquals(val[4095].length, 10240);
        
        this.target.freeMemory();

        val = this.target.getArrays();
        assertNull(val);
        
        this.target.allocMemory();
        this.target.freeMemory();
        this.target.allocMemory();
        this.target.freeMemory();
    }


}
