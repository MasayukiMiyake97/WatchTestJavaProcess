/**
 * 
 */
package jvmwatcher.test;

/**
 * @author miyake
 *
 */
public class TestJavaProcess
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int     elemSize = 0;
        int     maxElemNum = 0;
        long    watiTime = 0L;
        int     threadNum = 0;
        
        if (args.length == 4)
        {
            try
            {
                elemSize = Integer.parseInt(args[0]);
                maxElemNum = Integer.parseInt(args[1]);
                watiTime = Long.parseLong(args[2]);
                threadNum = Integer.parseInt(args[3]);
            }
            catch(Exception e)
            {
                System.err.println("param error. " + e.getMessage());
                System.exit(1);
            }
        }
        else if (args.length == 0)
        {
            elemSize = 1024;
            maxElemNum = 1024;
            watiTime = 10L;
            threadNum = 1;
        }
        else
        {
            System.err.println("param error.");
            System.exit(1);
        }

        // Process start.
        for (int cnt = 0; cnt < threadNum; cnt++)
        {
            MemoryAllocProcess  proc = new MemoryAllocProcess(elemSize, maxElemNum, watiTime);
            Thread              thread = new Thread(proc);
            
            thread.start();
        }
    }
}
