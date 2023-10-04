package bandeau;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bandeaulock extends Bandeau implements Lock{
    
    
    Lock l1 = new ReentrantLock();

}
