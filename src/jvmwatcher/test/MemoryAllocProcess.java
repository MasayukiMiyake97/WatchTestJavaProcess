/**
 *  Test of Memory allocate Class
 */
package jvmwatcher.test;

/**
 * Memoru allocate class
 * @author miyake
 *
 */
public class MemoryAllocProcess implements Runnable
{
    /**
     * first dimension max  
     */
    private     int         oneElementSize_ = 1024;
    /**
     * second dimension max
     */
    private     int         maxElementNum_ = 1024;
    /**
     * allocate wait time.(msec)
     */
    private     long        waitTime_ = 10L;
    
    private     byte[][]    allocArray_ = null;


    /**
     * Default Constructor
     */
    public MemoryAllocProcess()
    {
    }
    
    /**
     * Constructor
     * 
     * @param elemSize
     * @param maxElemNum
     * @param watiTime
     */
    public MemoryAllocProcess(int elemSize, int maxElemNum, long watiTime)
    {
        this.oneElementSize_ = elemSize;
        this.maxElementNum_ = maxElemNum;
        this.waitTime_ = watiTime;
    }
    
    /**
     * get allocate data
     * @return
     */
    public byte[][] getArrays()
    {
        return this.allocArray_;
    }

    
    /* (非 Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()
    {
        while (true)
        {
            // allocation memory
            this.allocMemory();
            // free memory
            this.freeMemory();
        }
    }
    
    /**
     * allocation memory array
     */
    protected void allocMemory()
    {
        byte    value = 0;

        // initialize
        this.allocArray_ = new byte[this.maxElementNum_][];
        // memory allocation loop
        for (int index = 0; index < this.maxElementNum_; index++)
        {
            this.allocArray_[index] = new byte[this.oneElementSize_];
            for (int pos = 0; pos < this.oneElementSize_; pos++)
            {
                this.allocArray_[index][pos] = value;
                value++;
            }
            // loop wait
            try
            {
                Thread.sleep(this.waitTime_);
            }
            catch (InterruptedException e)
            {
                System.err.println(e.toString());
                return;
            }
        }
    }

    /**
     * free memory
     */
    protected void freeMemory()
    {
        this.allocArray_ = null;
    }

}
