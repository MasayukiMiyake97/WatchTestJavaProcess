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
        
        this.target.freeMemory();
    }


}
